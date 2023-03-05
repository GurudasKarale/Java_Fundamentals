package com.example.helloworld;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class collectionLinkedList1 {

    public static void main(String args[]){
        LinkedList<Integer> ll= new LinkedList<Integer>();
        ll.add(1);
        ll.add(3);
        ll.add(5);
        ll.add(7);
        ll.add(9);
        ll.add(11);

        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }

        for(Integer ii:ll){
            System.out.println("Enhanced loop in play" + ii);
        }

        //iterate from specified position
        Iterator it=ll.listIterator(3);
        while(it.hasNext()){
            System.out.println("Printing from specified position order" +it.next());
        }

        //iterate list in reverse order
        Iterator it1=ll.descendingIterator();
        while(it1.hasNext()){
            System.out.println("Printing in reverse order" + it1.next());
        }

        //adding element at particular location
        ll.add(2,4);
        System.out.println("New element added " + ll);

        //adding element at first and last location
        ll.addFirst(6);
        ll.addLast(8);
        ll.offerFirst(10);
        ll.offerLast(12);
        System.out.println("New element added at the first and last position" + ll);

        //add new linkedlist at particular position
        LinkedList<Integer> llnew = new LinkedList<Integer>();
        llnew.add(15);
        llnew.add(16);
        llnew.add(18);
        llnew.add(17);

        ll.addAll(1,llnew);
        System.out.println("New llist added" + ll);

        //get first and last element of the linkedlist
        Object firstelement=ll.getFirst();
        Object lastelement = ll.getLast();
        System.out.println("First and last element retrieved" +firstelement+"  "+lastelement);

        //ll.remove(2)
        //ll.removeFirst()
        //ll.removeLast()
        //ll.clear()
        //Collections.swap(ll, 0, 2)
        //Collections.shuffle(l_list)
        //add two lists - a.addAll(c1);
        //a.addAll(c2);
        //c1.pop() - will remove first element
        //c1.peekFirst() - Retrieve but does not remove, the first element of a linked list
        //c1.peekLast() - Retrieve but does not remove, the last element of a linked list

        //List<String> list = new ArrayList<String>(linked_list); - Convert a linked list to array list
        //comparison output in linked list
        //LinkedList<String> c3 = new LinkedList<String>();
        //for (String e : c1)
            //c3.add(c2.contains(e) ? "Yes" : "No");
        //c1.removeAll(c1) , c1.isEmpty()
        //c1.set(1, "Orange") - Replacing 2nd element with new value

    }

}
