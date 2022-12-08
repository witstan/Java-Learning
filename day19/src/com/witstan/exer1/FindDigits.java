package com.witstan.exer1;

public class FindDigits {
	
	long count = 1;
	
	public static void main(String[] args) {
		
		FindDigits t = new FindDigits();
		
		System.out.println(t.findDigits(34534532197L));
	
	}
	
	/**
	 * 
	* @Description A method to find the digits of a positive integer within 20 digits
	* @author witstan
	* @date 2022年12月8日下午7:38:19 
	* @param l destination number(long type)	
	* @return the digits of the number
	 */
	public long findDigits(long l){
		if(l / 10 < 10 && l / 10 >= 1){
			return count + 1;
		}else if(l / 10 < 1){
			return count;
		}else{
			count ++;
			return findDigits(l / 10);
		}
			
	}
}


