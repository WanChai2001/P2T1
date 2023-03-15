package lab2;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a,b,c;
		
		a = sn.nextDouble();
		b = sn.nextDouble();
		c = sn.nextDouble();
		
		double d = (0.5 *(a+b+c));
		double area = Math.sqrt(d*(d-a)*(d-b)*(d-c));
		System.out.printf("Area = %.6f",area);

	}

}
