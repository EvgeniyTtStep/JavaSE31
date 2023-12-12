package org.itstep.Lesson34.Behavioral.Strategy.src;

// ���������� ����� ���������. ��� ���������� �����
class RapStyleOfMusic implements StyleOfMusic
{
	@Override
	public void SingSong(String name){
		System.out.printf("\nRap version of %s\n",name);
	}
};