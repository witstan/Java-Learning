package com.witstan.java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author witstan
 * @create 2023-01-06 21:41
 */
public class PropertiesTest {

    //Properties:常用来处理配置文件。key和value都是String类型
    public static void main(String[] args) throws Exception{
        FileInputStream f = null;
        try {
            Properties p = new Properties();
            f = new FileInputStream("jdbc.properties");
            p.load(f);//加载流对应的文件

            String name = p.getProperty("name");
            String password = p.getProperty("password");

            System.out.println( "name = " + name + ", password = " + password);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(f != null){
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
