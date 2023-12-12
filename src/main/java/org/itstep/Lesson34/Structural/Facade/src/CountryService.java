package org.itstep.Lesson34.Structural.Facade.src;

// �����, ���������� �� �������� ������� �������� �� ������������� � �����
class CountryService
{
	public CountryService(){}
	
	// ���� �� � ����� �������� �� ������������� �� ������� ������
	public boolean HasBuildingLicense(Firm pFirm) {
		return pFirm.GetBuilderLicense() ? true : false;
	}
}