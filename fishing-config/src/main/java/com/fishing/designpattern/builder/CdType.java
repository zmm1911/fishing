package com.fishing.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class CdType {
    private List<Packing> list = new ArrayList<Packing>();
    public void addItem(Packing pack) {
        list.add(pack);
    }

    public void getCost(){
        for (Packing pack : list){
            pack.price();
        }
    }

    public void  showItems(){
        for (Packing pack:list){
            System.out.print("CD name："+ pack.pack());
            System.out.println(",price: "+pack.price());
        }
    }

}
