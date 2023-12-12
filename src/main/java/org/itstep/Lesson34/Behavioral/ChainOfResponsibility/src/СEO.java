package org.itstep.Lesson34.Behavioral.ChainOfResponsibility.src;

class CEO extends Manager {

	public CEO() {}
	public void Process(Claim request)
	{
		if (request.GetAmount()<100000.0)
		{
			System.out.print("\nYour request was approved by CEO. Here is information about it\n");
			System.out.printf("%s %s %.2f\n", request.GetTypeOfClaim(),request.GetFrom(), request.GetAmount());
		}
		else
		{
			System.out.print("\nWe are not able to approve your claim\n");
		}
	}

}
