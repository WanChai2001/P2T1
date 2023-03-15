import java.util.Scanner;

public class SumOfMoney {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		double n = 1;
		while (n > 0) {
			System.out.print("Enter numbers : ");
			n = input.nextDouble();
			if (n > 0) {
			System.out.printf("%f nearest Integer %d",n,Math.round(n));
			System.out.println();
			sum+=Math.round(n);
			
			}		
		}
		System.out.print("Summary : "+sum);
	}

}
