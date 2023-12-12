package org.itstep.Lesson34.Structural.Composite.src;

public class Run {

	public static void main(String[] args) {
		try {
			
			// ������ ����
			CompositeUnit fleet = new CompositeUnit();
			
			// ������� 4 ����������� �������
			for (int i = 0; i<4; ++i)
				fleet.AddUnit(new MonoTubeShip());
			
			// ������� 3 ����������� �������
			for (int i = 0; i<3; ++i)
				fleet.AddUnit(new TwinTubeShip());
				
			// ������� 2 ����������� �������
			for (int i = 0; i<2; ++i)
				fleet.AddUnit(new TripleTubeShip());

			// ������� ���� �������������� �������
			fleet.AddUnit(new FourTubeShip());
			
			// ��������� �������� �����
			
			// ������ ���� ������ �����
			System.out.printf("Full power of our fleet: %d\n",fleet.GetPower());
		}
		catch(Exception ex) {
			System.out.println("Exception happened! Exception description\n"+ex.getMessage());
		}


	}

}
