package org.itstep.Lesson34.Behavioral.Interpreter.src;

import java.util.*;
public class Run {

	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			
			Context obj = new Context();
			List<BaseExpression> expressions = new ArrayList<BaseExpression>();
			
			expressions.add(0,new TerminalExpression());
			expressions.add(0,new NonterminalExpression());

			expressions.add(0,new TerminalExpression());
			expressions.add(0,new TerminalExpression());
			expressions.add(0,new TerminalExpression());
			
			Iterator<BaseExpression> iterator = expressions.iterator(); 

			Iterator<BaseExpression> current = iterator;

			BaseExpression pClear;

			while (iterator.hasNext() != false)
			{
				pClear = iterator.next();
				pClear.Interpret(obj);
				
				current.remove();
				current = iterator; 
			}
			
		}
    
		catch(Exception ex) {
			System.out.printf("Exception happened! Exception description: %s \n",ex.getMessage());
		}

	}

}
