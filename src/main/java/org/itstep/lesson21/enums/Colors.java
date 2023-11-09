package org.itstep.lesson21.enums;

public enum Colors {
    RED(1),
    GREEN(2),
    BLUE(3),
    YELLOW(4);


    private int num;



    Colors(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Colors{" +
                "num=" + num +
                '}';
    }
}
