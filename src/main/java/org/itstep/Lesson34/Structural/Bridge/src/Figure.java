package org.itstep.Lesson34.Structural.Bridge.src;

abstract class Figure
{
	protected PaintApi api;
	public Figure(PaintApi pApi){
		api = pApi;
	}
	abstract void DrawFigure();
};