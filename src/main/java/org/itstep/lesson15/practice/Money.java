package org.itstep.lesson15.practice;

public class Money {

    private long hrivnia;
    private byte kopiyka;

    public Money() {
    }

    public Money(long hrivnia, byte kopiyka) {
        kopiyka = (byte) Math.absExact(kopiyka);
        hrivnia = Math.abs(hrivnia);
        if (kopiyka >= 100) {
            hrivnia++;
            kopiyka -= 100;
        }
        this.hrivnia = hrivnia;
        this.kopiyka =kopiyka;
    }


    public void show() {
        System.out.println(hrivnia + "," + kopiyka);
    }
}
