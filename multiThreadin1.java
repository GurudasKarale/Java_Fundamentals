package com.example.helloworld;


public class multiThreadin1 extends Thread {

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try{Thread.sleep(1000);}catch (Exception e){}

        }
    }

    public static void main(String args[]){

        multiThreadin1 obj1=new multiThreadin1();
        multiThreadin0 obj2=new multiThreadin0();

        obj1.start();
        obj2.start();

    }
}
