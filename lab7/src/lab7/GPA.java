package lab7;
import java.util.Scanner;

public class GPA {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Course[] mixandmash = new Course[7];
		int i;
		for(i =0; i <mixandmash.length; i++) {
			System.out.print("Enter information of course no. "+(i+1)+": ");
			String courseID =sn.next();
			int unit = sn.nextInt();
			String grade = sn.next();
			mixandmash[i] = new Course(courseID,unit,grade);
		}
		pprint(mixandmash);
		findGpa(mixandmash);
	}
	
	public static void pprint(Course[] mixandmash) {
		System.out.println("You enroll 7 coures: ");
		System.out.print("CourseID      Unit     Grade\n");
		for(int i=0;i <mixandmash.length; i++)
			System.out.printf("%s      %d      %s\n",mixandmash[i].courseID,mixandmash[i].unit,mixandmash[i].grade);
	}

	public static void findGpa(Course[] mixandmash) {
		double n, gpa =0.0, sumG =0.0, unit, sumU =0.0;
		for (int i=0;i <mixandmash.length; i++) {
			if (mixandmash[i].getGrade().equals("A"))
				n =4.0;
			else if (mixandmash[i].getGrade().equals("B+"))
				n =3.5;
			else if (mixandmash[i].getGrade().equals("B"))
				n =3.0;
			else if (mixandmash[i].getGrade().equals("C+"))
				n =2.5;
			else if (mixandmash[i].getGrade().equals("C"))
				n =2.0;
			else if (mixandmash[i].getGrade().equals("D+"))
				n =1.5;
			else if (mixandmash[i].getGrade().equals("D"))
				n =1.0;
			else if (mixandmash[i].getGrade().equals("F"))
				n =0;
			else
				continue;
			unit = mixandmash[i].getUnit();
			sumG = sumG +(n*unit);
			sumU = sumU +mixandmash[i].getUnit();
		}
		gpa =sumG/sumU;
		System.out.printf("\nGPA = %.2f",gpa);	
	}	

}
