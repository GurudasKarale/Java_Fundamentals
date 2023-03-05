package com.example.helloworld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class collectionHashMap1 {

    public static void main(String args[]){

        HashMap<Integer,String> hsm=new HashMap<Integer,String>();

        hsm.put(1,"thats");
        hsm.put(2,"amazing");
        //System.out.println(hsm);

        for(Map.Entry j: hsm.entrySet()){
            System.out.println(j.getKey()+" "+j.getValue());
        }

        ArrayList <Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        HashMap<Integer,ArrayList<Integer>> hsm1=new HashMap<Integer,ArrayList<Integer>>();

        hsm1.put(1,list1);
        hsm1.put(2,list1);
        //System.out.println(hsm);

        for(Map.Entry k: hsm1.entrySet()) {
            System.out.println(k.getKey() + " " + k.getValue());
        }

        System.out.println(hsm1.get(1));
        for(int y=0;y< hsm1.get(1).size();y++){
            System.out.println(hsm1.get(1).get(y));
        }

        //map.size() - gives the size of map
        //map1.putAll(map2) - copy one map to another
        //map.clear() - removes all the entries from the map
        //map.isEmpty()
        //map.containsKey("") - returns true or false
        //map.entrySet() -  creates set view of mappings
        //map.keySet() - creates set view of keys
    }
}
