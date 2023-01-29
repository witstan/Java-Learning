package com.witstan.java2;

import com.witstan.java1.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 *
 * @author witstan
 * @create 2023-01-29 13:57
 */
public class OtherTest {
    /*
    获取构造器结构
     */
    @Test
    public void test1(){
        Class clazz = Person.class;
        //getConstructors(): 获取当前运行时类中声明为public的构造器
        Constructor[] constructors = clazz.getConstructors();
        for(Constructor c : constructors){
            System.out.println(c);
        }

        System.out.println();
        //getDeclaredConstructors() : 获取当前运行时类中声明的所有的构造器
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for(Constructor c : declaredConstructors){
            System.out.println(c);
        }
    }

    //获取运行时类的父类
    @Test
    public void test2(){
        Class clazz = Person.class;

        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);

    }

    //获取运行时类带泛型的父类
    @Test
    public void test3(){
        Class clazz = Person.class;

        Type superclass = clazz.getGenericSuperclass();
        System.out.println(superclass);

    }

    //获取运行时类带泛型的父类的泛型
    @Test
    public void test4(){
        Class clazz = Person.class;

        Type superclass = clazz.getGenericSuperclass();
        ParameterizedType p = (ParameterizedType) superclass;
        Type[] actualTypeArguments = p.getActualTypeArguments();
        for(Type t: actualTypeArguments){
            System.out.println(t.getTypeName());
        }
    }

    //获取运行时类的接口
    @Test
    public void test5() {
        Class clazz = Person.class;
        Class[] interfaces = clazz.getInterfaces();
        for (Class c : interfaces) {
            System.out.println(c);
        }

        System.out.println();

        Class[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for (Class c :
                interfaces1) {
            System.out.println(c);
        }
    }

    /*
    获取运行时类所在的包

     */
    @Test
    public void test6() {
        Class clazz = Person.class;

        Package aPackage = clazz.getPackage();
        System.out.println(aPackage);
    }

    /*
    获取运行时类声明的注解

     */
    @Test
    public void test7() {
        Class clazz = Person.class;

        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation a :
                annotations) {
            System.out.println(a);
        }

    }




}
