package com.witstan.java;

import org.junit.Test;

import java.util.*;

/**
 * @author witstan
 * @create 2023-01-06 21:24
 */
public class TreeMapTest {

    //向TreeMap中添加key-value，要求key必须是由同一个类创建的对象
    //因为要按照key进行排序：自然排序、定制排序

    //自然排序
    @Test
    public void tets1(){
        TreeMap map = new TreeMap();
        User u1 = new User("Aron", 12);
        User u2 = new User("Beck", 32);
        User u3 = new User("Jerry", 54);
        User u4 = new User("David", 23);

        map.put(u1, 98);
        map.put(u2, 78);
        map.put(u3, 81);
        map.put(u4, 100);

        Set set1 = map.entrySet();
        Iterator i = set1.iterator();
        while (i.hasNext()){
            Object o = i.next();
            //entrySet中的元素都是Entry
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }

    }

    //定制排序
    @Test
    public void test2(){
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1.getClass() == User.class && o2.getClass() == User.class){
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }
                throw new RuntimeException("传入的类型不符");
            }
        });
        User u1 = new User("Aron", 12);
        User u2 = new User("Beck", 32);
        User u3 = new User("Jerry", 54);
        User u4 = new User("David", 23);

        map.put(u1, 98);
        map.put(u2, 78);
        map.put(u3, 81);
        map.put(u4, 100);

        Set set1 = map.entrySet();
        Iterator i = set1.iterator();
        while (i.hasNext()){
            Object o = i.next();
            //entrySet中的元素都是Entry
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}
