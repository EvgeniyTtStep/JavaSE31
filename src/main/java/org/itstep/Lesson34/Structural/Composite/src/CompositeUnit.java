package org.itstep.Lesson34.Structural.Composite.src;

import java.util.Vector;

class CompositeUnit implements Unit
{
	public CompositeUnit() {
		fleet = new Vector<Unit>();
	}

	public int GetPower(){
		int amount = 0;
		for (int i = 0; i < fleet.size(); i++) {
			amount += fleet.get(i).GetPower();
		}
		return amount;
	}
	public void AddUnit(Unit p) {
		fleet.add(p);
	}
	private Vector<Unit> fleet;
}

