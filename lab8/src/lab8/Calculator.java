package lab8;

import java.util.Scanner;

public class Calculator {

	public int x;
	public int y;
	
	public Calculator() {
		
	}
	public void setxy(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void Clear() {
		this.x = 0;
		this.y = 0;
	}
	public int add() {
		int ga =0;
		ga = this.x+this.y;
		return ga;
	}
	public int subtract() {
		int ga =0;
		ga = this.x-this.y;
		return ga;
		
	}
	public int multiply() {
		int ga =0;
		ga = this.x*this.y;
		return ga;
		
	}
	public int divide() {
		int ga =0;
		ga = this.x/this.y;
		return ga;
		

	}
}