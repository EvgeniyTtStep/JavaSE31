package org.itstep.lesson19.compare;

import java.util.Comparator;

public class BookComparator extends Book implements Comparator<Book> {

    public BookComparator() {
    }

    public BookComparator(String name, int pages) {
        super(name, pages);
    }

// - порівнюємо сторінки
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o1.pages - o2.pages;// 100 - 90 = 10
//    }

// - порінюємо назви
    @Override
    public int compare(Book o1, Book o2) {
        return o1.name.compareTo(o2.name);
    }
}
