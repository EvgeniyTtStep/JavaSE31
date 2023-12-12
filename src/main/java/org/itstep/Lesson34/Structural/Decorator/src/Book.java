package org.itstep.Lesson34.Structural.Decorator.src;

class Book extends CollectionItem
{
	public Book(String pAuthor, String pTitle, String pStyle,int pNumCopies) {
		author = pAuthor;
		title = pTitle;
		style = pStyle;
		SetNumberOfCopies(pNumCopies);
	}
	
	private String author;
	private String style;
	private String title;
	
	@Override
	public void Show() {
		System.out.print("\n====================\n");
		System.out.print("\nInformation about book\n");
		System.out.printf("Author: %s\n",author);
		System.out.printf("Title: %s\n", title);
		System.out.printf("Style: %s", style);
		System.out.printf("Number of copies: %s\n",GetNumberOfCopies());
		System.out.print("\n====================\n");
	}
}