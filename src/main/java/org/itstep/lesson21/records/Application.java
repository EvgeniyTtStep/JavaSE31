package org.itstep.lesson21.records;

public class Application {

    String name;

    int num;

    public Application() {
    }

    public Application(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }


    public int getNum() {
        return num;
    }


    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
