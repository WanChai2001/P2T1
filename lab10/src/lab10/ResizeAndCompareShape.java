package lab10;

import java.util.ArrayList;

public class ResizeAndCompareShape {
	public static void mian(String[] args) {
		ArrayList<Shape>mix = new ArrayList<Shape>();
		mix.add(new Square("Orange",4));
		mix.add(new Square("Orange",10));
		mix.add(new Square("Orange",5));
		mix.add(new Circle("Violent",3));
		mix.add(new Circle("Violent",6));
		mix.add(new Circle("Violent",10));
		displayAllShape(mix);
		for(int i=0;i<mix.size();i++) {
			if (mix.get(i)instanceof Square)
				((Square)mix.get(i)).resize(200);
			else
				((Circle)mix.get(i)).resize(50);
		}
		System.out.println("After resize");
		displayAllShape(mix);
		int comp1 = mix.get(0).compareTo(mix.get(1));
		String[] compMessage = {"smaller","epual","bigger"};
		System.out.println("Compare 2 Squares after resize");
		System.out.println("Square 1 is"+compMessage[comp1+1]+" than Square 2");
		int comp2 = mix.get(1).compareTo(mix.get(0));
		System.out.println("Compare 2 Circle after resize");
		System.out.println("Square 1 is"+compMessage[comp2+1]+" than Square 2");
		}
	public static void displayAllShape(ArrayList<Shape> A) {
		System.out.println("Class Square");
		for (int i = 0;i< A.size();i++) {
			if(A.get(i)instanceof Square)
				System.out.printf("%d. %s\n",(i+1),((Square)A.get(i)).toString());
		}
		System.out.println("============================================================");
		System.out.println("Class Circle");
		int i, j=0;
		for (i = 0;i<A.size();i++) {
			if(A.get(i)instanceof Circle)
				System.out.printf("%d.%s\n",(i+1),((Circle)A.get(i)).toString());
				j++;
		}
		
}
}