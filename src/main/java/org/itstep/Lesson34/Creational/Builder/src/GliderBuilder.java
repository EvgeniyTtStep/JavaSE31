package org.itstep.Lesson34.Creational.Builder.src;

// ����� ���������. ����� ��������� �������
class GliderBuilder extends AircraftBuilder
{
	public GliderBuilder() {
		aircraft = new Aircraft("Glider");
	}
	
	public void BuildFrame() {
		aircraft.SetPart("frame", "Glider frame");
	}

	public void BuildEngine() {
		aircraft.SetPart("engine", "no engine");
	}

	public void BuildWheels() {
		aircraft.SetPart("wheels", "1");
	}

	public void BuildDoors() {
		aircraft.SetPart("doors", "1");
	}

	public void BuildWings() {
		aircraft.SetPart("wings", "2");
	}
}
