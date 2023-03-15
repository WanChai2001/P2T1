package lab10;

public class Circle extends Shape{
	protected double radius;
	public Circle(String color,int radius) {
		super.setColor(color);
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
		
	}
	public double getCirle() {
		return 2*3.14*radius;
	}
	public String toString() {
		return super.toString()+"radius : "+radius+"\nArea ; "+ (int)getArea()+",Circumference : "+(int)getCirle();
	}
	public void resize(int percent) {
		this.radius = this.radius*(percent/100);
	}
}
