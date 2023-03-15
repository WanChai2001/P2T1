package lab2;

import java.util.Scanner;

public class Fizzbuzz {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n :");
		n = sc.nextInt();
		if(n%3==0 && n%5==0) {
			System.out.print("FizzBuzz");
		}
		else if(n%3==0) {
			System.out.print("Fizz");
		}
		else if(n%5==0) {
			System.out.print("Buzz");
		}
		
	}

}
