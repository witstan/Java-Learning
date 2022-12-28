package com.witstan.jff;

/*
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class PalindromeNumber {

	public static void main(String[] args) {

		PalindromeNumber p = new PalindromeNumber();
		boolean b = p.isPalindrome(0);
		System.out.println(b);
	}

	public boolean isPalindrome(int x) {
		if (x >= 10) {
			StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();
            s1.append(x);
            s2.append(x);
            s1.reverse();
			if (s2.toString().equals(s1.toString())) {
				return true;
			}else if(x >= 0 && x < 10){
				return true;
			}else{
				return false;
			}
		}
		return false;

	}
	
	//method2
//	public boolean isPalindrome(int x) {
//        if(x >= 10){
//            String s = String.valueOf(x);
//            char[] arr = s.toCharArray();
//            for(int i = 0, j = arr.length - 1; i < j; i++, j--){
//                if(arr[i] != arr[j]){
//                    return false;
//                }
//            }
//            return true;
//        }else if(x >= 0 && x < 10){
//            return true;
//        }
//        return false;
//    }
}
