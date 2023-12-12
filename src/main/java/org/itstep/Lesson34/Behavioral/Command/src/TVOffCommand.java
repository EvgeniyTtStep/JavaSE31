package org.itstep.Lesson34.Behavioral.Command.src;

class TVOffCommand extends TVCommand
{
	public TVOffCommand(TV ptr){
		super(ptr);
	}
	public void Execute(){
		if (tvPlayer != null)
			tvPlayer.TurnOff();
	}
};