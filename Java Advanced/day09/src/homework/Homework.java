package homework;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @author witstan
 * @create 2023-01-11 21:36
 */
public class Homework {

    @Test
    public void test1(){

        HashMap<String, Integer> map = new HashMap();
        map.put("AA", 123);
        map.put("BV", -143);
        map.put("ATY", 6798793);

        //遍历Map的key集
        Set<String> keys = map.keySet();
        keys.forEach(System.out::println);

        //遍历Map的value集
        Collection<Integer> values = map.values();
        values.forEach(System.out::println);

        //遍历Map的key-value集
        for(String key : keys){
            System.out.println(key + "=" + map.get(key));
        }
        

    }

    @Test
    public void test2(){
        //写出使用Iterator 和 增强for 循环遍历List<String>的代码,使用上泛型
        List<String> list = Arrays.asList("aa","bb","bbv");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String s : list){
            System.out.println(s);
        }

    }

    //提供一个方法，用于遍历获取HashMap<String,String>中的所有value，并存放在List中返回。考虑上集合中泛型的使用。
    public List<String> returnList(HashMap<String, String> map){
        ArrayList<String> list = new ArrayList<>();
        Collection<String> values = map.values();
        for (String value : values){
            list.add(value);
        }
        return list;
    }

    @Test
    public void test3() throws IOException {
        //创建一个与a.txt文件同目录下的另外一个文件b.txt
        new File(new File("a.txt").getParent(),"b.txt").createNewFile();
    }



}
