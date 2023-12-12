package org.itstep.Lesson34.Structural.Proxy.src;

// �����, ��� �������� ����� ������
public class Mathematics implements IMathematics
{
	@Override
	public double Addition(double x, double y) { return x + y; }
	@Override
	public double Subtraction(double x, double y) { return x - y; }
	@Override
	public double Multiplication(double x, double y) { return x * y; }
	@Override
	public double Division(double x, double y) { return x / y; }
}