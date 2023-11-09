package org.itstep.lesson21.enums;

public class Phone {
    Vendor vendor;
    String model;
    long price;
    Colors colors;

    public Phone(Vendor vendor, String model, long price, Colors colors) {
        this.vendor = vendor;
        this.model = model;
        this.price = price;
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "vendor='" + vendor.getName() + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", colors=" + colors +
                '}';
    }
}
