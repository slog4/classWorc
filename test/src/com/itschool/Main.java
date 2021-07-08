package com.itschool;

import java.util.Scanner;

public class Main {
	private static Scanner scaner = new Scanner(System.in);

	public static void main(String[] args) {
		// task2();
		//task3();
		//task1();
		double a = scaner.nextDouble();
		double b = scaner.nextDouble();
		double c = scaner.nextDouble();
		if (a != 0){


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
		int perimetr = scaner.nextInt();
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
