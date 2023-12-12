package org.itstep.Lesson34.Structural.Adapter.src;

// Target
class ChemicalElement
{
	protected String name;
	protected double density;
	protected int position;

	public ChemicalElement(String pName) {
		name = pName.toLowerCase();
	}

	public void Show()
	{
		System.out.printf("\nChemical Element:%s\n",name);
	}
}
