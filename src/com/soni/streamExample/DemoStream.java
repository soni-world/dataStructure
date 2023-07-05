package com.soni.streamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
    public static void test(){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(123);
        al.add(8239);

        List<Integer> an = al.stream().filter(n -> n > 1000).collect(Collectors.toList());
        System.out.println("Marks of students  after grace : " + an);

        List<Integer> ann = al.stream().map(i -> i*200).collect(Collectors.toList());
    }
}
