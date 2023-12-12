package org.itstep.Lesson34.Behavioral.Command.src;

public class TVOnCommand extends TVCommand
{
	public TVOnCommand(TV ptr){
		super(ptr);
	}
	public void Execute(){
		if (tvPlayer != null)
			tvPlayer.TurnOn();
	}
}