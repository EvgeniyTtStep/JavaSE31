package org.itstep.lesson21;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface Hw {
    void show();
    //interface
    //abstract - IAnimal - AbstrCAT - blackCat
}

abstract class First implements Hw{

    public void fMethod(){
        System.out.println("First");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}

class Second extends  First{
    void sMethod(){
        System.out.println("Second");
    }
}

class Main{
    public static void main(String[] args) {
        Hw second = new Second();
        ((Second)second).sMethod();//down casting

        WebDriver webDriver = new ChromeDriver();
        ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE); //casting



    }
}

