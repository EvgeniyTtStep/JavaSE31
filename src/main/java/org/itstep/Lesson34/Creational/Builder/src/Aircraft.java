package org.itstep.Lesson34.Creational.Builder.src;

import java.util.*;
// ������� ����� ��� ���������� ����������
class Aircraft
{
	public Aircraft(String type) {
		aircraftType = type;
		parts = new HashMap<String, String>(); 
	}
	// ��� ������������ ����������
	private String aircraftType;
	// ��������� ���������� �� ����������
	HashMap<String, String> parts;
	// ��������� ���������� � ���������� ����� ����������
	public String GetPart(String key) throws Exception {
		if (!CheckForPart(key)) {
			throw new Exception("There is no such key!");
		}
		return parts.get(key);
	}
	// ��������� �������� ��� ���������� ����� ����������
	public void SetPart(String key, String value) {
		parts.put(key, value);
	}
	// �������� �� ������� �����
	public boolean CheckForPart(String key) {
		return parts.get(key) != null? true:false;
	}
	// ����������� ���������� �� ����������� ����������
	public void Show() {
		System.out.println("\n====================\n");

		System.out.println("Aircraft Type:" + aircraftType+"\n");

		System.out.println("Frame:" + parts.get("frame") + "\n");

		System.out.println("Engine:" + parts.get("engine") + "\n");

		System.out.println("Wheels:" + parts.get("wheels") + "\n");

		System.out.println("Doors:" + parts.get("doors") + "\n");
	}
}
