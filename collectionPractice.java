package com.example.helloworld;

import java.net.Inet4Address;
import java.util.*;

public class collectionPractice {

    public static void main(String args[]){

        Map<Integer,List<Integer>> m= new HashMap<>();
        List<Integer> li1=new ArrayList<>();
        //Set<Integer> keys=m.keySet();

        for (int i =0;i<4;i++){
            List<Integer> li=new ArrayList<>();
            for (int j =0;j<4;j++) {

                li.add(j+1);

            }
            m.put(i,li);
        }
        System.out.println(m);

        for (Integer key : m.keySet()){
            System.out.println(key+":"+m.get(key));
            li1=m.get(key); // value for corresponding key will be returned which is list and assigned to a new list
            for (int k=0;k<4;k++){    // iterating through the list
                System.out.println(li1.get(k));  // use get instead of li1[index]
            }
        }
    }
}
