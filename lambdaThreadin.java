package com.example.helloworld;

public class lambdaThreadin {

    public static void main(String args[]) {
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

        t3.start();
        t4.start();

    }

}