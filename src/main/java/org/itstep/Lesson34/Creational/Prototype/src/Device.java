package org.itstep.Lesson34.Creational.Prototype.src;

/*
 *  ��� ����������� ������� ����� Device.
 *  �� ���������� ����� CloneIt, ������� ���������� 
 *  ������ �������� Prototype
 *  �������� ���� ��������, ��� ����� ���� ������������ ����������� ��������� ICloneable � ��� ����� Clone
 *  ������ � ������� ����� �� ������ ����������� ������� ��� �� �������������
 */
abstract class Device {
	// �������� ����������
	private String name;
	// ������������
	public Device() {
		SetName("Unknown device");
	}
	public Device(String dname){
		SetName(dname);
	}
	// ��������������� ������
	public String GetName(){
		return name;
	}
	public void SetName(String dname) {
		name = dname;
	}
	
	// ����������� �����
	// ��� ����� �������������� ��� �������� �����
	abstract Device CloneIt();

	// ����������� ������
	public void Show(){
		System.out.println("\nName is\n"+ GetName() +  "\n");
	}
}
