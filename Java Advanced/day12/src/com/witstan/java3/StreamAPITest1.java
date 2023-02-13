package com.witstan.java3;

import com.witstan.java2.Employee;
import com.witstan.java2.EmployeeData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 测试Stream的中间操作
 *
 *
 * @author witstan
 * @create 2023-02-13 20:59
 */
public class StreamAPITest1 {

    //1. 筛选与切片
    @Test
    public void test1(){

        List<Employee> list = EmployeeData.getEmployees();

        //filter(Predicate p) 接收Lambda，从流中排除某些元素
        Stream<Employee> stream = list.stream();

        //练习：查询员工表中薪资大于7000的员工信息
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);

        System.out.println();

        //limit(long maxSize) 截断流，使其元素不超过给定数量
        Stream<Employee> stream1 = list.stream();
        stream1.limit(3).forEach(System.out::println);

        System.out.println();
        //skip(long n) 跳过元素，返回一个扔掉了前  n 个元素的流。若流中元素不足  n 个，
        // 则返回一个空流。与  limit(n) 互补
        list.stream().skip(3).forEach(System.out::println);


        System.out.println();
        //distinct() 筛选，通过流所生成元素的  hashCode() 和  equals() 去除重复元素

        list.add(new Employee(1010,"刘强东",40,8000));
        list.add(new Employee(1010,"刘强东",41,8000));
        list.add(new Employee(1010,"刘强东",40,8000));
        list.add(new Employee(1010,"刘强东",40,8000));
        list.add(new Employee(1010,"刘强东",40,8000));

        list.stream().distinct().forEach(System.out::println);

    }


    //2-映射
    @Test
    public void test2(){

        //map(Function f)
        // 接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
        List<String> list = Arrays.asList("aa", "bb", "cc", "vv");
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

        System.out.println();

        //练习1 获取姓名长度>3的员工名单
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Employee> stream = employees.stream();
        Stream<String> stringStream = stream.map(Employee::getName);
        stringStream.filter(name -> name.length() > 3).forEach(System.out::println);

        System.out.println();

//        stream.filter(employee -> employee.getName().length() > 3).forEach(System.out::println);

        //练习2：
        Stream<Stream<Character>> streamStream = list.stream().map(StreamAPITest1::fromStringToStream);
        streamStream.forEach(s -> {
            s.forEach(System.out::println);
        });

        //mapToDouble(ToDoubleFunction f)
        // 接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的  DoubleStream。

        //mapToInt(ToIntFunction f)
        //接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的  IntStream。

        //mapToLong(ToLongFunction f)
        //接收一个函数作为参数，该函数会被应用到每个元素上，产生一个新的  LongStream。

        //flatMap(Function f)
        //接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流
        Stream<Character> characterStream = list.stream().flatMap(StreamAPITest1::fromStringToStream);
        characterStream.forEach(System.out::println);


    }

    //将字符串中的多个字符构成的集合转换为对应的Stream的实例
    public static Stream<Character> fromStringToStream(String s){
        ArrayList<Character> list = new ArrayList<>();
        for (Character c : s.toCharArray()){
            list.add(c);
        }
        return list.stream();

    }

    @Test
    public void test3(){
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList list2 = new ArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        list1.add(list2);
        list1.addAll(list2);
        System.out.println(list1);


    }

    //3-排序
    @Test
    public void test4(){

        //sorted()
        //产生一个新流，其中按自然顺序排序
        List<Integer> list = Arrays.asList(1, 54, 19, 3, 3, 7, -7, 0, -54, 34);
        list.stream().sorted().forEach(System.out::println);

        List<Employee> employees = EmployeeData.getEmployees();
//        employees.stream().sorted().forEach(System.out::println);

        //sorted(Comparator com)
        //产生一个新流，其中按比较器顺序排序
        employees.stream().sorted((id1,id2) ->
                {
                    int i = Integer.compare(id1.getAge(), id2.getAge());
                    if(i != 0){
                        return i;
                    }else{
                        return  Double.compare(id1.getSalary(),id2.getSalary());
                    }
                }
        ).forEach(System.out::println);

    }


}
