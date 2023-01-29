package report.d0113;

abstract class Shape{
	///field
	protected double area;
	private String name;
	///constructor
	///method
	public void setName(String name) {
		this.name = name;
	}
	abstract public void calculationArea();
	public void print() {
		System.out.println(name +"의 면적은 "+area);
	}
}

class Circle extends Shape {
	///field
	double radius;
	///constructor
	public Circle(String name, double radius) {
		super.setName(name);
		this.radius = radius;
	}
	@Override
	public void calculationArea() {
		super.area = (radius*radius)*Math.PI; 
	}	
}

class Rectangular extends Shape {
	///field
	double width, hight;
	///constructor
	public Rectangular(String name, double width, double hight) {
		super.setName(name);
		this.width = width;
		this.hight = hight;
	}
	@Override
	public void calculationArea() {
		super.area = width * hight; 
	}	
}



public class Prob19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shape = new Shape[2];
		shape[0] = new Circle("원",10);
		shape[1] = new Rectangular("사각형",10,20);
		for (int i = 0 ; i<shape.length ; i++) {
			shape[i].calculationArea();
			shape[i].print();
		}
	}

}
