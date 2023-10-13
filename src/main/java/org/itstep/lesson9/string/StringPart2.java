package org.itstep.lesson9.string;

import java.util.Arrays;

public class StringPart2 {
    public static void main(String[] args) {

        String str = "\s\s\s\s\sHello Java     ";
        System.out.println("str = " + str);

        //===== trim() =====
        System.out.println("trim = " + str.trim());
        //==== strip() =====
        System.out.println("strip = " + str.strip());


        // ===== isEmpty() ==== isBlank() =====
        String empty = "       ";

        System.out.println("isEmpty() = " + empty.isEmpty());
        System.out.println("isBlank() = " + empty.isBlank());


        String color = " Red, green - Blue: yellow ";
        //String colorStrip = color.strip();
        //String colorStripLower = colorStrip.toLowerCase();

        String[] colors =
                color
                        .strip()
                        .toLowerCase()
                        .replace("red", "pink")
                        .split("[ ,:-]");

        for (int i = 0; i < colors.length; i++) {
            if (!colors[i].isBlank()) {
                System.out.println(colors[i]);
            }
        }


        // ======= substring() =========
        String lorem = """
                Lorem Ipsum is java simply dummy
                text of the printing and typesetting industry.
                 Lorem Ipsum has been the industry's standard
                  dummy text ever since the 1500s, when an unknown
                  printer took a galley java of type and scrambled it to\s
                  make a type specimen book. It has Java survived not only
                   five centuries, but also the leap into electjavaronic typesetting,
                    remaining essentially unchanged. It was popularised in the
                     1960s with JAVa the release of Letraset sheets containing\s
                     Lorem Ipsum passages, and java more javAAAA recently with desktop\s
                     publishing software like Aldus PageMaker including versions of Lorem Ipsum java.
                     """;

        int index = lorem.indexOf("It");
        System.out.println("index = " + index);

        String java = lorem.substring(index, index + 20);//повертає підрядок вказвши перший та останній індекси.
        System.out.println(java);


        //повертає підрядок вказвши перший index
        System.out.println(lorem.substring(300));
    }
}
