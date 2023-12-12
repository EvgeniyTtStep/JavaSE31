package org.itstep.Lesson34.Behavioral.Command.src;

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			RemoteControl control = new RemoteControl();
			
			TV concreteTV = new TV();

			TVCommand tvOn = new TVOnCommand(concreteTV);
			TVCommand tvOff = new TVOffCommand(concreteTV);

			
			// �������� ���������
			control.SetCommand(tvOn);

			control.PressButton();

			//��������� ���������

			control.SetCommand(tvOff);

			control.PressButton();

			
		}
		catch(Exception ex) {
			System.out.printf("Exception happened! Exception description: %s \n",ex.getMessage());
		}

	}

}
