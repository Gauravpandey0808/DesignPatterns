package Revision.singletondesignpattern;

import java.util.ArrayList;
import java.util.List;

public class SingletonDesignPattern {

    private static SingletonDesignPattern instance;
    private static List<String> connection;


    private SingletonDesignPattern() {
        System.out.println("This is singleton design pattern");
        connection = new ArrayList<>();
    }

    public static SingletonDesignPattern getConnection() {
        if(instance == null) {
            instance = new SingletonDesignPattern();
        }
        return instance;
    }
}
