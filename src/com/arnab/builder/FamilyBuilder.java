package com.arnab.builder;

public class FamilyBuilder {


    private int id;
    private String name;
    private int headCount;

    public FamilyBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public FamilyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public FamilyBuilder setHeadCount(int headCount) {
        this.headCount = headCount;
        return this;
    }

    public Family build(){
        return new Family(id,name,headCount);
    }
}
