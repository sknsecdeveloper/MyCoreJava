package com.arnab.javatechie.java8interview;

import java.util.ArrayList;

public class CustomArrayList {
}

class MyArrayList extends ArrayList {

    @Override
    public boolean add(Object o) {
        if(this.contains(o)) {
            return true;
        } else {
            return super.add(o);
        }

    }
}
