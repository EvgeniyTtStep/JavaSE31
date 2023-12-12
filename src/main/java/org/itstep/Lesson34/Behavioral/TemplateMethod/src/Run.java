package org.itstep.Lesson34.Behavioral.TemplateMethod.src;

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			
			Device device = new Car();
			device.Assemble();
			
			System.out.print("\n\n=====================\n\n");
			
			device = new Airplane();
			device.Assemble();
			
		}
		catch(Exception ex) {
			System.out.printf("Exception happened! Exception description: %s \n",ex.getMessage());
		}

	}

}
