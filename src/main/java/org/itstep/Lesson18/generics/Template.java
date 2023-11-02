package org.itstep.Lesson18.generics;

public class Template <T> {

    T value;

    public Template() {
    }

    public Template(T value) {
        this.value = value;
    }

    public void show(){
        System.out.println("Value = " + value);
    }


    public T generic(T value){
        return value;
    }
}
