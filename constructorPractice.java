package com.example.helloworld;

import java.security.PublicKey;

public class constructorPractice {

    int age;
    int b[];
    String s;
    int g;
    int h;

    public constructorPractice(){

        age=20;
        int b[]={3,4,5,6};
        s="bbb";
        System.out.println(age+""+s);
    }

    public constructorPractice(int g,int h){

        this.g=g;
        this.h=h;
        System.out.println(g+h);
    }
    public static void main(String args[]){

        constructorPractice obj=new constructorPractice();
        obj=new constructorPractice(3,4);

    }
}
