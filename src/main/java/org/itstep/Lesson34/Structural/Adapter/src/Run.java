package org.itstep.Lesson34.Structural.Adapter.src;

public class Run {

	public static void main(String[] args) {
		try {
			ChemicalElement ptr = new ExtendedChemicalElement("silicon");
			ptr.Show();
			
			ptr = new ExtendedChemicalElement("aluminum");
			ptr.Show();
		
			ptr = new ExtendedChemicalElement("barium");
			ptr.Show();
		}
		catch(Exception ex) {
			System.out.println("Exception happened! Exception description\n"+ex.getMessage());
		}

	}

}
