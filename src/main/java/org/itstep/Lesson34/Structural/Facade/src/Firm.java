package org.itstep.Lesson34.Structural.Facade.src;

// ����� �����
class Firm
{
	// ������������ � ����������
	public Firm() {
		builderLicense = false;
		name = "";
	}
	public Firm(String fName,boolean bLicense,boolean eLicense, boolean cLicense) {
		builderLicense = bLicense;
		name = fName;
		environmentalLicense = eLicense;
		cityLicense = cLicense;
	}
	
	// �������� �����
	private String name;
	// ���� �� ������������ �������� � �����
	private boolean builderLicense;
	// ���� �� ������������� ����������
	private boolean environmentalLicense;
	// ���� �� ���������� �� ������
	private boolean cityLicense;

	// ������� ��� ������ � ������
	public String GetName() {
		return name;
	}
	public void SetName(String fName) {
		name = fName;
	}
	// ������� ��� ������ �� ������������ ��������
	public boolean GetBuilderLicense(){
		return builderLicense;
	}
	public void SetBuilderLicense(boolean bLicense){
		builderLicense = bLicense;
	}
	// ������� ��� ������ � ������������� �����������
	public boolean GetEnvironmentalLicense() {
		return environmentalLicense;
	}
	public void SetEnvironmentalLicense(boolean eLicense) {
		environmentalLicense = eLicense;
	}
	// ������� ��� ������ � ��������� �����������
	public boolean GetCityLicense() {
		return cityLicense;
	}
	public void SetCityLicense(boolean cLicense) {
		cityLicense = cLicense;
	}


}

