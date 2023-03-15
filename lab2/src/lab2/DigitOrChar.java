package lab2;

import java.util.Scanner;

public class DigitOrChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.printf("Enter intager : ");
		n = sc.nextInt();
		
		if(n > 9 && n <= 35) {
			System.out.printf("Character %c",(char)(n+55));	
		}
		else {
			System.out.print(n);
		}
	}

}
