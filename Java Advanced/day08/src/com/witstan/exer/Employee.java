package com.witstan.exer;

import java.time.LocalDate;

/**
 * @author witstan
 * @create 2023-01-05 17:45
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee(String name, MyDate birthday) {
        this.name = name;
        this.age = getAgeFromBirthday(birthday);
        this.birthday = birthday;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    //指明泛型时的写法
    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }

    //没有指明泛型时的写法
//    @Override
//    public int compareTo(Object o) {
//        if(o.getClass() == Employee.class){
//            Employee e = (Employee)o;
//            return this.name.compareTo(e.getName());
//        }
//        throw new RuntimeException("传入的数据类型不符");
//    }

    public long getToEpochday(){
        return birthdayToLocalDate().toEpochDay();
    }

    public LocalDate birthdayToLocalDate(){
        return LocalDate.of(birthday.getYear(), birthday.getMonth(), birthday.getDay());
    }

    private int getAgeFromBirthday(MyDate birthday){
        if(LocalDate.now().getMonthValue() - birthday.getMonth() < 0){
                return LocalDate.now().getYear() - birthday.getYear() - 1;
            }else if(LocalDate.now().getMonthValue() - birthday.getMonth() == 0){
                if(LocalDate.now().getDayOfMonth() - birthday.getDay() < 0){
                    return LocalDate.now().getYear() - birthday.getYear() - 1;
                }
                return LocalDate.now().getYear() - birthday.getYear();
            }
        return LocalDate.now().getYear() - birthday.getYear();
    }


}
