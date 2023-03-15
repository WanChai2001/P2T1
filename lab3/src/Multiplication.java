import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ;
		char process = 'm' ;
		while (process == 'm') {
		System.out.print("Number [2 to 12] : ");
		n = sc.nextInt();
		while (n >12 || n < 2) {
			System.out.println("Invalid data, please try again");
			System.out.print("Number [2 to 12] : ");
			n = sc.nextInt();
		}
		for(int i = 1;i<=12;i++) {
			System.out.printf("%d x %d = %d" ,n ,i ,n);
			System.out.println();
		}
		System.out.printf("Do you want to continue [y/n] :");
		process = sc.next().charAt(0);	
		}
		System.out.print("Byr Bue???");
	}

}
