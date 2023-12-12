package org.itstep.Lesson34.Behavioral.Memento.src;

// ����� Originator
// � ����� ������� �� ����� �������� � ����������� � ��������
// � ��������� ��� ���������
class Human
{
	private String name;
	private String surname;
	private int age;
	public Human(String pName, String pSurname, int pAge)
	{
		name = pName;
		surname = pSurname;
		age = pAge;
	}
	public Human() {
		this("Oleg", "Kukushkin", 25);
	}

	public String GetName(){
		return name;
	}
	public void SetName(String pName){
		name = pName;
	}

	public String GetSurname(){
		return surname;
	}
	public void SetSurname(String pSurname){
		surname = pSurname;
	}
	public int GetAge(){
		return age;
	}
	public void SetAge(int pAge){
		age = pAge;
	}
	// �������� ������ ���������
	public Memento SaveMemento(){
		System.out.print("\nSaving state\n");
		return new Memento(name, surname, age);
	}
	// ��������������� ���������
	public void RestoreMemento(Memento pMemento)
	{
		System.out.print("\nRestoring state\n");
		name = pMemento.GetName();
		surname = pMemento.GetSurname();
		age = pMemento.GetAge();
	}
}