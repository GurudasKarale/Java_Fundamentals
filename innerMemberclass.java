package com.example.helloworld;


public class innerMemberclass {

    public static void  main(String args[]){

        innerMemberclass1 obj= new innerMemberclass1();

        innerMemberclass1.Inner obj1=obj.new Inner();  //
        obj1.add(3,5);

    }
}
