import java.util.Scanner;
public class Scan {
	public static void main(String[] args) {		  
		Scanner sc = new Scanner(System.in);
		System.out.println ("������� �����: ");
		int num = sc.nextInt();
		String text = Integer.toString(num); // ����������� �������� ����� � ������
		int i = 0; // ��������� ���������� i
		int length = Integer.toString(num).length();// ��������� ���������� length
		
		while(i < length) { // �������� ������� ������� ��� ������� ������ ������ ���� ������ 0
			char result = text.charAt(i++); // ��������� ���������� ���� char, ��� ������ ��� ���������� �� �������
			System.out.println(result);
			}
			sc.close();
			 
		}
}