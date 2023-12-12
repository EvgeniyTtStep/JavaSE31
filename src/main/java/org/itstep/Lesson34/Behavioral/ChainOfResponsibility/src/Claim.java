package org.itstep.Lesson34.Behavioral.ChainOfResponsibility.src;

class Claim
{
	private String typeOfClaim;
	private String from;
	private double amountOfMoney;

	public Claim(String t,String f,double a){
		SetTypeOfClaim(t);
		SetFrom(f);
		SetAmount(a);
	}

	public String GetTypeOfClaim()
	{
		return typeOfClaim;
	}
	public void SetTypeOfClaim(String t)
	{
		typeOfClaim = t;
	}

	public String GetFrom()
	{
		return from;
	}
	public void SetFrom(String f)
	{
		from = f;
	}

	public double GetAmount()
	{
		return amountOfMoney;
	}
	public void SetAmount(double a)
	{
		amountOfMoney = a;
	}
}