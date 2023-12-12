package org.itstep.Lesson34.Structural.Bridge.src;

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			
			Figure blackRectangle = new Rectangle(10, 10, 100, 100, new BlackRectangle());
			Figure blueRectangle = new Rectangle(20, 20, 200, 200, new BlueRectangle());
			
			blackRectangle.DrawFigure();
			blueRectangle.DrawFigure();
			
		}
		catch(Exception ex) {
			System.out.printf("Exception happened! Exception description: %s \n",ex.getMessage());
		}

	}

}
