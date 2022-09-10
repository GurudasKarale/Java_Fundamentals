package com.example.helloworld;

public class threadJoinAlive {

    public static void main(String args[]) throws InterruptedException{
        Runnable obj3 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

            }
        };

        Runnable obj4 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

            }
        };

        Thread t3 = new Thread(obj3);     // make sure to create object of thread in which we have to pass the object of runnable
        Thread t4 = new Thread(obj4);

        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t3.getPriority());
        System.out.println(t4.getPriority());

        t3.start();
        //try{Thread.sleep(10);}catch(Exception e){};
        t4.start();

        t3.join();  // asking main thread to wait till t3 and t4 finishes
        t4.join();

        System.out.println(t3.isAlive());
        System.out.println("bye");
    }
}
