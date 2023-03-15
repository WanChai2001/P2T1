import java.util.Scanner;

public class NPerLine {

	public static void main(String[] args) {
		int n1, n2, col, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1 : "); 
        n1 = sc.nextInt(); 
        System.out.print("Enter n2 : ");
        n2 = sc.nextInt(); 
        System.out.print("Enter col : ");
        col = sc.nextInt(); 
        int start = (n1) ,end = (n2);
        for (i = start ; i <= end; i++){
        	System.out.print(i+" ");
        	if (i %col == 4)
        		System.out.println();
        }
        System.out.println();
	}
}
