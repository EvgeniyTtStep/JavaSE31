package org.itstep.Lesson34.Structural.Decorator.src;

class Decorator extends CollectionItem
{
	public Decorator(CollectionItem pItem) {
		item = pItem;
	}
	protected CollectionItem item;
	@Override
	public void Show()
	{
		item.Show();
	}
}
