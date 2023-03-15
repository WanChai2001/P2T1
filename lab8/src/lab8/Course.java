package lab8;

public class Course {

	private String courseID,grade;
	private int unit;
	public Course() {
		
	}
	public Course(String id, int u, String g) {
		this.courseID =id;
		this.unit =u;
		this.grade =g;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public int getUnit() {
		return unit;
	}
	
	public String toString() {
		String mix ="";
		mix += "      "+this.courseID+"        "+this.unit+"         "+this.grade;
		return mix;
	}
	
}
