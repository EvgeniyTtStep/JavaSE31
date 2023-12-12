package org.itstep.Lesson34.Behavioral.Command.src;

// ����� Command
abstract class TVCommand
{
	protected TV tvPlayer;
	public TVCommand(TV pTV){
		tvPlayer = pTV;
	}
	public abstract void Execute();
}
