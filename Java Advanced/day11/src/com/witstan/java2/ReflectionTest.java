package com.witstan.java2;

import com.witstan.java1.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 调用运行时类中指定的结构：属性、方法，构造器
 * @author witstan
 * @create 2023-01-29 16:37
 */
public class ReflectionTest {
    /*


     */
    @Test
    public void testField() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class clazz = Person.class;

        //创建运行时类的对象
        Person p1 = (Person) clazz.newInstance();

        //获取指定的属性：要求运行时类的属性声明为public
        //通常不采用
        Field id = clazz.getField("id");

        /*
        设置当前属性的值

        set(): 参数1：指明设置哪个对象的属性 参数2：将此属性设置为多少
         */
        id.set(p1,1001);

        /*
        获取当前属性的值
        get(): 参数1：获取哪个对象的当前属性值
         */
        int p1Id = (int)id.get(p1);
        System.out.println(p1Id);

    }

    //如何操作运行时类中的指定的属性 -- 需要掌握
    @Test
    public void testField1() throws Exception {
        Class clazz = Person.class;

        //创建运行时类的对象
        Person p1 = (Person) clazz.newInstance();

        //1. getDeclaredField(String fieldName) : 获取运行时类中指定变量名的属性
        Field name = clazz.getDeclaredField("name");

        //2. 保证当前属性时可访问的，调用setAccessible()
        name.setAccessible(true);
        //3. 获取、设置指定对象的此属性值
        name.set(p1,"Tom");

        System.out.println(name.get(p1));


    }

    /*
    如何调用运行时类中的指定方法 -- 需要掌握
     */
    @Test
    public void testMethod() throws Exception{

        Class clazz = Person.class;

        //创建运行时类的对象
        Person p1 = (Person) clazz.newInstance();

        /*
        1. 获取指定的某个方法
        getDeclaredMethod(): 参数1：指明获取的方法的名称  参数2：指明获取的方法的形参列表
         */
        Method show = clazz.getDeclaredMethod("show", String.class);

        ////2. 保证当前属性时可访问的
        show.setAccessible(true);
        /*
        3. 调用方法的invoke(): 参数1：方法的调用者  参数2：给方法形参复制的实参
        invoke()的返回值即为对应对类中调用的方法的返回值。
         */
        Object fiji = show.invoke(p1, "Fiji");//p.show("Fiji");
        System.out.println(fiji);


        System.out.println("*******调用静态方法********");

        //private static void showDesc()
        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        //如果调用的运行时类没有返回值，则此invoke()返回null
//        Object returnVal = showDesc.invoke(clazz);
        Object returnVal = showDesc.invoke(null);
        System.out.println(returnVal);//null


    }

    /*
    如何调用运行时类中的指定的构造器
     */
    @Test
    public void testConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Person.class;

        //private Person()
        /*
        1.获取指定的构造器
        getDeclaredConstructor(): 参数：指明构造器的参数列表

         */
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);

        //2. 保证此构造器时可以访问的
        declaredConstructor.setAccessible(true);

        //3. 调用此构造器造对象
        Person tom = (Person)declaredConstructor.newInstance("Tom");
        System.out.println(tom);


    }


}
