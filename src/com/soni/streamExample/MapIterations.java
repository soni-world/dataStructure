package com.soni.streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MapIterations {

    public static void iterateMapExample(Map<String, Integer> map){
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        for(String key : map.keySet())
        {
            System.out.println(key + ":" + map.get(key));
        }

        for(Integer val : map.values()) {
            System.out.println(val);
        }

    }

    public void iterateUsingLambda(Map<String, Integer> map) {
        map.forEach((k,v) -> System.out.println((k + v)));

        map.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }

    public void reduceExample(){
        // join them with - sign
        List<String> words = Arrays.asList("GFG", "Life", "for",
                "skill", "tgf");
        Optional<String> result = words.stream().reduce((word1, word2) -> word1 + "-" + word2);
    }
}

