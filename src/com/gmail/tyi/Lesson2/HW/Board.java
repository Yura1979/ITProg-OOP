package com.gmail.tyi.Lesson2.HW;

import java.util.Arrays;

public class Board {
	public static final int PART1 = 0;
	public static final int PART2 = 1;
	public static final int PART3 = 2;
	public static final int PART4 = 3;

	private String boardName;
	private Shape[] figures = new Shape[4];

	public Board() {
		super();
	}

	public Board(String boardName) {
		super();
		this.boardName = boardName;
	}

	public void putFigure(Shape figure, int part) {
		
		if (figures[part] == null) {
			figures[part] = figure;
			System.out.println(figure + " added to " + getBoardName() + " " + (part + 1) + "!");
		} else {
			System.out.println(getBoardName() + (part + 1) + " has no space, delete figure first!");
		}
	}

	public void deleteFigure(Shape figure, int part) {
		if (figures[part].equals(figure)) {
			figures[part] = null;
			System.out.println(figure + " deleted from " + getBoardName() + " part " + (part + 1) + "!");
		} else {
			System.out.println(getBoardName() + " " + (part + 1) + " wrong figure or part is empthy!");
		}
	}
	
	public double getShapesArea() {
		
		double area = 0;
		
		for (Shape figure : figures) {
			if (figure != null) {
				
				area += figure.getArea();

			}
		}
		
		return area;
		
	}

	public void getFiguresFromBoard() {
		if (getShapesArea() == 0) {
			System.out.println("No figures on the board");
			return;
		}

		System.out.println(getBoardName() + " containes figures: ");
		
		int part = 0;
		for (Shape figure : figures) {
			if (figure != null) {
				System.out.println(figure + " on Board part " + (++part));

			}
		}
		System.out.println("Area of figures on board is " + getShapesArea());
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public Shape[] getFigures() {
		return figures;
	}

	@Override
	public String toString() {
		return "Board [boardName=" + boardName + ", figures=" + Arrays.toString(figures) + "]";
	}

}
