package org.itstep.lesson20.statics;

public interface Transport {

    String MATERIAL = "metal";

    void drive();

    void stop();

    default void transportDEF(){
        System.out.println("default");
    }

    static void transportStatic(){
        System.out.println("static");
    }

    private void transportPrivate(){
        System.out.println("private");
    }


}
