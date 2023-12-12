package org.itstep.Lesson34.Behavioral.Visitor.src;

public class ConcreteElementB implements Element{

	public ConcreteElementB() {}
	public void Accept(BaseVisitor pVisitor) {
		pVisitor.VisitConcreteElementB(this);
	}
}
