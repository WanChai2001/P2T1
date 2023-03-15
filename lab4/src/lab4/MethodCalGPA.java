package lab4;

import java.util.Scanner;

public class MethodCalGPA {
	
	public static char grading(int n) {
		char gr ;
		if(n >= 80) gr = 'A';
		else if (n >= 70) gr = 'B';
		else if (n >= 60) gr = 'C';
		else if (n >= 50) gr = 'D';
		else gr = 'B';
		return gr ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double gpa = 0,unit,sumunit = 0;
		char gr ;
		int n ,num , score ,grad;
		System.out.print("Enter number of subject : ");
		num = sc.nextInt();
		for (int i = 1;i<=num;i++) {
			System.out.print("Enter Scorse of sudject : ");
			score = sc.nextInt();
			System.out.print("Enter course unit : ");
			unit = sc.nextDouble();
			gr = grading(score);
			System.out.println("Grade : "+ gr);
			if(gr == 'A') grad = 4;
			else if (gr == 'B') grad = 3;
			else if (gr == 'C') grad = 2;
			else if (gr == 'D') grad = 1;
			else grad = 0;
			sumunit = sumunit + unit;
			gpa = gpa + (grad*unit);
			
		}
		gpa = gpa/sumunit;
		System.out.printf("GPA : %.2f",gpa);

	}

}
