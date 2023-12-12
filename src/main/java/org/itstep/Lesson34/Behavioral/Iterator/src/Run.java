package org.itstep.Lesson34.Behavioral.Iterator.src;

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			
			Cities cities = new Cities();

		    for(Iterator iter = cities.getIterator(); iter.hasNext() != false;){
		         String name = (String)iter.next();
		         System.out.printf("\nName : %s", name);
		    } 
		}
		catch(Exception ex) {
			System.out.printf("Exception happened! Exception description: %s \n",ex.getMessage());
		}
	}

}
