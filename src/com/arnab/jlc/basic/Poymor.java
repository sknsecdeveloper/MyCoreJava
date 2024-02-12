package com.arnab.jlc.basic;

public class Poymor {
}

interface Irequest{

    public void getdata();
    public default String getAddress(){
        return "delhi";
    }
}

interface Iresponse{

    public void getdata();
    public default String getAddress(){
        return "delhi";
    }
}

class Ax implements Irequest {

    @Override
    public void getdata() {

    }
    @Override
    public String getAddress(){
        return "delhi";
    }




}

class Bx implements Iresponse {

    @Override
    public void getdata() {

    }
    @Override
    public String getAddress(){
        return "delhi";
    }
}

class Driver implements Irequest, Iresponse {

    @Override
    public void getdata() {

    }

    @Override
    public String getAddress() {
        return Irequest.super.getAddress();
    }
}