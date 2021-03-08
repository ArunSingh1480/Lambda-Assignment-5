package com.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class getDistinctString {

    public List<String> getString()
    {
        List<String> list = Arrays.asList("the", "three", "the", "three", "the", "three", "an" ,"an", "a");
        List<String> ls= list.stream().distinct().sorted().collect(Collectors.toList());
        return ls;
    }
}
