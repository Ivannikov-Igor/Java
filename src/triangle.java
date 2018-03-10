import java.util.Scanner;
public class triangle {
	public static void main(String[] args) {
		System.out.println("Посчитаем площадь треугольника.");
		Scanner sc = new Scanner(System.in);
		System.out.println ("Введите длинну первой стороны в см:");
		int num1 = sc.nextInt();
		System.out.println ("Введите длинну второй стороны в см:");
		int num2 = sc.nextInt();
		System.out.println ("Введите длинну третьей стороны в см:");
		int num3 = sc.nextInt();
		double p = (num1+num2+num3)/2;
		double b = (p * (p - num1) * (p - num2) * (p - num3));
		double s = Math.sqrt(b);// Площадь треугольника по формуле Герона равна корню из произведения разностей полупериметра треугольника (p) и каждой из его сторон
		System.out.println("Площадь треугольника: " + s + " квадратных сантиметров.");
		sc.close();	
		}

	}
