package org.itstep.Lesson34.Behavioral.Memento.src;

// ����� Memento
class Memento
{
	private String name;
	private String surname;
	private int age;
	
	public Memento(String pName, String pSurname, int pAge){
		name = pName;
		surname = pSurname;
		age = pAge;
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
}