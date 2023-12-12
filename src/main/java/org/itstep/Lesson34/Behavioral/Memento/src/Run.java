package org.itstep.Lesson34.Behavioral.Memento.src;

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			// ������� ������ ��������
			Human h = new Human("Piter", "Dymos", 44);

			MemoryState obj = new MemoryState();

			// ��������� ���������
			obj.SetMemento(h.SaveMemento());
			// �������� ������
			h.SetSurname("Dixy");
			h.SetName("Oliver");
			h.SetAge(45);
			
			// ���������� ���������
			h.RestoreMemento(obj.GetMemento());
			
			System.out.printf("\n%s %s %d\n",h.GetName(), h.GetSurname(),h.GetAge());
			
		}
		catch(Exception ex) {
			System.out.printf("Exception happened! Exception description: %s \n",ex.getMessage());
		}
	}

}
