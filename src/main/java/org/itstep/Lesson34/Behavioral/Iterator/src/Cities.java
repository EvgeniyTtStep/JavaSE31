package org.itstep.Lesson34.Behavioral.Iterator.src;

public class Cities implements Container {
   public String namesOfCities[] = {"Paris" , "London" ,"Tokyo" , "New York", "Amsterdam"};

   @Override
   public Iterator getIterator() {
      return new CityIterator();
   }

   private class CityIterator implements Iterator {

      int index;

      @Override
      public boolean hasNext() {
    	 return index < namesOfCities.length? true:false; 
      }

      @Override
      public Object next() {
         return this.hasNext() == true? namesOfCities[index++]:null;
         
      }		
   }
}