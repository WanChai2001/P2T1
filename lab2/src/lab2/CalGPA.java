package lab2;

import java.util.Scanner;

public class CalGPA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char letter;
		int i = 1;
		double grade = 0;
		
		while(i<=5) {
			System.out.printf("Enter Grade no.%d :",i);
			letter = sc.next().charAt(0);
			
			
			switch(letter) {
			case 'A':
				grade += 4;
				break;
			case 'B':
				grade += 3;
				break;
			case 'C':
				grade += 2;
				break;
			case 'D':
				grade += 1;
				break;
			case 'F':
				grade += 0;
			}
		 i = i + 1;
		}
	}
}
