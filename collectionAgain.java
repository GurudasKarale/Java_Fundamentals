package com.example.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class collectionAgain {

    public static  void main(String args[]){

        List<Integer>  ls= new ArrayList<>();
        List<Integer>  ls1= new ArrayList<>();
        ls.add(1);
        ls.add(3);
        ls.add(2);
        ls.add(4);
        ls.add(5);
        ls.add(6);

        ls1=ls;
        System.out.println(ls1);

        String[] ls3;
        String st="sonicmaster";
        ls3=st.split("");
        System.out.println(Arrays.toString(ls3));

        String st1="this string gets divided into tokens";
        String[] ls4;
        ls4=st1.split(" ");

        System.out.println(Arrays.toString(ls4));

        for(int i=0 ;i<ls4.length;i++){
            System.out.println(ls4[i]);
        }
    }
}
