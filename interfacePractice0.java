package com.example.helloworld;

public class interfacePractice0 implements interfacePractice1{

    public void sub(int a, int b){

        System.out.println(a-b);
    }
    public static void main(String args[]){

        interfacePractice0 obj= new interfacePractice0();
        obj.sub(3,4);
    }
}


//class extends class
//interface extends interface
//class implements interface

