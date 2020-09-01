package com.gmail.tyi.Lesson2.HW;

public class Rectangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Rectangle() {
		super();
	}
	
	

	public Rectangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	private double getAB() {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
	}

	private double getBC() {
		return Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
	}


	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(getAB()+getBC());
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getAB()*getBC();
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



	public Point getD() {
		return d;
	}



	public void setD(Point d) {
		this.d = d;
	}



	public Point getC() {
		return c;
	}



	public void setC(Point c) {
		this.c = c;
	}



	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
	


}
