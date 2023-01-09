package com.witstan.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author witstan
 * @create 2023-01-07 21:45
 */
public class SubOrder extends Order<Integer>{//SubOrder: 不是泛型类

    public static <E> List<E> copyFromArrayToList(E[] arr){

        ArrayList<E> list = new ArrayList<>();

        for(E e : arr){
            list.add(e);
        }

        return list;
    }
}
