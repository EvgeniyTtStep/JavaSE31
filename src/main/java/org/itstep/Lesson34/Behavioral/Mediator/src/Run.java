package org.itstep.Lesson34.Behavioral.Mediator.src;

public class Run {
	public static void main(String[] args) {
		try {
			// ������� ������ �������� ��������
			Classroom classroom = new Classroom();

			// ������� ��������������� ������
			Trainee piter = new MathClass("Piter");
			Trainee tim = new MathClass("Tim");
			Trainee brad = new MathClass("Brad");
			Trainee joana = new MathClass("Joana");

			// ������������ �� � ������
			classroom.Register(piter);
			classroom.Register(tim);
			classroom.Register(brad);
			classroom.Register(joana);

			// �������� ���������
			piter.Send("Brad", "3*3+7");
			joana.Send("Tim", "21-78*3");
		}
		catch(Exception ex) {
			System.out.printf("Exception happened! Exception description: %s \n",ex.getMessage());
		}

	}

}
