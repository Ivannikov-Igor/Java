	import java.util.Scanner;

	public class Square {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("������� ������� - �");
	        int a = sc.nextInt();
	        System.out.println("������� ������� - b");
	        int b = sc.nextInt();

	        String [][] sqr = new String[a][b];
	        for (int i = 0; i < a; i++){
	            for (int j = 0; j < b ; j++){
	                sqr[i][j] = "+";
	            }
	        }
	        for (int i = 1; i < a-1; i++){
	            for (int j = 1; j < b-1 ; j++){
	                sqr[i][j] = " ";
	            }
	        }
	        for (int i = 0; i < a; i++){
	            for (int j = 0; j < b ; j++){
	                System.out.print(sqr[i][j]);
	            }
	            System.out.println();
	        }
	    }
	}

