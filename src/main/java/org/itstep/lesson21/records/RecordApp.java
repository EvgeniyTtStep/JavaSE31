package org.itstep.lesson21.records;

public record RecordApp(String name, int num) {
    static String salary;
    private static final String email = "emaol@email.com";

    public RecordApp(String name, int num, String salary){
        this(name, num);
    }

}
