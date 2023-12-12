package org.itstep.Lesson34.Behavioral.Visitor.src;

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			
			ObjectStructure o = new ObjectStructure();
			o.Attach(new ConcreteElementA());
			o.Attach(new ConcreteElementB());

			VisitorFirst v1 = new VisitorFirst();

			VisitorSecond v2 = new VisitorSecond();

			o.Accept(v1);
			o.Accept(v2);

		}
		catch(Exception ex) {
			System.out.printf("Exception happened! Exception description: %s \n",ex.getMessage());
		}

	}

}
