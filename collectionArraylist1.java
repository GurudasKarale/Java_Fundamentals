package com.example.helloworld;

import java.util.ArrayList;
import java.util.Collections;

public class collectionArraylist1 {

    public static void main(String args[]){

        ArrayList<String> ar= new ArrayList<String>();
        ar.add("the");
        ar.add("new");
        ar.add("ghost");

        //System.out.println(ar);

        for(int i=0; i<ar.size();i++){
            System.out.println(ar.get(i));
        }

        //insert at first and last position

        ar.add(0,"before");
        ar.add(4,"arrives");


        for(String str:ar){
            System.out.println(str);
        }
        //retrieve element at position
        System.out.println(ar.get(3));
        //update the element
        ar.set(0,"after");
        System.out.println(ar);

        //ar.remove(index)
        //check if the element is present
        System.out.println(ar.contains("ghost"));
        //sort the list
        Collections.sort(ar);
        System.out.println(ar);

        //assign one list to other
        ArrayList<String> ar1= new ArrayList<String>();
        ar1=ar;
        System.out.println(ar1);

        //Collections.copy(list1,list2) - copy one list in other

        //list3.addAll(list1)
        //list3.addAll(list2)
        //list3.removeAll(list3) - empties  the list
        //list3.isEmpty() -  check if list is empty
    }
}
