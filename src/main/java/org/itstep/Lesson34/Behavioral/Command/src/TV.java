package org.itstep.Lesson34.Behavioral.Command.src;

// ����� Receiver ����� ����������
class TV
{
	// ������� ��������� ��� ���
	private boolean on;
	// �������� ���������
	public void TurnOn() {
		System.out.print("\nTurn on TV\n");
		on = true;
	}
	// ��������� ���������
	public void TurnOff() {
		System.out.print("\nTurn off TV\n");
		on = false;
	}
}