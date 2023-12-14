package org.itstep.Lesson34.Structural.Proxy.src;

import java.util.HashSet;
import java.util.Set;

// ����� ������
class MathematicsProxy implements IMathematics{

	// �������������� ������, ��� �������������� �������� ����������
	private Mathematics math;
	public MathematicsProxy() {
		math = new Mathematics();
	}


	// �������� ������� ��������
	@Override
	public double Addition(double x, double y){
		return math.Addition(x, y);
	}
	@Override
	public double Subtraction(double x, double y){
		return math.Subtraction(x, y);
	}
	@Override
	public double Multiplication(double x, double y){
		return math.Multiplication(x, y);
	}
	@Override
	public double Division(double x, double y){
		return math.Division(x, y);
	}
}
