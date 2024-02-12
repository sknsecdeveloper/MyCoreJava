package com.arnab.builder;

public class Family {

    private int id;
    private String name;
    private int headCount;

    public Family(int id, String name, int headCount) {
        this.id = id;
        this.name = name;
        this.headCount = headCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeadCount() {
        return headCount;
    }

    public void setHeadCount(int headCount) {
        this.headCount = headCount;
    }
}
