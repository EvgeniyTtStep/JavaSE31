package org.itstep.lesson28.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class FileIOExamples {
    public static void main(String[] args) {
        inputOutputEx();
        inputEx();
        outEx();
    }
    private static void inputEx() {

        try {
            InputStream in = new FileInputStream("index.txt");
            byte[]buf = new byte[5];
            int read;
            while ((read = in.read(buf)) != -1){
                String str = new String(buf, 0, read, StandardCharsets.UTF_8);
                System.out.print(str);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


    private static void outEx() {
    }



    private static void inputOutputEx() {
    }
}
