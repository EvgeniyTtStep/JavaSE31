package org.itstep.Lesson34.Creational.AbstractFactory.src;

// ����� ������������
public class PCConfigurator
{
	/*
	*  ������� ������������ ������������� ����������
	*/
	private IPCFactory pcFactory;
	
	public PCConfigurator() {
		pcFactory = null;
	}
	public IPCFactory GetPCFactory() {
		return pcFactory;
	}
	public void SetPCFactory(IPCFactory pcCurrentFactory) {
		pcFactory = pcCurrentFactory;
	}
	
	/*
	*  ����� ���������������� ���������� �����
	*/
	public void Configure(PC pc)
	{
		pc.SetBox(pcFactory.CreateBox());
		pc.SetMainBoard(pcFactory.CreateMainBoard());
		pc.SetHdd(pcFactory.CreateHdd());
		pc.SetMemory(pcFactory.CreateMemory());
		pc.SetProcessor(pcFactory.CreateProcessor());
	}
}

