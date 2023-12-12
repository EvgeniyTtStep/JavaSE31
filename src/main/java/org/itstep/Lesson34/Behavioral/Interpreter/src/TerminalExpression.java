package org.itstep.Lesson34.Behavioral.Interpreter.src;

public class TerminalExpression implements BaseExpression {

	public TerminalExpression() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Interpret(Context context) {
		System.out.print("\nTerminalExpression  version of Interpret\n");
	}

}
