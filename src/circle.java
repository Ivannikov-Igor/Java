import java.util.Scanner;
public class circle {
	public static void main(String[] args) {
		System.out.println("�������� ������ ����������.");
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ � ��:");
		double r = sc.nextInt();
		double p = 3.14;
		double c = 2*p*r;	
		System.out.println(c);
		sc.close();
	}
}
