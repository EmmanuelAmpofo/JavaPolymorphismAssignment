
public class Shape {
	
	private String color;
	
	Shape(String color){
		this.color = color;
	}
	

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	double getArea() {
		System.out.println("Shape has to be known to get area");
		return 0;
	}
}

class Rectangle extends Shape{
	private int length;
	private int breadth;
	
	Rectangle(String color,int l, int b){
		super(color);
		length = l;
		breadth = b;
	}



	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	
	double getArea() {
		return length * breadth;
	}
}

class Triangle extends Shape{
	private int base;
	private int height;
	
	Triangle(String color, int b, int h){
		super(color);
		base = b;
		height = h;
		
	}
    @Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}
double getArea() {
	return 0.5*(base * height);
}



	public static void main(String[] args) {
		Shape shape = new Rectangle("Black",7,9);
		Shape triang = new Triangle("Yellow",8,12);
		
		System.out.println(shape);
		System.out.println("Area of Rectangle = "+shape.getArea());
		
		System.out.println(triang);
		System.out.println("Area of Rectangle = "+triang.getArea());
		
		
		

	}

}
