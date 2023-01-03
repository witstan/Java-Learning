package com.witstan.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Collection接口中声明的常用方法
 *
 * 向Collection接口的实现类的对象中添加数据obj时，需要重写该类的equals()
 *
 * @author witstan
 * @create 2023-01-03 15:07
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
//        Person p = new Person("Jerry", 20);
//        coll.add(p);
        coll.add(new Person("Jerry", 20));

        //1.contains()：判断当前集合中是否包含obj
        //在判断时会调用obj对象所在类的equals()
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));//true
//        System.out.println(coll.contains(p));//true
        System.out.println(coll.contains(new Person("Jerry", 20)));//false -- > true


        //2. containsAll(Collection coll1)：判断形参coll1中的所有元素是否都存在于当前集合中。
        Collection coll1 = Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));



    }

    @Test
    public void test2(){

        //3.remove(Object obj):从当前集合中移除obj元素
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        coll.remove(1234);
        System.out.println(coll);

        coll.remove(new Person("Jerry", 20));
        System.out.println(coll);

        //4. removeAll(Collection coll1):从当前集合中移除coll1中的所有元素
        Collection coll1 = Arrays.asList(123,456);
        coll.removeAll(coll1);
        System.out.println(coll);


    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        //5. retainAll(Collection coll1)：交集，获取当前集合和coll1集合的交集，并返回给当前集合
//        Collection coll1 = Arrays.asList(123,456,789);
//        coll.retainAll(coll1);
//        System.out.println(coll);

        //6. equals(Object obj)：若返回true，需要当前集合和形参集合的元素都相同
        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add(123);
        coll1.add(new Person("Jerry", 20));
        coll1.add(new String("Tom"));
        coll1.add(false);

        System.out.println(coll.equals(coll1));

    }

    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);


        //7. hashcode():返回当前对象的哈希值
        System.out.println(coll.hashCode());

        //8. 集合 ---> 数组：toArray()
        Object[] array = coll.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //拓展：数组 ---> 集合：调用Arrays类的静态方法
        List<String> list = Arrays.asList(new String[]{"aa", "bb", "cc"});
        System.out.println(list);

        List list1 = Arrays.asList(new int[]{123, 456});
        System.out.println(list1.size());//1

        List list2 = Arrays.asList(new Integer[]{123, 456});
        System.out.println(list2);//123,456

        //iterator()：返回Iterator接口的实例，用于遍历集合元素。放在Iterator.java中测试


    }
}
