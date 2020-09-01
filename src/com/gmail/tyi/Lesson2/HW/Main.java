package com.gmail.tyi.Lesson2.HW;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board1 = new Board("Board1");
		
		Shape circle = new Circle(new Point(6, 3), new Point(6, 6));
		Shape triangle = new Triangle(new Point(5, 2), new Point(9, 11), new Point(18, 2));
		Shape rectangle = new Rectangle(new Point(3, 9), new Point(13, 9), new Point(13, 4), new Point(3, 4));
		
		System.out.println("Circle area " + circle.getArea() + ", perimeter " + circle.getPerimeter());
		System.out.println("Triangle area " + triangle.getArea() + ", perimeter " + triangle.getPerimeter());
		System.out.println("Rectangle area " + rectangle.getArea() + ", perimeter " + rectangle.getPerimeter());
		
		board1.getFiguresFromBoard();
		board1.putFigure(circle, Board.PART1);
		board1.putFigure(triangle, Board.PART2);
		board1.putFigure(rectangle, Board.PART3);
		board1.getFiguresFromBoard();
		
		board1.deleteFigure(triangle, Board.PART1);

	}

}
