package com.mycompany.linkedlistexample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main (String [] args) {
        LinkedList<String> list = new LinkedList<> ();

        list.add ("Rocky Road");
        list.add ("Cookies & Cream");
        list.add ("Dark Chocolate");
        list.add ("Mango");

        System.out.println ("My Favorite Ice Cream Flavors: " + list);
        
        Iterator<String> DreamGadgets = list.iterator();
        while(DreamGadgets.hasNext()) {
        	System.out.println(DreamGadgets.next());
        }
    }
}