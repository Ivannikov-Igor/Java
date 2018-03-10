//import java.util.Scanner;
public class Simple {
	public static void main(String[] args) {
		int n = 100; 
		for (int i = 2; i < n; i++) { 
			boolean a = true;
			int q = (int) Math.sqrt(i);
			for (int j = 2; j <= q; j++) {
				if ((i % j) == 0) {
					a = false;
					break;
				}
			}
			if (a) {
				System.out.print(i + " ");
			}
		}
	}
}

//int = 2 условие и меньше н, с шагом в одну еденицу
//а = правда
//q корень из и
//ж =2, ж меньше равно кью, с шагом в одну еденицу
//если и разделить на ж == 0
//а = ложь
//пауза
//если правда то 
//вывести и
