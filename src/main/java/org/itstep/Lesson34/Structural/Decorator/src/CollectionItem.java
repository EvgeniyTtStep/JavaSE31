package org.itstep.Lesson34.Structural.Decorator.src;

abstract class CollectionItem
{
	public CollectionItem() {}
	
	private int numberOfCopies;
	public abstract void Show();
	
	public int GetNumberOfCopies()
	{
		return numberOfCopies;
	}
	public void SetNumberOfCopies(int value)
	{
		numberOfCopies = value;
	}
}