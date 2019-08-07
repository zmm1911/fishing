package com.fishing.designpattern.singleton;

/**
 * hungry mode of singleton design pattern
 *
 * when the class was created ,the static instance will be created. and the instance is final ,
 * so it will not be changed for ever.It is safe for multiple thread .
 *
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return instance;
    }
}
