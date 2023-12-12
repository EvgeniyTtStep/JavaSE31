package org.itstep.Lesson34.Behavioral.Mediator.src;

import java.util.*;

// ��� ���������� ConcreteMediator
class Classroom implements BaseClassroom
{
	private Map<String, Trainee> trainees;
	
	public Classroom(){
		trainees = new HashMap<String,Trainee>();
	}
	
	public void Register(Trainee trainee) {
		String name = trainee.GetName();
		
		if(trainees.containsKey(name) == false) {
			trainees.put(name,trainee);
		}
		
		trainee.SetClassroom(this);
	}
	
	public void Send(String from, String to, String message) {
		boolean res = trainees.containsKey(to);
		
		if(res != false) {
			trainees.get(to).Receive(from, message);
		}
	}
}