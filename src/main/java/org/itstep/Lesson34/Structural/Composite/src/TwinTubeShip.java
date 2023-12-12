package org.itstep.Lesson34.Structural.Composite.src;

class TwinTubeShip implements Unit
{
	public TwinTubeShip(){}

	
	public int GetPower(){
		return 2;
	}
	public void AddUnit(Unit p) throws Exception{
		throw new Exception("This operation is not supported!");
	}
}
