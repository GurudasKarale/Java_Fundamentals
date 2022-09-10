package com.example.helloworld;

public class superconst extends superconstbase {

    public superconst(){
        super();
        System.out.println("base class called");
    }

    public static void  main(String args[]){

        superconst obj =new superconst();
    }
}
