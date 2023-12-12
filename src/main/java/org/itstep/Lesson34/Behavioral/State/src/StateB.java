package org.itstep.Lesson34.Behavioral.State.src;

class StateB implements BaseState
{
	public	StateB(){}
	
	// �������� ��������� �� ������
	public void Handle(Context context) {
		System.out.printf("%s\n",GetNameOfState());
		context.SetState(new StateA());
	}
	public String GetNameOfState() {
		return "StateB";
	}
};
