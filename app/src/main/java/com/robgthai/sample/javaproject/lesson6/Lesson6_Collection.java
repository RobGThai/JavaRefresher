package com.robgthai.sample.javaproject.lesson6;

import com.robgthai.sample.javaproject.BaseLesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;

public class Lesson6_Collection extends BaseLesson {

    public static void main (String[] args) throws Exception {
    }

    private static void demo1_collection() {
        List<String> llist = new LinkedList<>();
        llist.add("Hello");

        List<String> alist = new ArrayList<>();
        alist.add("Hello");

        Vector<String> vector = new Vector<>();
        vector.setSize(50);
        vector.add("Hello");

        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("Bonjou");
        stringStack.pop();

        Iterator<String> iter = stringStack.iterator();

        while(iter.hasNext()) {
            String s = iter.next();

            if("Hello".equals(s)) {
                iter.remove();
            }
        }
    }

    private static void demo2_map() {
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Hello", "Bonjou");

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Hello", "Bonjou");
        treeMap.put("ABC", "XYZ");

        Map<String, String> linkedHashMap = new LinkedHashMap<>(50, 0.75f, true);
        linkedHashMap.put("Hello", "Bonjou");
        linkedHashMap.put("ABC", "XYZ");

        Set<String> keys = treeMap.keySet();

        for(String key: keys) {
            pl(key);
        }
    }

}
