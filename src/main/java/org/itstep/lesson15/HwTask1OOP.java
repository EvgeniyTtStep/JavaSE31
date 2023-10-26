package org.itstep.lesson15;

import org.itstep.lesson14.shape.Shape;

import java.util.Scanner;

public class HwTask1OOP {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num of shapes ");
        int size = scanner.nextInt();

        Shape[] shapes = new Shape[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter x = ");
            int x = scanner.nextInt();
            System.out.println("Enter y = ");
            int y = scanner.nextInt();
            shapes[i] = new Shape(x, y);
            System.out.println(shapes[i]);
        }
    }
}
