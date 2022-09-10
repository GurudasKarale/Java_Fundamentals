package com.example.helloworld;

public interface multiInheritInterface2 extends multiInheritInterface3 {

    default void display2(){

        System.out.println("This one is inherited");
    }
}
