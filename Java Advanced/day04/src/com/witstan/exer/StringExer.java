package com.witstan.exer;

import org.junit.Test;

import java.util.Arrays;

/**
 * 1. 模拟一个trim方法，去除字符串两端的空格。
 *
 * 2. 将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”
 *
 * 3. 获取一个字符串在另一个字符串中出现的次数。比如：获取“ ab”在  “abkkcadkabkebfkabkskab” 中出现的次数
 *
 * 4.获取两个字符串中最大相同子串。比如：
 * str1 = "abcwerthelloyuiodef";str2 = "cvhellobnm"
 * 提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 *
 * 5.对字符串中字符进行自然顺序排序。
 * 提示：
 * 1）字符串变成字符数组。
 * 2）对数组排序，选择，冒泡，Arrays.sort();
 * 3）将排序后的数组变成字符串。
 *
 *
 * @author witstan
 * @create 2022-12-29 16:49
 */
public class StringExer {

    public static void main(String[] args) {

        StringExer se = new StringExer();
        String s1 = "7 h3 83h keir ";
        String s2 = se.trim1(s1);
        System.out.println(s2);

        System.out.println("*************");

        String s3 = "abckkcabcdkabkebfkabkskababc";
        String s4 = se.indexReverse(s3, 3,6);
        System.out.println(s4);

        System.out.println("*************");

        String s5 = "abc";

        System.out.println(se.subStringCount(s5,s3));

        System.out.println("*************");

        String s6 = "abcwerthello12yuiodef";
        String s7 = "cvhello12bnm";

        System.out.println(se.maxSubStr(s6,s7));

        System.out.println("*************");

        System.out.println(se.stringSort(s6));

    }

//    @Test
//    public void test(){
//        String s1 = " j 9";
//        char[] arr = s1.toCharArray();
//        System.out.println(Arrays.toString(arr));
//    }

    //1. 模拟一个trim方法，去除字符串两端的空格。
    public String trim1(String s){
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != ' '){
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }

    //2. 将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”
    public String indexReverse(String s, int beginindex, int endindex){
        String s1 = s.substring(beginindex, endindex);
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        StringBuilder sb1 = new StringBuilder(s);
        sb1.replace(beginindex, endindex, sb.toString());
        return sb1.toString();
    }

    //3. 获取一个字符串在另一个字符串中出现的次数。比如：获取“ab”在  “abkkcadkabkebfkabkskab” 中出现的次数
    public int subStringCount(String substr, String str){
        int count = 0;
        int i = 0;
        while(i < str.length() - (substr.length() - 1)){
            if(str.indexOf(substr, i) >= 0){
               count++;
               i = str.indexOf(substr, i) + 1;
           }else{
               break;
           }

        }
        return count;
    }

    //4.获取两个字符串中最大相同子串。比如：
    //* str1 = "abcwerthelloyuiodef";str2 = "cvhellobnm"
    //* 提示：将短的那个串进行长度依次递减的子串与较长的串比较。
    public String maxSubStr(String s1, String s2){
        String shortstr = s1.length() - s2.length() > 0? s2:s1;
        int max = 0;
        String maxsubstr = new String();
        String s3 = new String();
        for (int i = 0; i < shortstr.length(); i++) {
            if(shortstr.substring(i).length() < max){
                break;
            }
            for (int j = shortstr.length(); j > i; j--) {
                if(shortstr.substring(i,j).length() < max){
                    break;
                }
                s3 = shortstr.substring(i,j);
//                System.out.println(s3);
                if(s1.contains(s3) && s3.length() > max){
                    maxsubstr = s3;
                    max = s3.length();
                }
            }
        }
        return maxsubstr;
    }

    //5.对字符串中字符进行自然顺序排序。
    // * 提示：
    // * 1）字符串变成字符数组。
    // * 2）对数组排序，选择，冒泡，Arrays.sort();
    // * 3）将排序后的数组变成字符串。
    public String stringSort(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
