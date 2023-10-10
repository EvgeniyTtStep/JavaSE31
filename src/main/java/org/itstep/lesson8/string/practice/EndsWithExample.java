package org.itstep.lesson8.string.practice;

public class EndsWithExample {
    public static void main(String[] args) {

        String[] files = {"test.jpg", "hello.png", "img.img", "cat.png", "dog.png", "hot-dog.png"};

        for (int i = 0; i < files.length; i++) {
            if(files[i].endsWith(".png") && files[i].startsWith("h")){
                System.out.println(files[i]);
            }
        }
    }
}
