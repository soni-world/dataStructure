package com.soni.dataType.turing;

import java.util.ArrayList;
import java.util.List;

public class TestQuestion1 {
    // input = 10 output = ["-1", "-1","three", "-1","five", "three", "-1", "-1","three", "-1"]
    // if divisible by 3 then keep three, if 5 keep five if both keep both

    public static List<String> checkMultiple(int input){
        List<String> res = new ArrayList<>();
        for(int i = 1; i <= input; i++ ){
            if(i%3==0 && i%5==0){
                res.add("both");
            }else if(i%5==0 ){
                res.add("five");
            }else if(i%3==0){
                res.add("three");
            }else{
                res.add("-1");
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> t = checkMultiple(30);
        t.stream().forEach(k->System.out.print(k + " "));
    }
}
