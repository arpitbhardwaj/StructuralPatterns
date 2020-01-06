package com.ab.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        Integer[] integers = new Integer[] {42,43, 44};
        System.out.println(integers);
        List<Integer> integerList = Arrays.asList(integers);
        System.out.println(integerList);
    }
}
