package org.itstep.Lesson34.Structural.Decorator.src;

public class Run {

	public static void main(String[] args) {
		try {
			
			Book book = new Book("Carol Aimes", "25 steps to success", "horror", 10);
			book.Show();

			CD cd = new CD("Lou Abrams", "Binary Sound", "New Func", 100, 20);
			cd.Show();
			
			System.out.println("Let's give some books and cd's\n" );

			Borrowable borrowIt = new Borrowable(book);

			borrowIt.BorrowItem("Boris Gusev");
			borrowIt.BorrowItem("Tamara Loseva");
			borrowIt.BorrowItem("Petrik Kostushko");

			borrowIt.Show();
			System.out.println("\n");;
			borrowIt.ReturnItem("Tamara Loseva");
			borrowIt.BorrowItem("Igor Grachev");
			borrowIt.Show();

		}
		catch(Exception ex) {
			System.out.println("Exception happened! Exception description\n"+ex.getMessage());
		}

	}

}
