package com.funpodium.multithread;

public class Volatile {

    private static volatile int counter = 0; // volatile 讀寫都直接從記憶體來

    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            int local_counter = counter;
            while (local_counter<10){
//                System.out.print("- ");
                if (local_counter!=counter){
                    System.out.println("t1 local counter changes");
                    local_counter = counter;
                }
            }
        });

        Thread t2 = new Thread(()->{
            int local_counter = counter;

            while (local_counter<10){
                System.out.println("t2 incremented counter to "+(local_counter+1));
                counter = ++local_counter;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        t1.start();
        t2.start();
    }
}
