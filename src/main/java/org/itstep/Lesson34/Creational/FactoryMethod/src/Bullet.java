package org.itstep.Lesson34.Creational.FactoryMethod.src;

/*
* ����� � ���������� ������������.
* ������������ ��� ����������� ���������.
*/
class Point3D {
	private int X;
	private int Y;
	private int Z;
	
	public Point3D(int px, int py, int pz) {
		X = px;
		Y = py;
		Z = pz;
	}
	
	public int getX() {
		return X;
	}
	public void setX(int px) {
		X = px;
	}
	public int getY() {
		return Y;
	}
	public void setY(int py) {
		Y = py;
	}
	public int getZ() {
		return Z;
	}
	public void setZ(int pz) {
		Z = pz;
	}
}

/*
* ������ � ���������� ������������.
* ������������ ��� ����������� �����������.
*/
class Vector3D {
	private int X;
	private int Y;
	private int Z;
	
	public Vector3D(int px, int py, int pz) {
		X = px;
		Y = py;
		Z = pz;
	}
	
	public int getX() {
		return X;
	}
	public void setX(int px) {
		X = px;
	}
	public int getY() {
		return Y;
	}
	public void setY(int py) {
		Y = py;
	}
	public int getZ() {
		return Z;
	}
	public void setZ(int pz) {
		Z = pz;
	}
}

/*
* ����� ����������� ����.
*/
abstract class AbstractBullet
{
	private Point3D location;
	private Vector3D direction;
	private  double caliber;

	/*
	* ������� ��������� ����
	*/
	public Point3D GetLocation() {
		return location;
	}
	public void SetLocation(Point3D newLocation) {
		location = newLocation;
	}
	
	/*
	* ����������� ����
	*/
	public Vector3D GetDirection() {
		return direction;
	}
	public void SetDirection(Vector3D newDirection) {
		direction = newDirection;
	}

	/*
	* ������ ����
	*/
	public double GetCaliber() {
		return caliber;
	}
	public void SetCaliber(double newCaliber) {
		caliber = newCaliber;
	}

	/*
	* ������ �������� ����.
	*/
	public void StartMovement()
	{
		// ���������� ������ ��������
	}
	/*
	* ����� ��������� ����.
	* ��� ��� ������ ���� ���� �������� ���� ��-�������,
	* �� ����� ������ ���� ���������� � ����������.
	*/
	abstract void HitTarget(Object target);
	/*
	* �����, ����������� �������� ����.
	* ��� ��� ������ ���� ���� ����� ������ ���������� ��������,
	* �� ����� ������ ���� ���������� � ����������.
	*/
	abstract void Movement();
}

/*
* ����� ���� ��� ��������������� ������.
*/
class AutomaticBullet extends AbstractBullet
{
	public void HitTarget(Object target){
		// ���������� ��������� ���� target
		System.out.println("Hit by automatic bullet\n");
	}
	public void Movement(){
		// ���������� ��������� �������� ����
	}
}

/*
* ����� ���� ��� ���������.
*/
class ShotgunBullet extends AbstractBullet
{
	public void HitTarget(Object target){
		// ���������� ��������� ���� target
		System.out.println("Hit by shotgun bullet\n");
	}
	public void Movement(){
		// ���������� ��������� �������� ����
	}
}