package lab5;

import java.util.Scanner;

public class DisplayTemp {
	
		public static int Maxthod(int[] arr) {
			int max = 0;
			for(int i = 0 ; i < arr.length ;i++) {
				if(arr[i] > max) {
					
				}
			}
			return max ; 
		}
		public static int Minthod(int[] arr) {
			int min = 100 ;
			for(int i = 0 ;i < arr.length ; i++) {
				min = arr[i];
			}
		return min ;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			final int size = 12 ;
			int max , min;
			int[] n = new int[size];
			String[] month ={" February", "March", "April", "May", 
			                 "June", "July", "August" ,"September", "October",
			                 "November", "December"};
			
			
			for(int i = 0; i < n.length; i++) {
				System.out.printf("Please enter temp of %s : ",month[i]);
				n[i] = sc.nextInt();
			}
			int Maxpoint = 0,Minpoint = 0;
			max =  Minthod(n);
			min =  Minthod(n);
			for(int i = 0; i < n.length ; i++) {
				if(max == n[i]) {
					Maxpoint = i ;
				}
				if(min == n[i]) {
					Minpoint = i;
				}
			}
			System.out.printf("Maxpoint temp is %d is and %d is a temp of %s \n",max,max,month[Maxpoint]);
			System.out.printf("Maxpoint temp is %d is and %d is a temp of %s \n",min,min,month[Minpoint]);
		}
	}