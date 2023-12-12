package org.itstep.Lesson34.Behavioral.Visitor.src;

class VisitorSecond implements BaseVisitor
{
	public void VisitConcreteElementA(ConcreteElementA pA) {
		System.out.print("\nVisitor Second\t Element A\n");
	}
	public void VisitConcreteElementB(ConcreteElementB pB) {
		System.out.print("\nVisitor Second\t Element B\n");
	}
}
