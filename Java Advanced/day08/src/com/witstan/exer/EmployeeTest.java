package com.witstan.exer;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author witstan
 * @create 2023-01-05 17:52
 */
public class EmployeeTest {

    @Test
    public void test1(){
        Employee e1 = new Employee("Adam",new MyDate(1987,2,13));
        Employee e2 = new Employee("Boris",new MyDate(1999,3,14));
        Employee e3 = new Employee("Jerry",new MyDate(2002,4,15));
        Employee e4 = new Employee("David",new MyDate(1967,5,16));
        Employee e5 = new Employee("Ellen",new MyDate(1971,6,17));

        TreeSet<Employee> set = new TreeSet<Employee>();

        set.add(e4);
        set.add(e2);
        set.add(e5);
        set.add(e1);
        set.add(e3);

        set.forEach(System.out::println);

    }

    @Test
    public void test2(){
        Employee e1 = new Employee("Adam",new MyDate(1987,2,13));
        Employee e2 = new Employee("Boris",new MyDate(1987,3,14));
        Employee e3 = new Employee("Jerry",new MyDate(2002,1,6));
        Employee e4 = new Employee("David",new MyDate(1967,6,18));
        Employee e5 = new Employee("Ellen",new MyDate(1966,6,17));

        Comparator<Employee> c = new Comparator<Employee>() {

            //使用泛型的写法
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.birthdayToLocalDate().compareTo(o2.birthdayToLocalDate());
            }


            //使用泛型之前的写法
//            @Override
//            public int compare(Object o1, Object o2) {
//                if(o1.getClass() == Employee.class && o2.getClass() == Employee.class){
//                    Employee e1 = (Employee)o1;
//                    Employee e2 = (Employee)o2;
//                    //方式一：
//                    if(e1.getToEpochday() - e2.getToEpochday() < 0){
//                        return -1;
//                    }else if (e1.getToEpochday() - e2.getToEpochday() == 0){
//                        return 0;
//                    }
//                    return 1;
//                    //方式二：
////                    return e1.birthdayToLocalDate().compareTo(e2.birthdayToLocalDate());
//                }
//                throw new RuntimeException("传入的类型数据不符");
//            }
        };

        TreeSet<Employee> set = new TreeSet<Employee>(c);
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.forEach(System.out::println);
    }

    @Test
    public void test3(){
        LocalDate now = LocalDate.of(1969,3,2);
        LocalDate now1 = LocalDate.of(1969,5,5);
        int i = now.compareTo(now1);
        long l = now1.toEpochDay();
        System.out.println(l);
        System.out.println(i);
    }





}
