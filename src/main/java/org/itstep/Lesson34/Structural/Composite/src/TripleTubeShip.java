package org.itstep.Lesson34.Structural.Composite.src;

class TripleTubeShip implements Unit
{
	public TripleTubeShip(){}
	public int GetPower(){
		return 3;
	}
	public void AddUnit(Unit p) throws Exception
	{
		throw new Exception("This operation is not supported!");
	}
}

