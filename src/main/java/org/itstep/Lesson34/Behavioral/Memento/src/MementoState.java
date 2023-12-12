package org.itstep.Lesson34.Behavioral.Memento.src;

// ����� CareTaker
// ������������ ��� �������� ���������
class MemoryState
{
	private Memento ptrMemento;
	public Memento GetMemento(){
		return ptrMemento;
	}
	public void SetMemento(Memento pMemento){
		ptrMemento = pMemento;
	}
}