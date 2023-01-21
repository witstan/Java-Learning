package com.witstan.java;

import org.junit.Test;

import java.io.*;

/**
 * 对象流的作用
 * 1. ObjectInputStream 和 ObjectOutputStream
 * 2. 作用：用于存储和读取基本数据类型或对象的处理流。
 * 它的强大之处就是可以把Java中的对象写入到数据源中，也能把对象从数据源中还原回来。
 * 3. 要序列化java对象，需要满足一定要求。见Person.java
 * 4. 序列化机制:
 * 对象序列化机制允许把内存中的Java对象转换成平台无关的二进制流，
 * 从而允许把这种二进制流持久地保存在磁盘上，或通过网络将这种二进制流传输到另一个网络节点。
 * 当其它程序获取了这种二进制流，就可以恢复成原来的Java对象
 *
 *
 *
 * @author witstan
 * @create 2023-01-21 16:03
 */
public class ObjectInputOutputStreamTest {

    /*
    序列化过程：将内存中的java对象保存到磁盘中或通过网络传输
    使用ObjectOutputStream实现

     */
    @Test
    public void test1(){
        //1.
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
            //2.
            oos.writeObject(new String("helloworld"));
            oos.flush();//刷新操作

            oos.writeObject(new Person("Tom",21));
            oos.flush();

            oos.writeObject(new Person("Jerry",21,001,new Account(1000)));
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null){
                //3.
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /*
    反序列化：将磁盘文件中的对象还原为内存中的java对象
    使用ObjectInputStream实现

     */
    @Test
    public void testObjectInputStream(){

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));

            Object obj = ois.readObject();

            String s = (String)obj;
            Person p = (Person) ois.readObject();
            Person p1 = (Person) ois.readObject();
            System.out.println(s);
            System.out.println(p);
            System.out.println(p1);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }


}
