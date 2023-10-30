package org.itstep.lesson16.practice;

public class Pilot extends Human{
    String plane;

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void fly(){
        System.out.println(name + "in fly");
    }
}
