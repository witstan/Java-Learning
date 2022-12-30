package com.witstan.java;

import org.junit.Test;

/**
 * @author witstan
 * @create 2022-12-30 15:22
 */
public class IDEADebug {

    @Test
    public void testStringBuffer() {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());//

        System.out.println(sb);//

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);//
    }
}
