package lab5;

import java.util.Scanner;

public class FindAboveMean {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n , cunt = 0;
		double avg , sum = 0.0 ;
		char cr = 'y';
		while(cr == 'y') {
		System.out.printf("Enter n : ");
		n = sc.nextInt();
		
		int[] array = new int [n];
		System.out.printf("Enter %d numbers : ",n );
		for(int i = 0 ; i < n ; i++){
			array[i] = sc.nextInt();
			sum = sum + array[i];
		}
		avg = sum/n;
		System.out.printf("Mean : %.2f \n",avg);
		
		int [] abovemean = new int[array.length];
		for(int i = 0; i < array.length ; i++) {
			if(avg < array[i]) {
				abovemean[cunt] = array[i];
				cunt = cunt + 1;
			}
		}
		System.out.printf("No. above mean : %d as : ",cunt);
		for(int i = 0 ; i  < cunt ; i++) {
			System.out.printf("%d",abovemean[i]);
		}
		System.out.printf("Do you want to continue [y/n]:");
		cr = sc.next().charAt(0);
		}
	}
}