package org.itstep.Lesson34.Structural.FlyWeight.src;

abstract class AbstractCharacter {
	abstract public void Show();
	
	protected char symbol;
	protected int  width;
	protected int  height;
	protected int  ascent;
	protected int  descent;
	protected int  pointSize;
}
