package org.itstep.Lesson34.Structural.FlyWeight.src;

class RealCharacter extends AbstractCharacter
{
	public RealCharacter(char pSymbol, int pPointSize) {
		symbol = pSymbol;
		width = 100;
		height = 90;
		ascent = 40;
		descent = 0;
		pointSize = pPointSize;
	}
	
	@Override
	public void Show() {
		System.out.printf("\nSymbol is: %c Size: %d\n",symbol,pointSize);
	}
};
