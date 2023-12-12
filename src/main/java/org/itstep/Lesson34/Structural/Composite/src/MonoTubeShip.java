package org.itstep.Lesson34.Structural.Composite.src;

class MonoTubeShip implements Unit
{
	public MonoTubeShip(){}

	public int GetPower(){
		return 1;
	}
	public void AddUnit(Unit p) throws Exception{
		throw new Exception("This operation is not supported!");
	}

}

