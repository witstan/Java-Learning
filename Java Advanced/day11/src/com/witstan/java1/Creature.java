package com.witstan.java1;

import java.io.Serializable;

/**
 * @author witstan
 * @create 2023-01-29 12:52
 */
public class Creature<T> implements Serializable {

    private char gender;
    public double weight;

    private void breath(){
        System.out.println("creature breaths");
    }

    public void eat(){
        System.out.println("creature eats");
    }

}
