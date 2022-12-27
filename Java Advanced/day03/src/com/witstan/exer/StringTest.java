package com.witstan.exer;

/**
 * @author witstan
 * @create 2022-12-27 18:15
 */
public class StringTest {

    String str = new String("good");
    int i = 0;
    char[] ch = { 't', 'e', 's', 't' };

    public void change(String str, char ch[], int i) {
        i = 1;
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch, ex.i);
        System.out.print(ex.str + " and ");//
        System.out.println(ex.ch);
        System.out.println(ex.i);
    }
}
