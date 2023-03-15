import java.util.Scanner;

public class LoopQueenContest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1, n = 1;
		double highest = 0 ,feet ,inch ,total;
		char process = 'm' ,unit;
		while (process == 'm') {
			System.out.printf("No.%d Enter height : ",i);
			unit = sc.next().charAt(0);
			if (unit == 'm') {
				feet = sc.nextDouble();
				inch = sc.nextDouble();
				total = ((feet*12)+inch)*2.54;
			}else {
				total = sc.nextDouble();
			}
			System.out.printf("NO.%d %.2f cm." ,i ,total);
			System.out.println();
			if (i==1) {
				highest = total;
				n = 1;
			}
			else {
				if(total>total);
				highest=total;
				n = i;
			}
		}
		System.out.printf("No.%d tallesa ",n);
		System.out.println();
		System.out.print("Bye Bye?????");
	}
		
		

	}


