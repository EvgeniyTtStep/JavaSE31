package org.itstep.Lesson34.Creational.Builder.src;

abstract class AircraftBuilder
{
	
	protected Aircraft aircraft;
	
	public AircraftBuilder() {
		
	}
	
	public Aircraft GetAircraft() {
		return aircraft;
	}

	public abstract void BuildFrame();

	public abstract void BuildEngine();

	public abstract void BuildWheels();

	public abstract void BuildDoors();

	public abstract void BuildWings();

}
