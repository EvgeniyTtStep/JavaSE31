package org.itstep.Lesson34.Structural.Decorator.src;

import java.util.Iterator;
import java.util.Vector;

class Borrowable extends Decorator
{
	public Borrowable(CollectionItem item) {
		super(item);
		users = new Vector<String>(); 
	}
	
	private Vector<String> users;
	public void BorrowItem(String name) {
		users.add(name);
		item.SetNumberOfCopies(item.GetNumberOfCopies() - 1);
	}

	public void ReturnItem(String name) {
		int result = users.indexOf(name);
		if (result != -1){
			users.remove(result);
			item.SetNumberOfCopies(item.GetNumberOfCopies() + 1);
		}
	}
	@Override
	public void Show() {
		
		for (Iterator<String> ptr = users.iterator(); ptr.hasNext()!=false;)
		{
			System.out.printf("Member: %s\n",ptr.next());
		}
	}
}
