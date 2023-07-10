package com.soni.streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.soni.streamExample.EmployeeDB.getList;

public class MapReduce {

    public static void main(String[] args) {
        List<Integer> ll = Arrays.asList(3,6,7,1,8);

        Integer res = ll.stream().reduce(0, (a, b) -> a+b);
        System.out.print(res);

        Integer op = ll.stream().reduce(1, (a,b) -> a*b);
        System.out.println(op);

        List<String> ls = Arrays.asList("gdjasd", "hdvwuid", "djkhdkiwjdliwqjdldn");

        String resStr = ls.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
        System.out.println(resStr);

        List<Employee> data = getList();
        Double test = data.stream().filter( l-> l.getGrade().equals("A")).map(l -> l.getSalary()).mapToDouble(l->l).average().getAsDouble();
        System.out.println(test);


    }
}
