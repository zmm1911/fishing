package com.fishing.designpattern.builder;

/**
 *
 * @author: Tony.Wang
 * @create: 2019/8/6 16:15
 **/
public class BuilderPattern {

    public static void main(String[] args) {
        CDBuilder builder = new CDBuilder();
        CdType typeSony = builder.buildSonyCd();
        typeSony.showItems();

        CdType typeSamson = builder.buildSamsonCd();
        typeSamson.showItems();
    }
}
