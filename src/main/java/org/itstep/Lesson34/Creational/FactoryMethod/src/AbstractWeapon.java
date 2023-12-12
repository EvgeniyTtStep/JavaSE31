package org.itstep.Lesson34.Creational.FactoryMethod.src;

/*
* ����� ������������ ������
*/
abstract class AbstractWeapon {
	/*
	* ��������� ����� ��� �������� ����.
	*/
	protected abstract AbstractBullet CreateBullet();
	
	private Point3D location;
	private Vector3D direction;
	private double caliber;	
	/*
	* ������� ��������� ������
	*/
	public Point3D GetLocation() {
		return location;
	}
	public void SetLocation(Point3D newLocation) {
		location = newLocation;
	}
	/*
	* ����������� ������
	*/
	public Vector3D GetDirection(){
		return direction;
	} 
	public void SetDirection(Vector3D newDirection) {
		direction = newDirection;
	}
	/*
	* ������ ������
	*/
	public double GetCaliber() {
		return caliber;
	}
	public void SetCaliber(double newCaliber) {
		caliber = newCaliber;
	}
	/*
	* �����, ������������ �������.
	* ���������� ��������� ��������� ����.
	*/
	public AbstractBullet Shoot(){
		// �������� ������� ���� � ������� ���������� ������
		AbstractBullet bullet = CreateBullet();
		// ��������� ���� �� ������� ��������� ������
		bullet.SetCaliber(this.GetCaliber());
		bullet.SetLocation(this.GetLocation());
		bullet.SetDirection(this.GetDirection());
		// ������ �������� ����
		bullet.StartMovement();
		// ���������� ��������� ����
		return bullet;
	}
}

/*
* ����� ��������������� ������.
*/
class AutomaticWeapon extends AbstractWeapon
{
	public AutomaticWeapon(){
		SetCaliber(20);
	}
	/*
	* ���������� ���������� ������.
	* ������� ��������� ����,
	* ������������� ��� �������� ���� ������.
	*/
	protected AbstractBullet CreateBullet(){
		return new AutomaticBullet();
	}
}

/*
* ����� ���������.
*/
class Shotgun extends AbstractWeapon
{
	public Shotgun(){
		SetCaliber(50);
	}
	/*
	* ���������� ���������� ������.
	* ������� ��������� ����,
	* ������������� ��� �������� ���� ������.
	*/
	protected AbstractBullet CreateBullet(){
		return new ShotgunBullet();
	}
}