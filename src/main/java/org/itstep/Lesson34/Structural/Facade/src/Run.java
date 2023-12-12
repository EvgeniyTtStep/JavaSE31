package org.itstep.Lesson34.Structural.Facade.src;

public class Run {

	public static void main(String[] args) {
		try {
			// ������� ������ ������ Facade
			Construction constructor = new Construction();

			// ������� ������ �����
			Firm myfirm = new Firm("DreamBuilder", true, true, false);
			
			// ��������� ��� �� ���������� ���� � ����� �� �������������
			boolean allowable = constructor.IsAllowed(myfirm);

			System.out.println(myfirm.GetName() + ((allowable) ? " will build\n\n" : " won't build\n\n"));

		}
		catch(Exception ex) {
			System.out.println("Exception happened! Exception description\n"+ex.getMessage());
		}


	}

}
