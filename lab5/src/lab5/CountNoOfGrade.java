package lab5;

import java.util.Scanner;

public class CountNoOfGrade {
	public static void Method(int n) {
		for(int i  = 0; i < n ; i++) {
			System.out.print("*");
		}
	}
	public static int check(char grade) {
		int check = 0 ;
		switch(grade) {
		case 'A':
			check = 0;
			break;
		case 'B':
			check = 1;
			break;
		case 'C':
			check = 2;
			break;
		case 'D':
			check = 3;
			break;
		default:
			check = 4;
		}
		return check;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of student : ");
		int n = sc.nextInt();
		char grade = 'x';
		int check = 0;
		int[] keep = {0,0,0,0,0};
		for(int i = 0; i < n ;i++) {
			System.out.print("Enter grade of student  "+(i+1)+" : ");
			grade = sc.next().charAt(0);
			check = check(grade);
			keep[check]+=1;
		}
		System.out.println("Grade Summary");
		System.out.print(" A ");
		Method(keep[0]);
		System.out.println("");
		System.out.print(" B ");
		Method(keep[1]);
		System.out.println("");
		System.out.print(" C ");
		Method(keep[2]);
		System.out.println("");
		System.out.print(" D ");
		Method(keep[3]);
		System.out.println("");
		System.out.print(" F ");
		Method(keep[4]);
		
		}
	}
	
