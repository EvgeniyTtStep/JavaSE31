package org.itstep.Lesson18.inner;

public class Outer {
    private String outName;

    class Inner {

        public void showName(){
            System.out.println(outName);
        }
    }
}
