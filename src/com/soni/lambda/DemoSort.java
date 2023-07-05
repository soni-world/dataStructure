package com.soni.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class DemoSort {

    public void sortArrayList(){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(205);
        al.add(102);
        al.sort((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        System.out.println("Elements of the ArrayList after" +
                " sorting : " + al);
    }

    public void sortTreeSet(){
        TreeMap<Integer, String> m = new TreeMap<Integer, String>((o1, o2) -> o2.compareTo(o1));
        m.put(1, "Apple");
        m.put(4, "Mango");
        m.put(5, "Orange");
        m.put(2, "Banana");
        m.put(3, "Grapes");
        System.out.println("Elements of the TreeMap " +
                "after sorting are : " + m);

    }

}
