package org.itstep.Lesson34.Behavioral.ChainOfResponsibility.src;

abstract class Manager
{
	protected Manager pSuccessor;
	public void SetSuccessor(Manager pTemp){
		pSuccessor = pTemp;
	}
	public abstract void Process(Claim request);
}