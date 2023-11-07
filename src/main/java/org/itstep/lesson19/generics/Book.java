package org.itstep.lesson19.generics;

public class Book<T> {
    String name;
    int pages;


    //приймає тільки Number or Integer
    public void method1(App<? super Integer> app) {
        System.out.println(app.value);
    }


    public void method(App<? extends Number> app) {
        System.out.println(app.value);
    }
}


class App<T> {
    T value;

    public App(T value) {
        this.value = value;
    }
}

class Main {
    public static void main(String[] args) {
        App<Integer> integerApp = new App<>(10);
        App<String> stringApp = new App<>("hello");

        Book<Integer> book = new Book<>();
        book.method(integerApp);
        //book.method(stringApp);

    }
}

