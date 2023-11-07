package org.itstep.lesson19.compare;

import java.util.Comparator;

public class Book implements Comparable<Book>{
    String name;
    int pages;

    public Book() {
    }

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    @Override
    public int compareTo(Book book) {
        return this.pages - book.pages;
    }
}
