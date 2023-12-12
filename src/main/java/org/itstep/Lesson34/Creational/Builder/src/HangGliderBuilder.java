package org.itstep.Lesson34.Creational.Builder.src;

class HangGliderBuilder extends AircraftBuilder
{
	public HangGliderBuilder() {
		aircraft = new Aircraft("Hang Glider");
	}

	public void BuildFrame() {
		aircraft.SetPart("frame", "Hang glider frame");
	}

	public void BuildEngine() {
		aircraft.SetPart("engine", "no engine");
	}

	public void BuildWheels() {
		aircraft.SetPart("wheels", "no wheels");
	}

	public void BuildDoors() {
		aircraft.SetPart("doors", "no doors");
	}

	public void BuildWings() {
		aircraft.SetPart("wings", "1");
	}

}
