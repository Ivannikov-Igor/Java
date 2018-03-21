package hw6;

import java.util.Scanner;

import HW5.Book;

//import java.io.BufferedReader;
//import java.io.IOException;
import java.util.ArrayList;
//import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Candy candy1 = new Candy("Crazy bee", "Candy", 5, 3, "jelly", 1.5);
		Candy candy2 = new Candy("Red poppy", "Candy", 10, 8, "chocolate", 3.45);
		Candy candy3 = new Candy("Cow", "Candy", 8, 6, "wafers", 2.75);
		// Candy[] candyes = { candy1, candy2, candy3 };

		Chocolate chocolate1 = new Chocolate("Milka", "Chocolate", 125, 150, "milky", 25);
		Chocolate chocolate2 = new Chocolate("Corona", "Chocolate", 100, 125, "black chocolate", 30);
		Chocolate chocolate3 = new Chocolate("Alpen Gold", "Chocolate", 150, 100, "with nuts", 35);
		// Chocolate[] chocolates = { chocolate1, chocolate2, chocolate3 };

		Marshmallow marshmallow1 = new Marshmallow("Jako", "Marshmallow", 50, 100, "white", 1);
		Marshmallow marshmallow2 = new Marshmallow("Penguin", "Marshmallow", 50, 100, "pink", 1);
		Marshmallow marshmallow3 = new Marshmallow("Croco", "Marshmallow", 50, 100, "with jelly", 1.5);
		// Marshmallow[] marshmallows = { marshmallow1, marshmallow2, marshmallow3 };

		Sweeties[] sweeties = { candy1, candy2, candy3, chocolate1, chocolate2, chocolate3, marshmallow1, marshmallow2,
				marshmallow3 };

		double weight = 0;

		System.out.println("Выберите сладости для подарка:");
		for (int i = 0; i < sweeties.length; i++) {
			Sweeties sweet = sweeties[i];
			System.out.println(i + " - " + sweet.getName());
			//System.out.println(sweet);
		}

		System.out.println("Введите '-1' чтобы " + "закончить сбор подарка" + "и посчитать вес.");

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				int sweetNumber = sc.nextInt();
				if (sweetNumber == -1) {
					System.out.println("Вес твоего подарка: " + weight + " грамм");
					break;
				} else if (0 <= sweetNumber) {
					System.out.println("Добавляю конфету " + "и считаем общий вес...");
					Sweeties sweet = sweeties[sweetNumber];
					System.out.println(sweet.getName() + " и ее вес " + sweet.getWeight() + " грамм");
					weight = weight + sweet.getWeight();
					System.out.println("Теперь вес подарка: " + weight + " грамм");
					// System.out.println(sweet);
				} else {
					continue;
				}
			} catch (Throwable t) {
				System.out.println("Не верный ввод!");
			}
		}
	}
}
