package com.witstan.java;

/**
 * 使用enum关键字定义枚举类
 * 说明：定义的枚举类默认继承于java.lang.Enum
 *
 * @author witstan
 * @create 2023-01-01 20:47
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        //toString():
        System.out.println(summer.toString());

//        System.out.println(Season1.class.getSuperclass());
        System.out.println("**************");
        //values()；
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }
        System.out.println("**************");
        Thread.State[] values1 = Thread.State.values();
        for (int i = 0; i < values1.length; i++) {
            System.out.println(values1[i]);
        }

        System.out.println("**************");
        //valueOf(String objName):返回枚举类中对象名时objName的对象。
        //如果没有objName的对象，则抛异常：IllegalArgumentException
        Season1 winter = Season1.valueOf("WINTER");
//        Season1 winter = Season1.valueOf("WINTER1");
        System.out.println(winter);
        winter.show();

    }
}

interface Info{
    void show();
}

//使用enum关键字定义枚举类
enum Season1 implements Info{

    //1.提供当前枚举类的对象，多个对象之间用“,”隔开，末尾对象用“;”结束
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天","夏日炎炎") {
        @Override
        public void show() {
            System.out.println("夏天的风");
        }
    },
    AUTUMN("秋天","秋高气爽") {
        @Override
        public void show() {
            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天","冰天雪地") {
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };

    //2.声明Season对象的属性:private final修饰
    private final String seasonName;
    private final String seasonDesc;


    //2.私有化类的构造器
    private Season1(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4.其他诉求1：获取枚举类对象的属性


    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //4.其他诉求2：提供toString()方法

//    @Override
//    public String toString() {
//        return "Season{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }


//    @Override
//    public void show() {
//        System.out.println("A season");
//    }
}