package org.itstep.Lesson34.Structural.Adapter.src;

// Adaptee
class ChemicalElementsInformation
{
	public ChemicalElementsInformation() {
		
	}

	public double GetDensity(String pName) {
		
		pName = pName.toLowerCase();
		if (pName == "silicon")
		{
			return 2.33;
		}
		else if (pName == "aluminum")
		{
			return 2.7;
		}
		else if (pName == "barium")
		{
			return 3.76;
		}
		return 0;
		
	}
	
	public int GetPositionFromPeriodicTable(String pName) {
		
		pName = pName.toLowerCase();
		if (pName == "silicon")
		{
			return 14;
		}
		else if (pName == "aluminum")
		{
			return 13;
		}
		else if (pName == "barium")
		{
			return 56;
		}
		return -1;
	}
}