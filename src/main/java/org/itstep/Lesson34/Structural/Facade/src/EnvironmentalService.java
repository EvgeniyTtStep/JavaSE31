package org.itstep.Lesson34.Structural.Facade.src;

// �����, ���������� �� �������� ������������� ����� �������������
class EnvironmentalService
{
	public EnvironmentalService() {}
	
	// ���� �� � ����� ���������� �� ������������� �� ������� ������������� ������
	public boolean HasEnvironmentalAccess(Firm pFirm) {
		return pFirm.GetEnvironmentalLicense() ? true : false;
	}
}