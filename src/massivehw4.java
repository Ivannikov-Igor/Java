
public class massivehw4 {
	public static void main(String[] args) {
		int[] mas1 = new int[50];
		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = (int) Math.round((Math.random() * 100));
		}
		int max = mas1[0];
		for (int i = 0; i < mas1.length; i++)
			if (mas1[i] > max)
				max = mas1[i];
		System.out.print(+max);
	}
}
