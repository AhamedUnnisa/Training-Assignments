package object;
abstract class Shape {

	abstract void draw();
}
class Line extends Shape{
	void draw()
	
	{
		System.out.println("drawing line");
	}
}
class Rectangle extends Shape{
	void draw() {
	System.out.println("drawing rectangle");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("drawing circle");
	}
}
public class Shapes{
	public static void main(String args[]) {
		Shape s1=new Line();
		s1.draw();
		Shape s2=new Rectangle();
		s2.draw();
		Shape s3=new Circle();
		s3.draw();
	}
}

