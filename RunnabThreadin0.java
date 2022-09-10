package com.example.helloworld;

public class RunnabThreadin0 implements Runnable {

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try{Thread.sleep(1000);}catch (Exception e){}

        }
    }

    public static void main(String args[]){

        Runnable obj1=new RunnabThreadin0();
        Runnable obj2=new RunnabThreadin1();

        Thread t1 = new Thread(obj1);     // make sure to create object of thread in which we have to pass the object of runnable
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
