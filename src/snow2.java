import java.util.Scanner;

public class snow2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите высоту лесенки:");
		int x = sc.nextInt();
		for (int z = 1; x != (z - 1); z++) {
			// System.out.println("*");
			// z++;
			System.out.println(new String(new char[z]).replace("\0", "*"));
		}
		for (int z = x - 1; z != 0; --z) {
			System.out.println(new String(new char[z]).replace("\0", "*"));
		}
	}
}

// 3 != 1-1 = 0
// 3 != 2-1 = 1
// 3 != 3-1 = 2
// 3 != 4-1 = 3
// 2 = 0
// 1 = 0
// 0 = 0
