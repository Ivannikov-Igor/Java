import java.util.Scanner;
public class Scan {
	public static void main(String[] args) {		  
		Scanner sc = new Scanner(System.in);
		System.out.println ("Введите число: ");
		int num = sc.nextInt();
		String text = Integer.toString(num); // преобразует введеное число в строку
		int i = 0; // создается переменная i
		int length = Integer.toString(num).length();// создается переменная length
		
		while(i < length) { // оператор создает условие при котором длинна должна быть больше 0
			char result = text.charAt(i++); // создается переменная типа char, что дальше тут происходит не понятно
			System.out.println(result);
			}
			sc.close();
			 
		}
}