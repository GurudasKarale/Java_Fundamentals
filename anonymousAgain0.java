package com.example.helloworld;

//used to override a method of class or interface

public class anonymousAgain0 {

    public static void  main(String args[]){

        anonymousAgain1 obj = new anonymousAgain1(){

            public int addmultiply(int d, int f){
                return 3*(d+f);
            }

        };
        int am=obj.addmultiply(2,3);
        System.out.println(am);
    }

}
