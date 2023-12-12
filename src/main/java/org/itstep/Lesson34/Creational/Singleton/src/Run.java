package org.itstep.Lesson34.Creational.Singleton.src;

import java.io.*;
import java.time.LocalDateTime;


/*
* ����� ������� ������� ���������.
* �������������� - ������ ������� � ����������� ��������� ����.
* � ��������� ����� ������������ ������ � ����� ����������.
*/
class Logger {
	// ����������� ������, ����� ������ ���� ������� ����� ������� � ����� ������������ ������
	private Logger() {}
	// ��������� �� ������� ������ ������
	static Logger refInstance;

	// ����������� ����� ��� ��������� ������� � ������� �����������
	// ������ ���������, ���� �� �� �����������. ���� �� ����������� ������������ ������ �� ��� ��������� ������
	public static Logger GetInstance() {
		if (refInstance == null) {
			refInstance = new Logger();
		}
		return refInstance;
	}
	// ����� ��� ������ ����� � ���-����
	public void PutMessage(String message) throws FileNotFoundException{
		try(PrintStream out = new PrintStream(new FileOutputStream("logsingleton.txt",true))){
			out.print(message+"\n"+LocalDateTime.now().toString()+"\n");
		}
		
	}
}


public class Run {

	public static void main(String[] args) {
		try {
			
			System.out.println("Logging started\n");
			// �������� ������ � ������� �����������
			Logger refLogger = Logger.GetInstance();
			// ���������� ������ � �����������
			refLogger.PutMessage("This is first");
			refLogger.PutMessage("This is second");
			System.out.println("Logging ended\n");
		
			
		}
		catch(Exception ex) {
			System.out.println("Exception happened! Exception description\n"+ex.getMessage());
		}

	}

}
