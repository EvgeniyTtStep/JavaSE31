package org.itstep.lesson19.compare;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Book1", 57);
        Book book2 = new Book("Book2", 79);

        BookComparator comparator = new BookComparator();
        int compare = comparator.compare(book1, book2);
        System.out.println("compare = " + compare);


        int compareTo = book1.compareTo(book2);
        System.out.println("compareTo = " + compareTo);


    }
}
