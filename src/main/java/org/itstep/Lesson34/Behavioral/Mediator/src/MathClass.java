package org.itstep.Lesson34.Behavioral.Mediator.src;

class MathClass extends Trainee
{
	public MathClass(String name){
		super(name);
	}
	public void Receivee(String from, String message)
	{
		System.out.printf("\nMessage in Math class\n");
		super.Receive(from, message);
	}
}