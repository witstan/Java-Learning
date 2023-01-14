package com.witstan.exer;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

/**
 * @author witstan
 * @create 2023-01-14 10:45
 */
public class PictureTest {

    /*
    图片加密
     */
    @Test
    public void test1(){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("b3a.jpg"));
            fos = new FileOutputStream(new File("b3a2.jpg"));

            byte[] buffer = new byte[1024];
            int len;
            while((len = fis.read(buffer)) != -1){
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte)(buffer[i] ^ 5);
                }

                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    /*
    图片解密
     */
    @Test
    public void test2(){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(new File("b3a2.jpg"));
            fos = new FileOutputStream(new File("b3a3.jpg"));

            byte[] buffer = new byte[1024];
            int len;
            while((len = fis.read(buffer)) != -1){
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte)(buffer[i] ^ 5);
                }

                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    @Test
    public void test3(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("dbcp.txt");
            fw = new FileWriter("dbcp_char_count.txt");
            HashMap<Character, Integer> map = new HashMap<>();

            char[] cbuf = new char[1024];
            int len;
            while((len = fr.read(cbuf)) != -1){
                for(int i = 0; i < len; i++){
                    if(map.containsKey(cbuf[i])){
                        map.put(cbuf[i], map.get(cbuf[i]) + 1);
                    }else{
                        map.put(cbuf[i], 1);
                    }

                }
            }

            Set<Character> characters = map.keySet();
            for(Character c : characters){
                String s = "";
                switch (c){
                    case '\n':
                        s = "换行" + ": " + map.get(c) + "\n";
                        break;
                    case '\t':
                        s = "tab" + ": " + map.get(c) + "\n";
                        break;
                    case '\r':
                        s = "回车" + ": " + map.get(c) + "\n";
                        break;
                    case ' ':
                        s = "空格" + ": " + map.get(c) + "\n";
                        break;
                    default:
                        s = c + ": " + map.get(c) + "\n";
                        break;
                }
                fw.write(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }




    }


}
