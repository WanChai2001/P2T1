package lab2;

import java.util.Scanner;

public class QueenContest {

	public static void main(String[] args) {
		int integer;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Integer : ");
		integer = input.nextInt();
		if (integer>=10) {
			System.out.printf("Character %c",(char)integer+55);
		}
		else {
			System.out.println(integer);
		}

	}

}
