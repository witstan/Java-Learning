package com.witstan.exer;

public class ComparableCircle extends Circle implements CompareObject{

	public int compareTo(Object o)throws RuntimeException{
		if(this == o){
			return 1;
		}
		if(o instanceof ComparableCircle){
		ComparableCircle c = (ComparableCircle)o;
		//方式一：
//		if(this.getRadius() == c.getRadius()){
//			return 0;
//		}else if(this.getRadius() > c.getRadius()){
//			return 1;
//		}
//		return -1;
		//方式二：将Circle中的radius属性声明为 Double包装类类型
		return this.getRadius().compareTo(c.getRadius());
		}else{
//			return 0;
			throw new RuntimeException("传入的数据类型不匹配");
		}
		
	}
}
