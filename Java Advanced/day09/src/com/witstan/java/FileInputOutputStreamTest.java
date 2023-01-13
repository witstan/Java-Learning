package com.witstan.java;

import org.junit.Test;

import java.io.*;

/**
 * 测试FileInputStream和FileOutputStream的使用
 *
 * 结论：
 * 1. 对于文本文件(.txt, .java, .c, .cpp, ...)，使用字符流处理
 * 2. 对于非文本文件(.jpg, .mp3, .mp4, .avi, .ppt, ...)，使用字节流
 *
 *
 *
 *
 * @author witstan
 * @create 2023-01-13 16:16
 */
public class FileInputOutputStreamTest {

    //使用字节流FileInputStream处理文本文件可能乱码

    @Test
    public void testFileInputStream() {
        //1. 造文件
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");

            //2. 造流
            fis = new FileInputStream(file);

            //3. 读数据
            byte[] buffer = new byte[5];
            int len;//记录每次读取的字节的个数
            while((len = fis.read(buffer)) != -1){
                String s = new String(buffer, 0, len);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                //4. 关闭资源
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /*
    实现对图片的复制操作

     */
    @Test
    public void testFileInputOutputStream() {
        //

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File("b3a.jpg");
            File destFile = new File("b3a1.jpg");

            //
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //复制的过程
            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    //指定路径下文件的复制
    public void copyFile(String srcPath, String destPath){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            //
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //复制的过程
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    @Test
    public void testcopyFile(){

        long start = System.currentTimeMillis();

        String srcPath = "C:\\Users\\admin\\Downloads\\jrrhn.mp4";
        String destPath = "C:\\Users\\admin\\Downloads\\jrrhn111.mp4";
//        String srcPath = "hello.txt";
//        String destPath = "hello3.txt";
        copyFile(srcPath,destPath);

        System.out.println("时间花费为：" + (System.currentTimeMillis() - start));//209
    }

}
