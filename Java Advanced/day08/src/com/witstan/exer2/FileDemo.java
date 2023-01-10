package com.witstan.exer2;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author witstan
 * @create 2023-01-10 20:52
 */
public class FileDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("E:\\io\\io2");
        boolean b = file.mkdir();
////        System.out.println("创建io2文件夹 " + b);
//
//
        File file0 = new File("E:\\io\\io2\\hello.txt");
//        boolean b1 = file0.createNewFile();
////        System.out.println("创建hello.txt " + b1);


        File file1 = new File("E:\\io\\io2\\io3\\io4");
        boolean b2 = file1.mkdirs();
//        System.out.println("创建io4及上层文件夹 " + b2);

        File file3 = new File("E:\\io\\io2\\io3\\io4\\1234.jpG");
        file3.createNewFile();
        File file4 = new File(file1,"1234 - 副本.jpG");
        file4.createNewFile();
        File file5 = new File(file1,"io5");
        file5.mkdir();
        File file6 = new File(file5,"12345.JPG");
        file6.createNewFile();
        File file7 = new File(file5,"io6");
        file7.mkdir();
        File file8 = new File(file7,"123456.txt");
        file8.createNewFile();

        File file2 = new File("E:\\io\\io2","hello1.txt");
        boolean b3 = file2.createNewFile();
////        System.out.println("创建hello1.txt " + b3);
//
        FileDemo demo = new FileDemo();
//        demo.delete(file1);
//
////        System.out.println("hello.txt exsits " + file1.exists());
//
//        System.out.println("**allFiles**");
//
//        demo.allFiles(file);
//
//        System.out.println("**countSize**");
//
//        long l = demo.countSize(file);
//        System.out.println(l);
//
//        System.out.println("**jpgExist**");
//
        demo.jpgExist(new File("E:\\io\\io2"));
//        demo.jpgExist(new File("E:\\io\\io2\\io3"));
//        demo.jpgExist(file5);

//        System.out.println("**deleteAll**");

//        System.out.println(file1.exists());
//        demo.deleteAll(file1);
//        System.out.println(file1.exists());


    }

    @Test
    public void test(){
//        File file = new File("E:\\io\\io1\\io4");
//        File[] files = file.listFiles();
//        for (File f : files){
//            System.out.println(f);
//        }

//        File file1 = new File("E:\\hobbies\\programming\\java\\code\\Just for fun");
//        System.out.println(countSize(file1));
//        allFiles(file1);

    }


    public boolean delete(File file){
        if(file.exists()){
            return file.delete();
        }
        return false;
    }

    public void jpgExist(File file){
        if(file.isFile()){
            if(file.getName().toLowerCase().endsWith(".jpg")){
                System.out.println(file.getName());
            }
        }else {
            File[] files = file.listFiles();
            for (File f : files){
                jpgExist(f);
            }
        }
    }

    public void allFiles(File file){
        if(file.isFile()){
            System.out.println(file.getName());
        }else {
            File[] files = file.listFiles();
            for(File f : files){
                allFiles(f);
            }
        }
    }

    public long countSize(File file){
        long size = 0;
        if (file.isFile()){
            size += file.length();
        }else{
            File[] files = file.listFiles();
            for(File f : files){
                size += countSize(f);
            }
        }
        return size;
    }

    public boolean deleteAll(File file){
        if(file.listFiles() != null){
            File[] files = file.listFiles();
            for(File f : files){
                deleteAll(f);
            }
        }
        System.out.println(file.getName() + " deleted");
        return file.delete();
    }

}
