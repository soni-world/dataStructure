package com.soni.consumerDemo;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemoTest {
    public static void main(String[] args) {
//        Consumer<Integer> con = t -> System.out.println("print >> "+ t);
//        con.accept(10);
        List<Integer> test = Arrays.asList(1,4,8,9);
        test.stream().forEach(t -> System.out.println("print >> "+ t));
    }
}
