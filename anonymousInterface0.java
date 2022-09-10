package com.example.helloworld;

public class anonymousInterface0 {

    public static void  main(String args[]){

        anonymousInterface1 obj = new anonymousInterface1() {
            @Override
            public void addition(int a, int b) {
                    System.out.println(b-a);
            }
        };

        obj.addition(3,2);
    }
}
