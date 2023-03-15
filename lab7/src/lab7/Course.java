package lab7;

public class Course {

	String courseID,grade;
	int unit;
	public Course() {
		
	}
	public Course(String id, int u, String g) {
		courseID =id;
		unit =u;
		grade =g;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public int getUnit() {
		return unit;
	}
	
	public String toString() {
		String mix ="";
		mix += ""+this.courseID+""+this.unit+""+this.grade;
		return mix;
	}
	
}
