package com.witstan.java1;

import com.witstan.java.Person;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author witstan
 * @create 2023-01-04 16:41
 */
public class TreeSetTest {

    @Test
    public void test1(){

        /*
        1. 向TreeSet中添加的数据，要求是相同类的对象。
        2. 两种排序方式：自然排序(实现Comparable接口) 和 定制排序（Comparator）

        3. 自然排序中，比较两个对象是否相同的标准为：comparaTo()返回0，不再是equals()
        4. 定制排序中，比较两个对象是否相同的标准为：compara()返回0，不再是equals()

         */
        TreeSet set = new TreeSet();

        //失败：不能添加不同类的对象
//        set.add(123);
//        set.add(456);
//        set.add("aa");
//        set.add(new User("Tom",22));

        //举例一：
//        set.add(34);
//        set.add(-34);
//        set.add(134);
//        set.add(3);
//        set.add(4);

        //举例二：
        set.add(new User("Tom",24));
        set.add(new User("Jerry",22));
        set.add(new User("David",29));
        set.add(new User("John",25));
        set.add(new User("Aron",22));
        set.add(new User("Aron",72));

        Iterator ite = set.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }


    }

    @Test
    public void test2(){
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1.getClass() == User.class && o2.getClass() == User.class){
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                }else {
                    throw new RuntimeException("输入的类型不符");
                }
            }
        };

        TreeSet set = new TreeSet(c);
        set.add(new User("Tom",24));
        set.add(new User("Jerry",22));
        set.add(new User("David",29));
        set.add(new User("John",25));
        set.add(new User("Aron",22));
        set.add(new User("Aron",72));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
