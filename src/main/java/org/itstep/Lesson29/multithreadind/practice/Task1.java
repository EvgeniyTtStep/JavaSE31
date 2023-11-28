package org.itstep.Lesson29.multithreadind.practice;

//Завдання 1:
//Користувач вводить з клавіатури значення в масив, після чого
//запускаються два потоки. Перший потік знаходить максимум в
//масиві. Другий потік знаходить мінімум в масиві. Результати
//обчислень повертаються у метод main.
public class Task1 {

    static class ArrMax extends Thread {
        int[] arr;

        public ArrMax(int[] arr) {
            this.arr = arr;
        }

        @Override
        public void run() {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("max = " + max);
        }
    }

    static class ArrMin extends Thread {
        int[] arr;

        public ArrMin(int[] arr) {
            this.arr = arr;
        }

        @Override
        public void run() {
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            System.out.println("min = " + min);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30, -40, 50, 60, 70, -80};

        ArrMax arrMax = new ArrMax(arr);
        ArrMin arrMin = new ArrMin(arr);


        //ці потоки запускаються одночасно та працюють паралельно
        arrMax.start();
        arrMin.start();


        int countNeg = 0;
        int countPos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPos++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("countPos = " + countPos);


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                countNeg--;
            }
        }
        System.out.println("countNeg = " + countNeg);

    }
}
