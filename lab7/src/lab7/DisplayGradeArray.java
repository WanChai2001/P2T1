package lab7;

public class DisplayGradeArray {
	public static void Display(Score[] score) {
		System.out.println("Display Grade"); 
		System.out.printf("No. \tLab(30) \t\tAttend(5) \tMid(30) \t\tFinal(35) \tTotal(100)\tGrade\n"); 
		for(int i=0;i<score.length; i++) {
			score[i].setGrade(); 
			System.out.print(i+1 + "\t "+score[i].toString()); 
			System.out.println("");
		}
	}
	public static int[] calGradeSummary(Score[] score) {
		int[] setgrade = new int[score.length]; 
		for(int i=0 ;i<score.length; i++) {
			if(score[i].grade == 'A') setgrade[0]++; 
			else if(score[i].grade == 'B') setgrade [1]++;
			else if(score[i].grade == 'C') setgrade [2] ++; 
			else if(score[i].grade == 'D') setgrade [3] ++;
			else setgrade [4]++;
	}
	return setgrade;
	}
	public static void displayGradeSummary(int[] freq) {
		String[] ch = { "A","8" ,"c","0","F"};
		System.out.println("Grade Summary");
		for(int i ;i< freq.length; i++) {
			if(freq[i] !=0 ) { 
				System.out.print(ch[i]+ "\t");
				for(int j = 0; j < freq[i] ; j++) {
			}
		System.out.print("");
			}
		System.out.println("");
		}
		else continue;
	public static void main(String[] args) {
		
