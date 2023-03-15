package lab5;

import java.util.Scanner;

public class Grade {
	public static char sr(int n) {
		char sr = 'x';
			if(n >= 80) {
				sr = 'A';
			}else if (n >= 70) {
				sr = 'B';
			}else if (n >= 60) {
				sr = 'C';
			}else if (n >= 50) {
				sr = 'D';
			}else 
				sr = 'B';
			return sr ;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] list = new int[5][4];
		int sum = 0;
		for(int i = 0; i < list.length;i++) {
			System.out.print("Input" +(i+1)+" Score : " );
			for(int a = 0; a < list[i].length;a++);{
				list[i][a] = sc.nextInt();
			}
		}
		System.out.print("Display Grade");
		System.out.println();
		System.out.print("No.  LAB (30)  Attend (5)   Mid (30)   Final (35)  Total(100)  Grade");
		System.out.println();
		for(int i = 0;i < list.length;i++) {
			System.out.print(i+1);
			for(int a = 0; a < list.length; i++) {
				System.out.print("         "+list[i][a]);
				sum += list [i][a];
			}
			System.out.print("              "+sum);
			System.out.print("              "+sr(sum));
		}
	}
}
