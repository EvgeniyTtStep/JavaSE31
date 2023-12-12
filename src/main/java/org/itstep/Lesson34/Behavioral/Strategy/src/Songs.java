package org.itstep.Lesson34.Behavioral.Strategy.src;

import java.util.*;

// ����� ���������
class Songs
{
	public Songs() {
		songs = new Vector<String>();
	}
	// ��������� �� ���������� ���������
	private StyleOfMusic pStyle;
	// �����
	private Vector<String> songs;
	// ���������� �����
	public void AddSong(String name){
		songs.add(name);
	}
	// ��������� ���������� ��������� 
	public void SetConcreteStyle(StyleOfMusic ptr){
		pStyle = ptr;
	}
	// ��������� ����� � ���������� ����� (��������� ���������� ���������)
	public void SingSongs(){
		System.out.print("\n\nLet's sing\n\n");
		for (int i = 0;i < songs.size();i++)
		{
			pStyle.SingSong(songs.get(i));
		}
		System.out.print("\n\nThe end\n\n");
	}
};
