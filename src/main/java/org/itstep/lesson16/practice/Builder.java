package org.itstep.lesson16.practice;

public class Builder extends Human{
    String profession;

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void building(){
        System.out.println(name + " buiding house");
    }

}
