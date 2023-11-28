package org.itstep.Lesson29.serialization;

import java.io.*;

public class Point {
    int x;
    int y;


    public static void pointOut(Point point){
        try(OutputStream out = new FileOutputStream("point.txt");) {
            DataOutput dataOutput = new DataOutputStream(out);
            dataOutput.writeInt(point.x);
            dataOutput.writeInt(point.y);
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void pointIn(Point point){
        try(InputStream in = new FileInputStream("point.txt");) {
            DataInput dataInput =  new DataInputStream(in);
            point.x = dataInput.readInt();
            point.y = dataInput.readInt();

            System.out.println("Read point = " + point);

        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class MainPoint{
    public static void main(String[] args) {
        //Point point = new Point();
        //point.x = 10;
        //point.y = 20;
        //System.out.println("point = " + point);
        //Point.pointOut(point);
        Point.pointIn(new Point());

    }
}
