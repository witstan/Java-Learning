package com.witstan.jff;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author witstan
 * @create 2023-01-06 23:12
 */
public class TwoSum {

    public static void main(String[] args) {
        TwoSum test = new TwoSum();
        int[] arr = new int[]{0,4,1,-8,78,23,-90};
        int[] ints = test.twoSum(arr, -8);
        System.out.println(Arrays.toString(ints));

    }


    public int[] twoSum(int[] num, int target){
        HashMap map = new HashMap();
        List list = new ArrayList();
        for(int i = 0; i < num.length; i++){
            map.put(num[i],target - num[i]);
            list.add(num[i]);
            if(map.containsKey(target - num[i]) && i != list.indexOf(target - num[i])){
                return new int[]{list.indexOf(target - num[i]), i};
            }
        }
        return null;
    }

}
