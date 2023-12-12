package org.itstep.Lesson34.Behavioral.Mediator.src;

class Trainee
{
	private String name;
	private Classroom classroom;
	
	public Trainee(String pName){
		name = pName;
	}
	
	public String GetName(){
		return name;
	}
	
	public void SetName(String pName){
		name = pName;
	}
	
	public Classroom GetClasroom(){
		return classroom;
	}
	
	public void SetClassroom(Classroom pClassroom){
		classroom = pClassroom;
	}
	
	// ������� ���������
	public void Send(String to, String message) {
		classroom.Send(GetName(),to, message);
	}
	public void Receive(String from, String message){
		System.out.printf("\nMessage from %s to %s  : %s\n", from, GetName(), message);
	}
}