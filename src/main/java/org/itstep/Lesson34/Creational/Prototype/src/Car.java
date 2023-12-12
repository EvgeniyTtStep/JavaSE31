package org.itstep.Lesson34.Creational.Prototype.src;

class Car extends Device {
	// �������� ������
	private String manufacturer;
	private String description;
	private String color;

	private int year;
	// ������������
	public Car(){
		this("No information","No description","No color",0);
	}
	Car(String cmanufacturer, String cdescription, String ccolor, int cyear){
		SetName("Car");

		SetManufacturer(cmanufacturer);
		SetDescription(cdescription);
		SetColor(ccolor);
		SetYear(cyear);

	}
	// ��������������� �������
	public int GetYear(){
		return year;
	}
	public String GetManufacturer(){
		return manufacturer;
	}
	public String GetDescription(){
		return description;
	}
	public String GetColor(){
		return color;
	}

	public void SetYear(int cyear){
		year = cyear;
	}
	public void SetManufacturer(String cmanufacturer) {
		manufacturer = cmanufacturer;
	}
	public void SetColor(String ccolor) {
		color = ccolor;
	}
	public void SetDescription(String cdescription) {
		description = cdescription;
	}

	// ���������� ������������ ������ � �������
	public Device CloneIt() {
		Car c = new Car(this.GetManufacturer(),this.GetDescription(),this.GetColor(),this.GetYear());
		return c;
	}
	public void Show() {
		super.Show();
		
		System.out.println("\nDescription of car is\n" + GetDescription() + "\n");
		System.out.println("\nManufacturer of car is\n" + GetManufacturer() + "\n");
		System.out.println("\nYear of car is\n" + GetYear() + "\n");
		System.out.println("\nColor of car is\n" + GetColor() + "\n");	
	}
}


