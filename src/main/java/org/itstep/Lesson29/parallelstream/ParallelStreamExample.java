package org.itstep.Lesson29.parallelstream;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParallelStreamExample {
    public static void main(String[] args) {

        parallelStreamsExample();

    }

    private static void parallelStreamsExample() {
        int max = 30_000_000;
        List<String> values = new ArrayList<>(max);

        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        System.out.format("%nSequence%n-------%n");
        List<String> cpy = new ArrayList<>(values);

        long start = System.currentTimeMillis();
        //Instant start = Instant.now();

        cpy.stream()
                .sorted()
                .count();

        //Instant end = Instant.now();

        //long seq = Duration.between(start, end).getNano();

        long end = System.currentTimeMillis();
        long seq = end - start;
        System.out.println("seq: " + seq);



        System.out.format("%nParallel%n-------%n");
        start = System.currentTimeMillis();
        //start = Instant.now();
        values.parallelStream()
                .sorted()
                .count();
        end = System.currentTimeMillis();
        //end = Instant.now();
//        long par = Duration.between(start, end).getNano();

        long par = end - start;
        System.out.println("\npar: " + par);

        System.out.println("seq/par: " + ((double) seq / par));
    }
}
