package org.itstep.Lesson34.Behavioral.Interpreter.src;

public class NonterminalExpression implements BaseExpression{

	public NonterminalExpression() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Interpret(Context context) {
		System.out.print("\nNonTerminalExpression  version of Interpret\n");
	}
}
