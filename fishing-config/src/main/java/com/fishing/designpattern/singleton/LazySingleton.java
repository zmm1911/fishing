package com.fishing.designpattern.singleton;

/**
 * lazy mode singleton design pattern
 *
 */
public class LazySingleton {
    private static volatile LazySingleton instance = null;
    private LazySingleton(){

    }

    public static synchronized LazySingleton getInstance(){

        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
