package com.example.helloworld;

public class anonymousClass0 {

    public static void main(String args[]){

        anonymousClass1 obj = new anonymousClass1(){
          public void addd(int a, int b){
              System.out.println(a+b+3);
          }
        };

        obj.addd(1,2);

    }

}
