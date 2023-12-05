package org.itstep.lesson30_31.multithreadind;

public class Application5 {
    static class Friend {
        private String name;


        public Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public synchronized void seyHi(Friend friend) {
            System.out.println("\nHi от " + this.name + " к " + friend.getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            hiBack(friend);
        }

        public synchronized void hiBack(Friend friend) {
            System.out.println("Back от " + this.name + " к " + friend.getName());
            seyHi(friend);//происходит взаимная блокировка
        }

        public static void main(String[] args) {
            Friend petr = new Friend("Петр");
            Friend ivan = new Friend("Иван");

            new Thread(() -> petr.seyHi(ivan)).start();
            new Thread(() -> ivan.seyHi(petr)).start();
        }
    }

}
