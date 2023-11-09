package org.itstep.lesson21.enums;

public enum Vendor {
    APPLE("apple"), XIAOMI("xiaomi"), SAMSUNG("samsung");

    private final String name;

    Vendor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
