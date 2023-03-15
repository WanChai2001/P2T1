package lab8;


public class GraduationCheck {
	public static void DisplayGraduation(Course[]mix) {
		for(int i=0;i<mix.length;i++) {
			System.out.print(" "+mix[i].toString());
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		int keep1 = 0, keep2 = 0;
		String[] ID = {"GEN61-127","GEN61-152","GEN61-153"};
		int[] GUnit = {3,4,2};
		String[] Grade = {"C","D","C+"};
		String[] School = {"School of Liberal Arts","School of Science","School of Science"};
		String[] MID = {"SWE62-12","SWE62-205","SWE62-214","SWE62-215"};
		int[] MUnit = {2,3,3,2};
		String[] MGrade = {"W","F","C+","F"};
		int[] Year = {1,2,2,2};
		Course[] mixM = new MajorCourse [4];
		for(int i =0; i <mixM.length; i++) {
			mixM[i] = new MajorCourse(MID[i],MUnit[i],MGrade[i],Year[i]);
			if(MGrade[i] != "W" && MGrade[i] != "F")
				keep1 +=1;
		}
		Course[] mixG = new GenEdCourse [3];
		for(int i=0;i<mixG.length;i++) {
			mixG[i] = new GenEdCourse(ID[i],GUnit[i],Grade[i],School[i]);
			if(Grade[i] != "W" && Grade[i] != "F")
				keep2 += 1;
		}
		
		System.out.println("General Education Course : ");
		DisplayGraduation(mixG);
		System.out.println("========================================");
		System.out.println("Major Course : ");
		DisplayGraduation(mixM);
		System.out.println("========================================");
		System.out.printf("Total enroll 7 courses; Pass %d courses\n",(keep1+keep2));
		findGpa(mixG, mixM);
		
	}
	
	public static double pprint(Course[] mix) {
		if (mix instanceof MajorCourse[]) {
			for (int i =0;i<mix.length;i++)
				System.out.printf("%s\n",((MajorCourse[])mix)[i].toString());
		}
		
		if (mix instanceof GenEdCourse[]) {
			for (int i =0;i<mix.length;i++)
				System.out.printf("%s\n",((GenEdCourse[])mix)[i].toString());
		}
		return 0;
	}

	public static double findGpa(Course[] mixG, Course[] mixM) {
		double nM = 0, nG = 0, gpa =0.0, sumGM =0.0,sumGG =0.0, unitM, unitG, sumUG =0.0, sumUM =0.0;
		for (int i=0;i <mixG.length; i++) {
			if (mixG[i].getGrade().equals("A"))
				nG =4.0;
			else if (mixG[i].getGrade().equals("B+"))
				nG =3.5;
			else if (mixG[i].getGrade().equals("B"))
				nG =3.0;
			else if (mixG[i].getGrade().equals("C+"))
				nG =2.5;
			else if (mixG[i].getGrade().equals("C"))
				nG =2.0;
			else if (mixG[i].getGrade().equals("D+"))
				nG =1.5;
			else if (mixG[i].getGrade().equals("D"))
				nG =1.0;
			else if (mixG[i].getGrade().equals("F"))
				nG =0;
			else
				continue;
			unitG = mixG[i].getUnit();
			sumGG += nG* unitG;
			sumUG += unitG;
		}
		for (int i=0;i <mixM.length; i++) {
			if (mixM[i].getGrade().equals("A"))
				nM =4.0;
			else if (mixM[i].getGrade().equals("B+"))
				nM =3.5;
			else if (mixM[i].getGrade().equals("B"))
				nM =3.0;
			else if (mixM[i].getGrade().equals("C+"))
				nM =2.5;
			else if (mixM[i].getGrade().equals("C"))
				nM =2.0;
			else if (mixM[i].getGrade().equals("D+"))
				nM =1.5;
			else if (mixM[i].getGrade().equals("D"))
				nM =1.0;
			else if (mixM[i].getGrade().equals("F"))
				nM =0;
			else
				continue;
			unitM = mixM[i].getUnit();
			sumGM =sumGM +(nM*unitM);
			sumUM = sumUM + mixM[i].getUnit();
			
		}
		System.out.printf("\nGPA = %.2f",sumGG);
		System.out.printf("\nGPA = %.2f",sumUG);
		System.out.printf("\nGPA = %.2f",sumUM);
		System.out.printf("\nGPA = %.2f",sumGM);	
		gpa =(sumGG+sumGM)/(sumUG+sumUM);
		System.out.printf("\nGPA = %.2f",gpa);	
		return 0;
	}
	

}
