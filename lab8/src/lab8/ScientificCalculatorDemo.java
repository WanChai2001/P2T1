package lab8;

import java.util.Scanner;

public class ScientificCalculatorDemo {
	
	public static void main(String[] args) {
		Scanner sr = new Scanner (System.in);
		System.out.println("Welcome to calculator program");
		char ch,operation;
		do {
			int x=0,y=0,a;
			double ga=0.0;
			Calculator cal = new Calculator();
			System.out.print("enter x : ");
			x = sr.nextInt();
			System.out.print("enter x : ");
			y = sr.nextInt();
			cal.setxy(x, y);
			
			System.out.print("select operation [+,-,*,/,c,p,m]: ");
			operation = sr.next().charAt(0);
			if(operation == '+'||operation == '-'||operation == '*'||operation == '/'||operation == 'p'||operation == 'm'){
					if(operation == '+') {
						ga=cal.add();
					}
					else if(operation == '-') {
						ga=cal.subtract();
					}
					else if(operation == '*') {
						ga=cal.multiply();
					}
					else if(operation == '/') {
						ga=cal.divide();
					}
					else if(operation == '%') {
						ga=cal.divide();
					}	
					else if(operation == 'p') {
						ga=cal.divide();
						System.out.println("Answer of" +x+""+operation+""+y+"="+ga);
					}	
					else if(operation == 'm') {
						ga=cal.divide();
						System.out.println("Answer of" +x+""+operation+""+y+"="+ga);
					}
					System.out.println("Answer of" +x+""+operation+""+y+"="+(int)ga);
					System.out.print("Do you want to continue [y/n]: ");
					ch = sr.next().charAt(0);
			}
			else {
				cal.Clear();	
			}
			System.out.println("Bye Bye----");
		}	
	}
}


