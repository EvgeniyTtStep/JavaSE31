package org.itstep.Lesson34.Creational.Prototype.src;

import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
				
			// ������ ������
			String manufacturer;
			System.out.println("\nInput manufacturer of car:\n");
			manufacturer = in.nextLine();

			String description;
			System.out.println("Input description of car:\n");
			description = in.nextLine();

			String color;
			System.out.println("Input color of car:\n");
			color = in.nextLine();

			int year;
			System.out.println("Input year of car:\n");
			year = in.nextInt();

			// �������� ������
			Car c = new Car(manufacturer, description, color, year);
			c.Show();

			System.out.println("Let's clone!\nLet's prototype!\n");

			// ��������� ������
			Car copy = (Car)c.CloneIt();
			copy.Show();
		}
		catch(Exception ex) {
			System.out.println("Exception happened! Exception description\n"+ex.getMessage());
		}

	}

}
