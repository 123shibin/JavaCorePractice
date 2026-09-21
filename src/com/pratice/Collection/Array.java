package com.pratice.Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Array {
    public static void main(String[] args){
        var list = new ArrayList<>();
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("9");
        list.add("9");
        list.add("10");
        list.addFirst("1");
        list.addLast("11");

        System.out.println(list);

        var list1 = new LinkedList<>();
        list1.add("45");
        list1.add("shibih");
        System.out.println(list1);
        list1.addFirst("first");
        System.out.println(list1.get(1));
        list1.remove(list1.size()-2);
        System.out.println(list1);
    }
}
