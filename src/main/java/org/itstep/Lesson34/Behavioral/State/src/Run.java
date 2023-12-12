package org.itstep.Lesson34.Behavioral.State.src;

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			Context obj = new Context(new StateA());

			obj.Request();
			obj.Request();
			obj.Request();
			obj.Request();

		}
		catch(Exception ex) {
			System.out.printf("Exception happened! Exception description: %s \n",ex.getMessage());
		}
	}

}
