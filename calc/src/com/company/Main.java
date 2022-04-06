package com.company;

import java.util.Scanner;

public class Main {
    /** Метод main
     * Объект Scanner
     * Ввод переменной nums
     * Оъект класса Calculator
     * Вывод на консоль
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.nextLine();
        Calculator calculator = new Calculator(nums);
        System.out.println(nums + " = " + calculator.calculate());
    }
    /**
     * Класс описывающий калькулятор
     * @author Fomin Nikita
     * @version 2.0
     * */

    public static class Calculator {
        /** Поле для поиска пробелов в выражении */
        String[] space;
        /** Поле индентификатор */
        int indexspace;
        /**
         * Метод для установки значений полей
         * @param nums символы до пробела
         * indexspace индентификатор
         * */
        public Calculator(String nums) {
            this.space = nums.split(" ");
            this.indexspace = 0;
        }
        /** Метод calculate
         * Ключвое слово try используется для ообработки исключительных операций
         * К переменной first присваивается результат метода calculate2
         * В методе указываются условия при которых будут выполняться операции сложения и вычитания
         * К переменной second присваивается результат метода calculate2
         * @return first
         * */
        public double calculate() {
            try {
                double first = calculate2();
                while (indexspace < space.length) {
                    String operator = space[indexspace];
                    if (!operator.equals("+") && !operator.equals("-")) {

                        return 0;
                    } else {
                        indexspace++;
                    }
                    double second = calculate2();
                    if (operator.equals("+")) {
                        first += second;
                    } else {
                        first -= second;
                    }
                }
                return first;

            } catch (Exception e) {
                System.out.println("Некорректный ввод! ");
            }
            return 0;
        }
        /** Метод calculate2
         * К переменной first присваивается результат метода calculate3
         * В методе указываются условия при которых будут выполняться операции умножения и деления
         * К переменной second присваивается результат метода calculate3
         * @return first
         * */
        public double calculate2() {

            double first = calculate3();
            while (indexspace < space.length) {
                String operator = space[indexspace];

                if (!operator.equals("*") && !operator.equals("/")) {
                    break;
                } else {
                    indexspace++;
                }

                double second = calculate3();
                if (operator.equals("*")) {
                    first *= second;
                } else {
                    first /= second;
                }
            }
            return first;
        }
        /** Метод calculate2
         К переменной first присваивается значение первого оператора
         * В методе указываются условия при которых будут выполняться операции выделения остатка и возведения в степень
         К переменной second присваивается значение первого оператора
         * @return first
         * */        public double calculate3() {
            double first = Double.parseDouble(space[indexspace++]);
            while (indexspace < space.length) {
                String operator = space[indexspace];
                if (!operator.equals("%") && !operator.equals("^")){
                    break;
                }else {
                    indexspace++;
                }
                double second = Double.parseDouble(space[indexspace++]);
                if (operator.equals("%")) {
                    first %= second;
                } else {
                    first = Math.pow(first,second);
                }
            }
            return first;
        }

    }
}
