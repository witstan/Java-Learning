package com.witstan.java;

import org.junit.Test;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素的遍历操作，使用迭代器Iterator接口
 * 1. 内部的方法：hasNext(), next()
 * 2. 集合对象每次调用iterator()方法都得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前。
 *  默认游标都在集合的第一个元素之前。
 * 3. 内部定义了remove()，可以在遍历的时候，删除集合中的元素。此方法不同于集合直接调用remove
 *
 *
 * @author witstan
 * @create 2023-01-03 15:56
 */
public class IteratorTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator i = coll.iterator();
        //方式一：
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        //报异常
//        System.out.println(i.next());

//        //方式二：不推荐
//        for (int j = 0; j < coll.size() ; j++) {
//            System.out.println(i.next());
//        }

        //方式三：推荐
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator i = coll.iterator();

        //错误方式二
//        while(i.next() != null){
//            System.out.println(i.next());
//        }


        //错误方式二:
        // 集合对象每次调用iterator()方法都得到一个全新的迭代器对象
//        while(coll.iterator().hasNext()){
//            coll.iterator().next();
//        }

    }

    //测试Iterator中的remove()
    //如果还未调用next()或在上一次调用next方法之后已经调用了remove(),
    //再调用remove都会报IllegalStateException
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        //删除集合中“Tom”
        Iterator i = coll.iterator();
        while (i.hasNext()){
            Object obj = i.next();
            if("Tom".equals(obj)){
                i.remove();
            }
        }

        //遍历集合
        i = coll.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
