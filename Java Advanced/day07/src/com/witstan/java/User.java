package com.witstan.java;

/**
 * @author witstan
 * @create 2023-01-04 14:59
 */
public class User implements Comparable{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("User equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    //按照姓名从大到小排列
    @Override
    public int compareTo(Object o) {
        if(o.getClass() == this.getClass()){
            User u = (User)o;
//            return -this.name.compareTo(u.name);
            int i = this.name.compareTo(u.name);
            if(i != 0){
                return i;
            }else{
                return Integer.compare(this.age, u.age);
            }
        }else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }


}
