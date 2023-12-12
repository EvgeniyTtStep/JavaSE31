package org.itstep.Lesson34.Behavioral.ChainOfResponsibility.src;

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			Manager vasya = new LocalManager();
			Manager petya = new LocalBranchManager();
			Manager fedya = new CEO();

			vasya.SetSuccessor(petya);
			petya.SetSuccessor(fedya);

			Claim first = new Claim("About service","Daria Surgachova",500);
			vasya.Process(first);

			Claim second = new Claim("About customer support", "Bill Medoff", 5000);
			vasya.Process(second);

			Claim third = new Claim("About internet", "Fedor Evlanenko", 50000);
			vasya.Process(third);

			Claim fourth = new Claim("About crash", "Misha Collins", 150000);
			vasya.Process(fourth);	
		}
		catch(Exception ex) {
			System.out.printf("Exception happened! Exception description: %s \n",ex.getMessage());
		}
	}

}
