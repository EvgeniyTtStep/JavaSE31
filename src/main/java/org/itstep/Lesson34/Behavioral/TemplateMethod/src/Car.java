package org.itstep.Lesson34.Behavioral.TemplateMethod.src;

class Car extends Device
{
	public Car(){}

	public void MakeEngine(){
		System.out.print("\nMake Engine for Car\n");
	}
	public void MakeWheels(){
		System.out.print("\nMake Wheels for Car\n");
	}
	public void MakeCabin(){
		System.out.print("\nMake Cabin for Car\n");
	}
	public void MakeWings(){
		System.out.print("\nNo wings for Car\n");
	}
};

