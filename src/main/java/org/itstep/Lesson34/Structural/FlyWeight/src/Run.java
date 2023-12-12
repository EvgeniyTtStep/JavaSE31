package org.itstep.Lesson34.Structural.FlyWeight.src;

public class Run {

	
	public static void main(String[] args) {
		try {
			
			String document = "AFFCCDDZZZ";

			RealCharacterFactory charFactory = new RealCharacterFactory(30);

			for (int i = 0;i <document.length();i++) {
				AbstractCharacter characterValue = charFactory.GetChar(document.charAt(i));
				characterValue.Show();
			}
		
			
		}
		catch(Exception ex) {
			System.out.printf("Exception happened! Exception description: %s \n",ex.getMessage());
		}

	}

}
