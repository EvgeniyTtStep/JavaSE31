package org.itstep.Lesson34.Creational.AbstractFactory.src;/*
* ��������� ������� ��� �������� ������������
* ���������� ����� ������������� ����������
*/

interface IPCFactory {
	Box CreateBox();
	Processor CreateProcessor();
	MainBoard CreateMainBoard();
	Hdd CreateHdd();
	Memory CreateMemory();
}

/*
* ������� ��� �������� "��������" ������������
* ���������� ����� ������������� ����������
*/
class HomePcFactory implements IPCFactory {
	@Override
	public Box CreateBox(){
		return new SilverBox();
	}
	@Override
	public Processor CreateProcessor(){
		return new IntelProcessor();
	}
	@Override
	public MainBoard CreateMainBoard(){
		return new MSIMainBord();
	}
	@Override
	public Hdd CreateHdd(){
		return new SamsungHDD();
	}
	@Override
	public Memory CreateMemory(){
		return new Ddr2Memory();
	}
}

/*
* ������� ��� �������� "�������" ������������
* ���������� ����� ������������� ����������
*/
class OfficePcFactory implements IPCFactory {
	@Override
	public Box CreateBox(){
		return new BlackBox();
	}
	@Override
	public Processor CreateProcessor(){
		return new AmdProcessor();
	}
	@Override
	public MainBoard CreateMainBoard(){
		return new AsusMainBord();
	}
	@Override
	public Hdd CreateHdd(){
		return new LGHDD();
	}
	@Override
	public Memory CreateMemory(){
		return new DdrMemory();
	}
}
