package com.witstan.exer1;

import java.util.*;

/**
 * @author witstan
 * @create 2023-01-09 17:26
 */
public class DAO<T> {

    private Map<String, T> map;

    public DAO() {
        map = new HashMap<>();
    }

    public void save(String id, T entity){
        map.put(id, entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id, T entity){
        if(map.containsKey(id)){
            map.put(id, entity);
        }
    }

    public List<T> list(){
        //方式一：
        Collection<T> values = map.values();
        ArrayList<T> list = new ArrayList<>();
        for(T t : values){
            list.add(t);
        }
        return list;

        //方式二
//        Collection<T> values = map.values();
//        ArrayList<T> list = new ArrayList<>();
//        Iterator<T> iterator = list.iterator();
//        while (iterator.hasNext()){
//            list.add(iterator.next());
//        }
//        return list;
    }

    public void delete(String id){
        map.remove(id);
    }



}
