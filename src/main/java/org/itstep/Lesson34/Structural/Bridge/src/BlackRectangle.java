package org.itstep.Lesson34.Structural.Bridge.src;

public class BlackRectangle implements PaintApi{
	@Override
	public void DrawRectangle(int x, int y, int endx, int endy)
	{
		System.out.printf("Draw Black Rectangle\n x = %d  y = %d  endx = %d  endy = %d\n", x, y, endx, endy);
	}
}
