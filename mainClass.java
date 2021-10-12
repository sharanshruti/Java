import java.util.Scanner;

abstract class Shape{
	String name;
	int noSides;
	abstract double getArea();
	abstract double getPerimeter();
	public String toString(){
		return name + " " + noSides; 
	}
}


class Circle extends Shape{
	int radius;
	Circle(int r){
		radius = r;
		name = "Circle";
		noSides = 0;
	}
	public String toString(){
		return name + " " + noSides; 
	}	
	double getArea(){
		double area = 3.14*radius*radius;
		System.out.println("Area "+area);
		return area;
	}
	double getPerimeter(){
		double perimeter = 6.28*radius;
		System.out.println("Perimeter "+perimeter);
		return perimeter;
	}

}


class Rectangle extends Shape{
	int length;
	int breadth;
	Rectangle(int l,int b){
		length = l;
		breadth = b;
		name = "Rectangle";
		noSides = 4;
	}

	public String toString(){
		System.out.println("                    ");
		return name + " " + noSides; 
	}	
	double getArea(){
		int ar = length*breadth;
		System.out.println("Area "+ar);
		return ar;
	}
	double getPerimeter(){
		int pemtr = 2*(length+breadth);
		System.out.println("Perimeter "+pemtr); 
		return pemtr;
	}

}

class mainClass{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Circle's radius: ");
		int a = sc.nextInt();
		Circle c1 = new Circle(a);
		System.out.println("Enter rectangle's length: ");
		int b = sc.nextInt();
		System.out.println("Enter rectangle's breadth: ");
		int c = sc.nextInt();
		System.out.println("                           ");
		System.out.println("===========================");
		System.out.println(c1.toString());
		c1.getArea();
		c1.getPerimeter();
		Rectangle r1 = new Rectangle(b,c);
		System.out.println(r1.toString());
		r1.getArea();
		r1.getPerimeter();
	}
}