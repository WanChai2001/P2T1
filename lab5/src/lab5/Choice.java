package lab5;

import java.util.Scanner;

public class Choice {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int[]key = {4,2,4,3,3,4,1,5,1,4};
		int[][] list = new int[8][10];
		int score = 0;
		for(int i = 0;i < list.length;i++) {
			System.out.print("Student"+(i+1)+"Answers : ");
			for(int j = 0; j < list[i].length;j++);{
				list[i][j] = sr.nextInt();
			}
		System.out.println("Result : ");
		for(int i = 0;i < list.length;i++) {
			System.out.print("Student"+(i+1)+"Answers : ");
				for(int j = 0; j < list[i].length;j++);{
					if(list[i][j] == key[j]) {
						score +=1;
					}
				}
			System.out.print(score);
			score = 0;
			System.out.println();
	}
}