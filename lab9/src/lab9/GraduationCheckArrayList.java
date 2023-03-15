package lab9; 
import java.util.ArrayList;
	

	public class GraduationCheckArrayList {
		public static void main(String[] args) {

			int keep1 = 0, keep2 = 0; 
			ArrayList<Course> mix = new ArrayList<Course>();
			mix.add(new GenEdCourse ("GEN61-127",3,"C", "School of liberal Arts")); 
			mix.add(new GenEdCourse ("GEN61-152",4,"D", "School of Science")); 
			mix.add(new GenEdCourse ("GEN61-127",2,"C+", "School of Science")); 
			mix.add(new MajorCourse("SWE62-123",2,"W",1));
			mix.add(new MajorCourse ("SWE62-205",3,"F",2)); 
			mix.add(new MajorCourse ("SWE-214",3,"C+",2)); 
			mix.add(new MajorCourse ("SWE-215",2,"F",2));
			for(int i= 0;i< 3; i++) {
				if(mix.get(i).getGrade() != "W" && mix.get(i).getGrade() != "F")
					keep1 += 1;
			}
			for(int i= 3;i< mix.size(); i++) {
				if(mix.get(i).getGrade() != "W" && mix.get(i).getGrade() != "F")
					keep2 += 1;
			}
			System.out.println("General Education Course : ");
			displayGraduation (mix); 
			System.out.printf("Total enroll 7 courses; Pass %d courses\n", (keep1+keep2));
			double a = calGPA(mix);
			System.out.printf("GPA = %.2f", a);
		}
	public static void displayGraduation (ArrayList<Course> 0) { 
		for(int i= 0;i< o.size(); i++) { 
			if(o.get(i) instanceof GenEdCourse)
				System.out.printf("%s\n",(((GenEdCourse).get(i)).toString());
			}
			System.out.println("Enroll: 3 Pass : 3"); 
			System.out.println("========================================'); 
			for(int i= 0; i< o.size(); i++) { 
				if(o.get(i) instanceof MajorCourse)
					System.out.printf("%s\n", (((MajorCourse)o.get(i)).toString()));
			}
			System.out.println("Major Course : "); 
			System.out.println("Enroll: 4 Pass : 1");
			System.out.println("========================================");
			}

	public static double calGPA(ArrayList<Course> 0) {
		double gpa=0.0 , sumG= 0.0, sumU= 0.0, unit, num; 
		for(int i= 0; i< o.size();i++) {
			if (o.get(i).getGrade().equals("A"))
				num = 4; 
			else if (o.get(i).getGrade().equals("B+"))
				num = 3.5; 
			else if (o.get(i).getGrade().equals("B"))
				num = 3; 
			else if (o.get(i).getGrade().equals("C+"))
				num = 2.5; 
			else if (o.get(i).getGrade().equals("C"))
				num = 2; 
			else if (o.get(i).getGrade().equals("D+"))
				num = 1.5; 
			else if (o.get(i).getGrade().equals("D"))
				num = 1; 
			else if (o.get(i).getGrade().equals("F"))
				num = 0; 
			else
				continue; 
			unit =o.get(i).getUnit();
			sumG += num*unit; 
				sumu += unit;
		}
		gpa = sumG/ sumU; 
		return gpa;
	}
}
