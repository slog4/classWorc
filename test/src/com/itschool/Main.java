package com.itschool;

import java.util.Scanner;

public class Main {
    private static Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
         //task2();
        //task3();
        //task1();
        //task4a();// смущает правильность решения
        //task4b();
        //task4c();
        //task4d();
//		task4e();
        task4f();
    }

    private static void task4f() {
        System.out.println("Enter x:");
        double x = scaner.nextDouble();
        System.out.println("Enter y");
        double y = scaner.nextDouble();
        if (x != 0) {
            System.out.println(Math.log(Math.abs((y - Math.sqrt(Math.abs(x))) * (x - (y / (x + (Math.pow(x, 2) / 4)))))));
        } else {
            System.out.println(" no solution");
        }
    }

    private static void task4e() {
        System.out.println("Enter x:");
        double x = scaner.nextDouble();
        System.out.println("Enter y");
        double y = scaner.nextDouble();
        if (x != 0) {
            if (x != 1 && y != 1) {
                System.out.println(Math.pow(1 - Math.tan(x), (1 / Math.tan(x))) + Math.cos(x - y));
            } else {
                System.out.println("No solutions");
            }
        } else {
            System.out.println("No solutions");
        }
    }

    private static void task4d() {
        System.out.println("Enter x:");
        double x = scaner.nextDouble();
        System.out.println(Math.sin(Math.sqrt(x + 1)) - Math.sin(Math.sqrt(x - 1)));
    }

    private static void task4c() {
        System.out.println("Enter x:");
        double x = scaner.nextDouble();
        System.out.println("Enter y");
        double y = scaner.nextDouble();
        if (y != -1 && x != -34) {
            System.out.println(((x + y) / (y + 1)) - ((x * y - 12) / (34 + x)));
        } else {
            System.out.println("There is no decision");
        }
    }

    private static void task4b() {
        System.out.println("Enter x:");
        double x = scaner.nextDouble();
        System.out.println(x - (Math.pow(x, 3) / 3) + (Math.pow(x, 5) / 5));
    }

    private static void task4a() {
        System.out.println("Enter a:");
        double a = scaner.nextDouble();
        System.out.println("Enter b:");
        double b = scaner.nextDouble();
        System.out.println("Enter c:");
        double c = scaner.nextDouble();
        if (b != 0) {
            if (a != 0) {
                System.out.println(((b + Math.sqrt(b * b + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
            } else {
                System.out.println("На ноль делить нельзя");
            }
        } else {
            System.out.println("Infinity");
        }
    }

    private static void task1() {
        int a = scaner.nextInt();
        int b = scaner.nextInt();
        int c = scaner.nextInt();
        double x1, x2;

        if (a != 0) {
            double d = b * b - (4 * a * c);
            if (d > 0) {
                x1 = ((-b + (Math.sqrt(d))) / (2 * a));
                x2 = ((-b - (Math.sqrt(d))) / (2 * a));
                System.out.println("x1= " + x1 + ", x2 = " + x2);
            } else if (d == 0) {
                x1 = -b / (2 * a);
                System.out.println("x = " + x1);
            } else {
                System.out.println("No solutions");
            }
        } else {
            System.out.println("No solutions");
        }
    }

    private static void task3() {
        // сторона квадрата по периметру
        double perimetr = scaner.nextDouble();
        System.out.println("сторона квадрата равна " + (perimetr / 4));
    }

    private static void task2() {
        int a;
        int b;
        a = (int) (Math.random() * 10) + 1;
        b = (int) (Math.random() * 10) + 1;
        System.out.println("Периметр равен " + (2 * a + 2 * b));
        System.out.println("Площадь равна " + a * b);
    }
}
