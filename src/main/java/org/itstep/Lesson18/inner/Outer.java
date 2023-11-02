package org.itstep.Lesson18.inner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Outer {
    private String outName;

    public void show(){
        System.out.println(outName);
    }

    class Inner {
        String outName;//затенение
        public void showName(){
            System.out.println(outName);
        }
    }

}
