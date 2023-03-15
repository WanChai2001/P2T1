package lab4;

import java.util.Scanner;

public class MethodLoopQueenContest {
	public static double Foot2(int foot,int inch) {
		double cm;
		cm = (foot*12)+ inch;
		cm = cm * 2.54;
		return cm ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch,yn = 'm';
		double sum = 0,max = 0;
		int tall = 0, i = 0 ,f,n,cm;
		do {
			i = i + 1;
			System.out.print("No. "+i+"Enter height : ");
			ch = sc.next().charAt(0);
			if (ch == 'm') {
				f = sc.nextInt();
				n = sc.nextInt();
				sum = Foot2(f,n);
			}
			else if (ch == 'c') {
				cm = sc.nextInt();
				sum = cm;
			}
			else {
				System.out.println("Error");
			{	
			if (sum > max) {
					max = sum;
					tall = i;
			}
			System.out.println("No." + i +" is " + sum + " cm.");
			System.out.print("Do you want to continue [y/n] : ");
			yn = sc.next().charAt(0);
		}while(yn == 'm');
		System.out.println("No. "+ tall +" is tallest");
		System.out.println("Bye Bye !!!");	
			}			
		}
}
}