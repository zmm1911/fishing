package com.fishing.designpattern.builder;

public class Sony extends Compony {

    @Override
    public String pack(){
        return "this is sony CD";
    }
    @Override
    public int price(){
        return 20;
    }

}
