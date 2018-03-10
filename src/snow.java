import java.util.Scanner;

public class snow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите высоту лесенки");
		int x = sc.nextInt();
		int y = 1;
		int z;
		for (z = 0; y <= 2 *  x;) {
			if ((z < y) && (y <= x)) {
				System.out.print("*");
				z++;
			} else if ((z < (2 * x - y)) && (y > x)) {
				System.out.print("*");
				z++;
			} else {
				System.out.println("");
				y++;
				z = 0;
				sc.close();
			}
		}
	}
}
