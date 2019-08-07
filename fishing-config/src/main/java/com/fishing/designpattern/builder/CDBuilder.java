package com.fishing.designpattern.builder;

public class CDBuilder {
    public CdType buildSonyCd(){
        CdType ct = new CdType();
        ct.addItem(new Sony());
        return ct;
    }

    public CdType buildSamsonCd(){
        CdType ct = new CdType();
        ct.addItem(new Somson());
        return  ct;
    }
}
