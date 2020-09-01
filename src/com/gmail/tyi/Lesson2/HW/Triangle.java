package com.gmail.tyi.Lesson2.HW;

public class Triangle extends Shape {
	
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle() {
		super();
	}

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	private double getAB() {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	}

	private double getBC() {
		return Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
	}

	private double getAC() {
		return Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));
	}

	@Override
	public double getPerimeter() {
		return getAB() + getBC() + getAC();
	}

	@Override
	public double getArea() {
		double s = getPerimeter() / 2;
		return Math.sqrt(s*(s-getAB())*(s-getBC())*(s-getAC()));
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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	


}
