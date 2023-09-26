package org.itstep.lesson2;

public class Practice {
    public static void main(String[] args) {
        int x = 3; //3
        int y = ++x * 2; // 8
        x+= -y * 3 + ++x + --y; //-8
        y += (-x++) % 3; //9
        int z = x + y; //2
        System.out.println(z);
    }
}
