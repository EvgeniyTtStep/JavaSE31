package org.itstep.Lesson34.MyPatterns.Singleton;

public class Run {
    public static void main(String[] args) {
        Driver wondowsDriver = Driver.getInstance();
        wondowsDriver.setName("WindowsDriver");


        Driver linuxDriver = Driver.getInstance();
        linuxDriver.setName("LinuxDriver");



        System.out.println("driver = " + wondowsDriver.name);
        System.out.println("driver = " + linuxDriver.name);

    }
}
