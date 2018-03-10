import java.util.Scanner;
public class circle {
	public static void main(String[] args) {
		System.out.println("Вычислим длинну окружности.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите радиус в см:");
		double r = sc.nextInt();
		double p = 3.14;
		double c = 2*p*r;	
		System.out.println(c);
		sc.close();
	}
}
