package com.example.helloworld;


//StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
//StringBuilder is non-synchronized i.e. not thread safe. It means that the two threads can call the methods of StringBuilder simultaneously.

public class StringBufferStringBuilder {

    public void buffer(){
        StringBuffer buffer=new StringBuffer("Assassins creed:");
        buffer.append("Unity");
        System.out.println(buffer);
    }

    public void builder(){
        StringBuilder builder=new StringBuilder("Assassins creed:");
        builder.append("Valhalla");
        System.out.println(builder);
    }

    public static void main(String args[]){

        StringBufferStringBuilder obj= new StringBufferStringBuilder();
        obj.buffer();
        obj.builder();
    }
}
