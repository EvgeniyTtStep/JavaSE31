package org.itstep.Lesson34.Behavioral.State.src;

class StateA implements BaseState
{
	public StateA() {}
	
	// �������� ��������� �� ������
	public void Handle(Context context) {
		System.out.printf("%s\n",GetNameOfState());
		context.SetState(new StateB());

	}
	public String GetNameOfState() {
		return "StateA";
	}
}