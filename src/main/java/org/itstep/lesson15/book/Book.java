package org.itstep.lesson15.book;

public class Book {
    private String name;
    private String auhtorName;
    private int year;
    private String vendor;


    public Book() {
        name = "Конституція України";
        auhtorName = "Олександр Міроненко";
        year = 1942;
        vendor = "ВР";
        genre = "Законодавство";
        pages = 500;

    }

    public Book(String name, String auhtorName, int year, String vendor, String genre, int pages) {
        this.name = name;
        this.auhtorName = auhtorName;
        this.year = year;
        this.vendor = vendor;
        this.genre = genre;
        this.pages = pages;
    }

    public Book(String name, String auhtorName) {
        this.name = name;
        this.auhtorName = auhtorName;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuhtorName() {
        return auhtorName;
    }

    public void setAuhtorName(String auhtorName) {
        this.auhtorName = auhtorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    private String genre;
    private int pages;



    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", auhtorName='" + auhtorName + '\'' +
                ", year=" + year +
                ", vendor='" + vendor + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                '}';
    }
}
