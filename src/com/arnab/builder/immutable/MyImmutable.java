package com.arnab.builder.immutable;

import java.util.HashMap;
import java.util.Map;

final class MyImmutable {

    private final int id;
    private final String name;
    private final Map<Integer, String> map;

    public MyImmutable(int id, String name, Map<Integer,String> myMap) {
        this.id=id;
        this.name=name;

        Map<Integer,String> tempMap = new HashMap<>();
        for(Map.Entry<Integer,String>  entry : myMap.entrySet()) {
            tempMap.put(entry.getKey(),entry.getValue());
        }

        this.map=tempMap;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, String> getMap() {

        Map<Integer,String> tempMap = new HashMap<>();
        for(Map.Entry<Integer,String> entry: map.entrySet()) {
            tempMap.put(entry.getKey(),entry.getValue());
        }




        return tempMap;
    }
}

