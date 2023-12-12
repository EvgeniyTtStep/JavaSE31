package org.itstep.Lesson34.Behavioral.ChainOfResponsibility.src;

class LocalManager extends Manager
{
	public void Process(Claim request){
		if(request.GetAmount()<1000.0)
		{
			System.out.print("\nYour request was approved by local manager. Here is information about it\n");
			
			System.out.printf("%s %s %.2f\n", request.GetTypeOfClaim(),request.GetFrom(), request.GetAmount());
		}
		else
		{
			pSuccessor.Process(request);
		}
	}
};
