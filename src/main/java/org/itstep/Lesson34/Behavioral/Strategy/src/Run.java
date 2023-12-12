package org.itstep.Lesson34.Behavioral.Strategy.src;

public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			
			// ������� ������ ������ ���������
			// � ��� �� ������ �����
			Songs songs = new Songs();

			// �������� �����
			songs.AddSong("Yesterday");
			songs.AddSong("Problem");
			songs.AddSong("Happy New Year");

			// ���������� ��������� ��� ���������� �����
			PopStyleOfMusic pop = new PopStyleOfMusic();
			RapStyleOfMusic rap = new RapStyleOfMusic();
			RockStyleOfMusic rock = new RockStyleOfMusic();

			// ������������� ���������� ����� � ����
			songs.SetConcreteStyle(pop);
			songs.SingSongs();

			songs.SetConcreteStyle(rap);
			songs.SingSongs();

			songs.SetConcreteStyle(rock);
			songs.SingSongs();
			
		}
		catch(Exception ex) {
			System.out.printf("Exception happened! Exception description: %s \n",ex.getMessage());
		}

	}

}
