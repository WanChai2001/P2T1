import java.util.Scanner;

public class MaxMinMean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n1, n2, n3, i = 0, sum = 0;
		System.out.print("Age of no 1 : "); 
                n1 = sc.nextInt(); 
		System.out.print("Age of no 2 : ");
                n2 = sc.nextInt(); 
		System.out.print("Age of no 3 : ");
                n3 = sc.nextInt(); 
              
     
        int max = n1;
        if (n2 > max) { 
        	max = n2; 
        }
        if (n3 > max) { 
        	max = n3; 
        }
        int min = n1; 
		if (n2 < min) { 
			min = n2; 
		}
		if (n3 < min) { 
			min = n3; 
		}
		
		System.out.println("Maximum : " +max);
		System.out.println("Minimum : " +min);
		System.out.println("Summary = "+(n1+n2+n3));
		System.out.println("Average  = "+(n1+n2+n3)/3);
	
	}

}


