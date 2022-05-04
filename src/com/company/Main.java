package com.company;

import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
            System.out.println("ВВедите выражение");
            Scanner sc = new Scanner(System.in);
            int k;
            int m;
            String str;
            do {
                String input = sc.next();
                String[] strings = input.split("\\W");
                String[] operator = input.split("\\w");
                try {
                    k = Integer.parseInt(strings[0]);
                    m = Integer.parseInt(strings[1]);
                    str = operator[operator.length - 1];
                    System.out.println("Результат = " + operation(k, m, str));
                } catch (Exception e) {
                    System.out.println("Ошибка ввода данных");
                }
            } while (true);
        }

        private static double operation(double k, double m, String str) {
            if ("*".equals(str)) {
                return k * m;
            } else if ("+".equals(str)) {
                return k + m;
            } else if ("-".equals(str)) {
                return k - m;
            } else if ("/".equals(str)) {
                return k / m;
            } else if ("^".equals(str)) {
                return (int) Math.pow(k, m);
            } else if ("%".equals(str)) {
                return k % m;
            }
            return 0;
        }
    }


