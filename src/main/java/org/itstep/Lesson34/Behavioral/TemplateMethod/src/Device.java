package org.itstep.Lesson34.Behavioral.TemplateMethod.src;

abstract class Device
{
	public Device(){}

	public abstract void MakeEngine();
	public abstract void MakeWheels();
	public abstract void MakeCabin();
	public abstract void MakeWings();

	public final void Assemble(){
		MakeEngine();
		MakeWheels();
		MakeCabin();
		MakeWings();
	}
}