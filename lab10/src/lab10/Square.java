package lab10;

public class Square extends Shape {
	protected int width;
	
	public Square(String color,int width) {
		super.setColor(color);
		this.width = width;
	}
	public double gatArea() {
		return width*width;
	}
	public double gatPerimeter() {
		return 4*width;
	}
	public String toString() {
		return super.toString()+"width : "+width+"\nArea ; "+ (int)getArea()+",Perimeter : "+(int)gatPerimeter();
	}
	public void resize(int percent) {
		this.width = this.width*(percent/100);
	}
}
