import java.util.Scanner;
public class triangle {
	public static void main(String[] args) {
		System.out.println("��������� ������� ������������.");
		Scanner sc = new Scanner(System.in);
		System.out.println ("������� ������ ������ ������� � ��:");
		int num1 = sc.nextInt();
		System.out.println ("������� ������ ������ ������� � ��:");
		int num2 = sc.nextInt();
		System.out.println ("������� ������ ������� ������� � ��:");
		int num3 = sc.nextInt();
		double p = (num1+num2+num3)/2;
		double b = (p * (p - num1) * (p - num2) * (p - num3));
		double s = Math.sqrt(b);// ������� ������������ �� ������� ������ ����� ����� �� ������������ ��������� ������������� ������������ (p) � ������ �� ��� ������
		System.out.println("������� ������������: " + s + " ���������� �����������.");
		sc.close();	
		}

	}
