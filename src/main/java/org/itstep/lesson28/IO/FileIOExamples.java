package org.itstep.lesson28.IO;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileIOExamples {
    public static void main(String[] args) {
        //inputOutputEx();
        //inputEx();
        //outEx();
        //bufferedInOutStream();
        //charReaderWriter();
        //charReaderWriterBuf();
        //scanner();
        streamUrl();
    }

    private static void streamUrl() {
        try(InputStream in = new URL("https://www.google.com/").openStream();
        OutputStream out = new FileOutputStream("google.html")) {

            byte[] buf = new byte[1024];
            int length;
            while ((length = in.read(buf)) != -1) {
                out.write(buf, 0, length);
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void scanner() {
        try (Scanner scanner = new Scanner(new FileInputStream("index.txt"))) {
            while (scanner.hasNext()) {
                String string = scanner.next();
                System.out.print(string + " ");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    private static void charReaderWriterBuf() {
        try (BufferedReader reader = new BufferedReader(new FileReader("index.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"))) {
            String string = reader.readLine();
            writer.write(string);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void charReaderWriter() {
        try (Reader reader = new FileReader("index.txt");
             Writer writer = new FileWriter("out.txt")) {
            char[] chars = new char[256];
            int length;
            while ((length = reader.read(chars)) != -1) {
                writer.write(chars, 0, length);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void bufferedInOutStream() {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("index.txt"));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("out.txt"))) {
            System.out.println("available = " + in.available());
            byte[] buf = new byte[in.available()];
            int length = in.read(buf);
            out.write(buf, 0, length);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    private static void inputEx() {
        try (InputStream in = new FileInputStream("index.txt");) {
            byte[] buf = new byte[5];
            int length;
            while ((length = in.read(buf)) != -1) {
                String str = new String(buf, 0, length, StandardCharsets.UTF_8);
                System.out.print(str);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void outEx() {
        try (OutputStream out = new FileOutputStream("out.txt")) {
            String str = "Feed back out stream";
            out.write(str.getBytes());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void inputOutputEx() {
        try (InputStream in = new FileInputStream("index.txt");
             OutputStream out = new FileOutputStream("out.txt")) {
            byte[] buf = new byte[5];
            int length;
            while ((length = in.read(buf)) != -1) {
                out.write(buf, 0, length);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
