package org.itstep.Lesson34.Structural.Bridge.src;

class Rectangle extends Figure
{
	private int x;
	private int y;
	private int endx;
	private int endy;
	public Rectangle(int pX, int pY, int pEndX, int pEndY, PaintApi pApi){
		
		super(pApi);
		
		x = pX;
		y = pY;
		endx = pEndX;
		endy = pEndY;
	}

	void DrawFigure()
	{
		api.DrawRectangle(x, y, endx, endy);
	}

};
