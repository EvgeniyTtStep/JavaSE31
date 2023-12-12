package org.itstep.Lesson34.Creational.Builder.src;

public class Run {

	public static void main(String[] args) {
		try {
			// ������� ������ ������ ���������
			AircraftConstructor shop = new AircraftConstructor();

			// ������� ������ ������ ���������. ���� ������ ����� ��������� �����������
			AircraftBuilder builder = new HangGliderBuilder();

			// ��������� ����������
			shop.Construct(builder);

			// ���������� ���������� � �����������
			builder.GetAircraft().Show();

			// ������� ������ ������ ���������. ���� ������ ����� ��������� �������
			builder = new GliderBuilder();

			// ��������� ������
			shop.Construct(builder);

			// ���������� ���������� � �������
			builder.GetAircraft().Show();

		}
		catch(Exception ex) {
			System.out.println("Exception happened!\nException description:\n"+ex.getMessage());
		}
	}
}