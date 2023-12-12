package org.itstep.Lesson34.Behavioral.Strategy.src;

// ���������� ����� ���������. ��� ���������� �����
class RockStyleOfMusic implements StyleOfMusic
{
	@Override
	public void SingSong(String name){
		System.out.printf("\nRock version of %s",name);
	}
};