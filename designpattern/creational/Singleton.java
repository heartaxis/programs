package com.designpattern.creational;

import java.io.Serializable;

public class Singleton implements Serializable,Cloneable {
    private static Singleton single_instance = null;
    private Singleton(){}
    // static method to create instance of Singleton class
    public static Singleton getInstance(){
        if (single_instance == null)
        {
            //synchronized block to remove overhead
            synchronized (Singleton.class)
            {
                if(single_instance==null)
                {
                    // if instance is null, initialize
                    single_instance = new Singleton();
                }
            }
        }
        return single_instance;
    }

    //avoid deserailize
    protected Object readResolve(){
        return single_instance;
    }

    //avoid cloning issue with singleton
    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}

