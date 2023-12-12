package org.itstep.Lesson34.Creational.AbstractFactory.src;

// �����, ����������� ���������  � ��� ������������
public class PC {
	
	Box box;
	Processor processor;
	MainBoard mainBoard;
	Hdd hdd;
	Memory memory;
	
	public PC() {
		box = null;
		processor = null;
		mainBoard = null;
		hdd = null;
		memory = null;
	}
	public Box GetBox() {
		return box;
	}
	public void SetBox(Box pBox){
		box = pBox;
	}

	public Processor GetProcessor() {
		return processor;
	}
	public void SetProcessor(Processor pProcessor) {
		processor = pProcessor;
	}

	public MainBoard GetMainBoard() {
		return mainBoard;
	}
	public void SetMainBoard(MainBoard pMainBoard) {
		mainBoard = pMainBoard;
	}

	public Hdd GetHdd() {
		return hdd;
	}
	public void SetHdd(Hdd pHdd) {
		hdd = pHdd;
	}

	public Memory GetMemory() {
		return memory;
	}
	public void SetMemory(Memory pMemory) {
		memory = pMemory;
	}
}
