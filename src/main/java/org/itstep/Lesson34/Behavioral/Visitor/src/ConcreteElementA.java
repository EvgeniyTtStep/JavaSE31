package org.itstep.Lesson34.Behavioral.Visitor.src;

public class ConcreteElementA implements Element{

	public ConcreteElementA() {}
	public void Accept(BaseVisitor pVisitor) {
		pVisitor.VisitConcreteElementA(this);
	}
}
