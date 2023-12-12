package org.itstep.Lesson34.Structural.Bridge.src;

public class BlueRectangle implements PaintApi{

	public BlueRectangle() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void DrawRectangle(int x, int y, int endx, int endy)
	{
		System.out.printf("Draw Blue Rectangle\n x = %d  y = %d  endx = %d  endy = %d\n", x, y, endx, endy);
	}
}
