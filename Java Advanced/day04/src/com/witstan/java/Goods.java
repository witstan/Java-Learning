package com.witstan.java;

/**
 * @author witstan
 * @create 2023-01-01 11:41
 */
public class Goods implements Comparable{

    private String name;
    private double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //指明商品比较大小的方法，按照价格从低到高排序，再根据产品名字排序
    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods){
            Goods g = (Goods)o;
            if(this.price > g.price){
                return 1;
            }else if(this.price < g.price){
                return -1;
            }else{
//                return 0;
                return this.name.compareTo(g.name);

            }
            //方式二：
//           return Double.compare(this.price, g.price);
        }
        throw new RuntimeException("传入的数据类型不一致");
    }
}
