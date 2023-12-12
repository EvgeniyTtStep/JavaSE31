package org.itstep.Lesson34.Creational.Builder.src;

class AircraftConstructor
{
	public AircraftConstructor() {
		
	}
	
	public void Construct(AircraftBuilder aircraftBuilder) {
		aircraftBuilder.BuildFrame();
		aircraftBuilder.BuildEngine();
		aircraftBuilder.BuildWheels();
		aircraftBuilder.BuildDoors();
	}
}
