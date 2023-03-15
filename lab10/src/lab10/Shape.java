package lab10;

public abstract class Shape {
	protected String color;
	abstract double getArea();
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return "color : "+ color;
	}
	public int compareTo(Object object) {
		if (this.getArea() > ((Square)object).getArea())
			return 1;
		else if (this.getArea() < ((Square)object).getArea())
			return -1;
		else
			return 0;
	}
}
