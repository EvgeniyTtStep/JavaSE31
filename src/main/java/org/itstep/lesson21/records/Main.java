package org.itstep.lesson21.records;

public class Main {
    public static void main(String[] args) {

        RecordApp recordApp = new RecordApp("Jack", 10);
        System.out.println(recordApp.name());
        System.out.println(recordApp.num());
        System.out.println(recordApp);


        RecordApp recordApp1 = new RecordApp("Bob", 20, "123456");
        System.out.println(RecordApp.salary);

    }
}
