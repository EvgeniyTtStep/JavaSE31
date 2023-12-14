package org.itstep.Lesson34.MyPatterns.Singleton;

import javax.management.DescriptorRead;

public class Driver {

    String name;

    public Driver() {
    }

    static Driver driverInstance;

    public void setName(String name) {
        this.name = name;
    }

    public static Driver getInstance(){
        if (driverInstance == null){
            driverInstance = new Driver();
        }
        return driverInstance;
    }

}
