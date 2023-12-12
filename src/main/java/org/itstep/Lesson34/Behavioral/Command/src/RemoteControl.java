package org.itstep.Lesson34.Behavioral.Command.src;

class RemoteControl {
	private TVCommand command;
	public void SetCommand(TVCommand pCommand) {
		command = pCommand;
	}
	
	public void PressButton() {
		command.Execute();
	}
}
