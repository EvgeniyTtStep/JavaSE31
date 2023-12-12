package org.itstep.Lesson34.Structural.Facade.src;

// �����, ���������� �� �������� ���� �� ������������� �� ��������� �����
class CityService
{
	public CityService() {}
	
	// ���� �� � ����� ���������� �� ������������� �� ������
	public boolean HasCityAccess(Firm pFirm) {
		return pFirm.GetCityLicense() ? true : false;
	}
}