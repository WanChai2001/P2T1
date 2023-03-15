package lab8;

public class GenEdCourse extends Course {
	protected String school;
	public GenEdCourse(String id, int u ,String g, String s) {
		super(id,u,g);
		this.school = s;
	}
	

	public String toString() {
		return ""+super.toString()+"     "+this.school;
	}
}
