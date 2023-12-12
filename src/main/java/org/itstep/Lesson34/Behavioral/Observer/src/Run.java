package org.itstep.Lesson34.Behavioral.Observer.src;

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			// ������� ������ ������ � ��������� ����� 100 000
			Car bmw = new Car("bmw X9", 100000);

			// ������� ������� ������������� ����������� ������
			UkrainianBuyer firstBuyer = new UkrainianBuyer("Petr Mikolaenko");
			UkrainianBuyer secondBuyer = new UkrainianBuyer("Oleg Kononenko");

			// ���������� ������������ ���������� �������
			bmw.Attach(firstBuyer);
			bmw.Attach(secondBuyer);

			// �������� ���� ������, ���������������� ���������� ��� �� ������ �� ����
			bmw.SetPrice(80000);
			bmw.SetPrice(70000);
			bmw.SetPrice(60000);
			
			bmw.Detach(secondBuyer);
			bmw.SetPrice(90000);
	
		}
		catch(Exception ex) {
			System.out.printf("Exception happened! Exception description: %s \n",ex.getMessage());
		}
	}

}
