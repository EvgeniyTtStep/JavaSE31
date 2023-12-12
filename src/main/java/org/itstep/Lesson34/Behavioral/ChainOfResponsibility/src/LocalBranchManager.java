package org.itstep.Lesson34.Behavioral.ChainOfResponsibility.src;

public class LocalBranchManager extends Manager {
	
	public LocalBranchManager() {}
	
	public void Process(Claim request) {
		if (request.GetAmount()<10000.0){
			System.out.print("\nYour request was approved by local branch manager. Here is information about it\n");
			
			System.out.printf("%s %s %.2f\n", request.GetTypeOfClaim(),request.GetFrom(), request.GetAmount());
		}
		else{
			pSuccessor.Process(request);
		}
	}
	
}
