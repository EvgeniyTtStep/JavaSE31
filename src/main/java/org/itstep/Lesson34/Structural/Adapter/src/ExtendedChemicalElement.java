package org.itstep.Lesson34.Structural.Adapter.src;

class ExtendedChemicalElement extends ChemicalElement
{  
	private ChemicalElementsInformation pInformation;
	
	public ExtendedChemicalElement(String pName){
		super(pName);
		pInformation = new ChemicalElementsInformation();
	}
	
	@Override
	public void Show() {
		System.out.println("\n============================\n");
		super.Show();
		density = pInformation.GetDensity(name);
		position = pInformation.GetPositionFromPeriodicTable(name);
		System.out.printf("\nDensity of Element: %.2f\n",density);
		System.out.printf("\nPosition in Periodic Table: %d\n",position);
		System.out.println("\n============================\n");
	}
}