package org.itstep.Lesson34.Behavioral.Strategy.src;

// ���������� ����� ���������. ��� ���������� �����
class PopStyleOfMusic implements StyleOfMusic
{
	public void SingSong(String name){
		System.out.printf("\nPop version of  %s",name);
	}
};