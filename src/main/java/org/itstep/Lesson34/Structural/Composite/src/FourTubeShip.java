package org.itstep.Lesson34.Structural.Composite.src;

class FourTubeShip implements Unit
{
	public FourTubeShip(){}
	public int GetPower(){
		return 4;
	}
	public void AddUnit(Unit p) throws Exception{
		throw new Exception("This operation is not supported!");
	}
}
