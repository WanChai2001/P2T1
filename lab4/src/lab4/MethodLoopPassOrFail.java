package lab4;

import java.util.Scanner;

public class MethodLoopPassOrFail {
	
	public static boolean PassOrFail(int s1,int s2,int s3) {
		if(s1 > 50 && s2 > 50 && s3 > 50) return true ;
		else return false ;
	}
		
	public static char getgrade(double avg) {
		if (avg >= 86) return 'A';
		else if (avg >= 66) return 'B';
		else return 'c';
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		double mean ;
		char gr = 'm';
		
		while (gr == 'm') {
			System.out.print("Enter Scorse 1 (1-100) : ");
			n1 = sc.nextInt();
			System.out.print("Enter Scorse 2 (1-100) : ");
			n2 = sc.nextInt();
			System.out.print("Enter Scorse 3 (1-100) : ");
			n3 = sc.nextInt();
			if (PassOrFail( n1, n2, n3)) {
				mean = (n1+n2+n3) /3;
				System.out.println("Mean = " +mean);
				System.out.println("Grad = " + getgrade(mean));
			}
		}
		
	}
}
