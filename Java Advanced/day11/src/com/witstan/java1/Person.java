package com.witstan.java1;

/**
 * @author witstan
 * @create 2023-01-29 12:51
 */
@MyAnnotation(value = "hi")
public class Person extends Creature<String> implements Comparable<String>, MyInterface{

    private String name;
    int age;
    public int id;

    public Person() {
    }

    @MyAnnotation(value = "abc")
    private Person(String name){
        this.name = name;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @MyAnnotation
    private String show(String nation){
        System.out.println("nation: " + nation);
        return nation;
    }

    public String display(String interest, int age) throws NullPointerException, ClassCastException{
        return interest + age;
    }

    @Override
    public void info() {
        System.out.println("a person");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    private static void showDesc(){
        System.out.println("a real person");
    }
}
