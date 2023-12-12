package org.itstep.Lesson34.Structural.Facade.src;

// ����� Facade. ������������ ����������� ��������
// �� ������� ���� �������� � ������� � �����-���������
class Construction
{
	private EnvironmentalService eService;
	private CityService cService;
	private CountryService coService;

	public Construction() {
		eService = new EnvironmentalService();
		cService = new CityService();
		coService = new CountryService();
	}
	
	boolean IsAllowed(Firm pFirm) {
		System.out.println("\nLet's check for all permissions!\n");
		if (cService.HasCityAccess(pFirm) && coService.HasBuildingLicense(pFirm) && eService.HasEnvironmentalAccess(pFirm)) {
			return true;
		}
		return false;
	}
}
