package org.itstep.Lesson34.Structural.FlyWeight.src;

import java.util.HashMap;

class RealCharacterFactory
{
	public RealCharacterFactory() {
		chars = new HashMap <Character,AbstractCharacter>();
		pointSize = 10;
	}
	public RealCharacterFactory(int pPointSize) {
		pointSize = pPointSize;
		chars = new HashMap <Character,AbstractCharacter>();
	}

	private HashMap <Character,AbstractCharacter> chars;
	
	private int pointSize;
	public AbstractCharacter GetChar(char key) {
		
		//map<char,const AbstractCharacter*>::const_iterator result = chars.find(key);
		AbstractCharacter result = chars.get(key);
		if(result == null)
		{
			RealCharacter newCharacter = new RealCharacter(key, pointSize);
			chars.put(key, newCharacter);
			return newCharacter;
		}
		return result;
		
	}
};
