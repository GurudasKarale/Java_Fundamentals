package com.example.helloworld;

public class multiThreadin0 extends Thread {

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);}catch (Exception e){}

        }
    }

}
