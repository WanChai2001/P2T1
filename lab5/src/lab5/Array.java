package lab5;

import java.util.Scanner;

public class Array {
	public static void array(int[] arr) {
		int sum = 0;
		System.out.print("Numbers Array : ");
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.print(""+arr[i]);
		}
		System.out.println();
		System.out.print("Sum Array : "+arr[0]);
		for(int i = 1; i < arr.length;i++) {
			System.out.print("+"+arr[i]);
		}
		System.out.print(" = "+sum);
	}
	public static int[] mulArray (int[] arr1,int[] arr2){
		int[] sr = new int[10];
		int n = arr2.length-1;
		for(int i = 0; i < arr1.length;i++) {
			sr[i] = arr1[i]*arr2[n];
			n-=1;
		}
		return sr;
		
	}
	public static int[] sc (int a) {
		Scanner sc = new Scanner(System.in);
		int[] list = new int[a];
		System.out.print("Enter 10 numbers : ");
		for(int i = 0; i < a ; i++) {
			list[i] = sc.nextInt();
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] t = sc(10);
		int[] c = sc(10);
		int[] s = mulArray(t,c);
		array(s);
	}	
}
