package com.example.helloworld;

import java.util.PriorityQueue;

public class collectionPriorityQueue1 {

    public static void main(String args[]){

        PriorityQueue<Integer> pq= new PriorityQueue<>();

        pq.add(1);
        pq.add(7);
        pq.add(4);
        pq.add(3);
        pq.add(9);

       for(Integer pqi:pq){
           System.out.println(pqi);
       }

       //add all the elements of one queue to another
        PriorityQueue<Integer> pq1= new PriorityQueue<>();

        pq.add(2);
        pq.add(6);
        pq.add(8);
        pq.add(10);
        pq.add(14);

        pq.addAll(pq1);
        System.out.println(pq);

        //insert specific element

        pq.offer(20);
        //pq.clear()
        //pq.size()
        //pq.peek() - retrieve first element
        //pq.poll() - retrieves and removes first element
        // List<String> array_list = new ArrayList<String>(pq1) - convert to list
    }
}
