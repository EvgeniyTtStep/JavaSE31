package org.itstep.Lesson34.Creational.AbstractFactory.src;

//��������� ������ ����������
interface Device {
	public abstract String Info();
}

//����������� ����� ���������� �����
abstract class Box implements Device{

}

//����������� ����� �������� �����
abstract class Hdd implements Device {

}

//����������� ����� ����������� �����
abstract class MainBoard implements Device {
}

//����������� ����� ����������
abstract class Processor implements Device {
}

//����������� ����� ������
abstract class Memory implements Device {
}

//���������� ����� ����������. ��������� AMD
class AmdProcessor extends Processor
{
	public String Info(){
		return "AmdProcessor";
	}
}

//���������� ����� ����������� �����. ����������� ����� Asus
class AsusMainBord extends MainBoard
{
	public String Info(){
		return "AsusMainBord";
	}
}

//���������� ����� ���������� �����. ���������� ���� ������ �����
class SilverBox extends Box
{
	public String Info(){
		return "SilverBox";
	}
}

//���������� ����� ����������. Intel ���������
class IntelProcessor extends Processor
{
	public String Info(){
		return "IntelProcessor";
	}
}

//���������� ����� �������� �����. ������� ���� LG
class LGHDD extends Hdd
{
	public String Info(){
		return "LG hdd";
	}
}

//���������� ����� ����������� �����. ����������� ����� MSI
class MSIMainBord extends MainBoard
{
	public String Info(){
		return "MSIMainBord";
	}
}

class BlackBox extends Box
{
	public String Info(){
		return "BlackBox";
	}
}

//���������� ����� ���. ��� DDR
class DdrMemory extends Memory
{
	public String Info(){
		return "DdrMemory";
	}
}

//���������� ����� �������� �����. ������� ���� Samsung
class SamsungHDD extends Hdd
{
	public String Info(){
		return "Samsung hdd";
	}
}

//���������� ����� ���. ��� DDR2
class Ddr2Memory extends Memory
{
	public String Info(){
		return "Ddr2Memory";
	}
}

