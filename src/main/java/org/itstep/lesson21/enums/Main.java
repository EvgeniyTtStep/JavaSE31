package org.itstep.lesson21.enums;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(Vendor.XIAOMI, "x15", 100000, Colors.BLUE);

        System.out.println(phone);

        Colors colors = Colors.YELLOW;

        System.out.println(colors);


        switch (colors.getNum()) {
            case 1:
                System.out.println("red");
            case 2:
                System.out.println("green");
        }


        switch (colors) {
            case RED -> System.out.println("red");
            case BLUE -> System.out.println("blue");
        }


        System.out.println(phone.vendor.getName());
        System.out.println(phone.vendor.name());//XIAOMI
        System.out.println(Vendor.APPLE.ordinal());//index
        System.out.println(Vendor.SAMSUNG.compareTo(phone.vendor));



    }
}
