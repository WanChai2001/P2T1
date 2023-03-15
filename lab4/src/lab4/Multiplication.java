package lab4;

import java.util.Scanner;

public class Multiplication {

	public static void displayMul(int n) {
		for(int i=1;i<=12;i++) {
			System.out.println(n +"*"+ i +"="+ n*i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mu ;
		char process = 'm' ;
		while (process == 'm') {
		System.out.print("Number [2 to 12] : ");
		mu = sc.nextInt();
		while (mu > 12 || mu < 2) {
			System.out.println("Invalid data, please try again");
			System.out.print("Number [2 to 12] : ");
			mu = sc.nextInt();
		
		}
			displayMul(mu);
			System.out.print("Do you want to continue [y/n] :");
			process = sc.next().charAt(0);	
		}
		System.out.print("Byr Bue???");
	}

}

