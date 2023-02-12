package com.witstan.java1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * java内置的4大核心函数式接口
 *
 *  消费型接口 Consumer<T>     void accept(T t)
 *  供给型接口 Supplier<T>     T get()
 *  函数型接口 Function<T,R>   R apply(T t)
 *  断定型接口 Predicate<T>    boolean test(T t)
 *
 *
 *
 * @author witstan
 * @create 2023-02-11 18:05
 */
public class LambdaTest2 {

    @Test
    public void test1(){

        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("消费使人快乐，" + "今日花费：" + aDouble);
            }
        });

        System.out.println("*********");

        happyTime(400, aDouble -> System.out.println("消费使人快乐，"+ "今日花费：" + aDouble));


    }

    public void  happyTime(double money, Consumer<Double> com){

        com.accept(money);

    }

    @Test
    public void test2(){
        List<String> list = Arrays.asList("北京", "南京", "天津","东京","西京","普京");
        List<String> filterStrs = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });

        System.out.println(filterStrs);

        System.out.println("**********************");

        List<String> filterStrs1 = filterString(list, s -> s.contains("京"));
        System.out.println(filterStrs1);

    }

    //根据给定的规则，过滤集合中的字符串。此规则由Predicate的方法决定
    public List<String> filterString(List<String> list, Predicate<String> predicate){

        ArrayList<String> filterList = new ArrayList<>();
        for(String s : list){
            if(predicate.test(s)){
                filterList.add(s);
            }
        }

        return filterList;


    }


}
