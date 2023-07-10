package com.soni.streamExample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDB {

    public static List<Employee> getList(){
        return Stream.of(new Employee(101, "soni", "A", 9000),
                new Employee(102, "moni", "C", 4000),
                new Employee(103, "toni", "B", 4000),
                new Employee(104, "koni", "A", 9000),
                new Employee(105, "honi", "C", 4000)).collect(Collectors.toList());
    }
}
