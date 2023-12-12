package org.itstep.Lesson34.Behavioral.TemplateMethod.src;

class Airplane extends Device {
	public Airplane(){}

	public void MakeEngine(){
		System.out.print("\nMake Engine for Airplane\n");
	}
	public void MakeWheels(){
		System.out.print("\nMake Wheels for Airplane\n");
	}
	public void MakeCabin(){
		System.out.print("\nMake Cabin for Airplane\n");
	}
	public void MakeWings(){
		System.out.print("\nMake Wings for Airplane\n");
	}
};
