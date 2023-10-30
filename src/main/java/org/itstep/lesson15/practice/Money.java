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
        this.kopiyka = kopiyka;
    }


    public void show() {
        System.out.println(hrivnia + "," + kopiyka);
    }

    public void add(long hrivnia, byte kopiyka) {
        int temp = this.kopiyka;
        this.hrivnia += hrivnia;
        temp += kopiyka;
        if (temp > 100) {
            this.hrivnia += 1;
            temp -= 100;
            this.kopiyka = (byte) temp;
        }

    }
}
