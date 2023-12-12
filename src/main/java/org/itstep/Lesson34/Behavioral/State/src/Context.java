package org.itstep.Lesson34.Behavioral.State.src;

// ����� ���������
// ��� ���������� ��������� ����� ��������
class Context
{
	// ���������� ��� ����������� ���������
	private BaseState pCurrent;
	public Context(BaseState pTemp){
		pCurrent = pTemp;
	}
	// ���������� ���������� ���������
	public BaseState GetState(){
		return pCurrent;
	}
	// �������� ���������� ���������
	public void SetState(BaseState pTemp){
		pCurrent = pTemp;
	}
	// ��������� ��������� �������� � ����������, �������� �������� ��������� ���������
	public void Request(){
		pCurrent.Handle(this);
	}
}