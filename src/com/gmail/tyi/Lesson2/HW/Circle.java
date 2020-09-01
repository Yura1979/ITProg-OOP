package com.gmail.tyi.Lesson2.HW;

public class Circle extends Shape {
	private Point a;
	private Point b;

	public Circle(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Circle() {
		super();
	}

	private double getRadius() {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * getRadius();
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(getRadius(), 2);
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Circle [a=" + a + ", b=" + b + "]";
	}
	
	

}
