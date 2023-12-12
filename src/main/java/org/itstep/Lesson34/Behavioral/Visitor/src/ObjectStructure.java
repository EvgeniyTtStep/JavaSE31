package org.itstep.Lesson34.Behavioral.Visitor.src;

import java.util.*;

class ObjectStructure	
{
	List<Element> elements;
	
	public ObjectStructure(){
		elements = new ArrayList<Element>();
	}
	

	public void Attach(Element pNew) {
		elements.add(pNew);
	}
	
	public void Detach(Element pDelete) {
		elements.remove(pDelete);
	}
	

	public void Accept(BaseVisitor pVisitor) {
		for(Element curr : elements) {
			curr.Accept(pVisitor);
		}
	}
	
}