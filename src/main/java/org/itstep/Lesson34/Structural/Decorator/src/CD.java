package org.itstep.Lesson34.Structural.Decorator.src;

class CD extends CollectionItem
{
	public CD(String pSinger, String pTitle, String pStyle, int pPlayTime, int pNumCopies) {
		singer = pSinger;
		title = pTitle;
		style = pStyle;
		playtime = pPlayTime;
		SetNumberOfCopies(pNumCopies);
	}

	private String singer;
	private String style;
	private String title;
	private int playtime;
	
	@Override
	public void Show() {
		System.out.print("\n====================\n");
		System.out.print("\nInformation about CD disk\n");
		System.out.printf("Singer: %s\n", singer);
		System.out.printf("Title of CD: %s\n", title);
		System.out.printf("Style of CD: %s\n", style);
		System.out.printf("Duration of CD: %s\n", playtime);
		System.out.printf("Number of copies: %d\n", GetNumberOfCopies());
		System.out.print("\n====================\n");

	}
}