package com.witstan.jff;

/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 * You must not use any built-in exponent function or operator.
 * @author witstan
 * @create 2022-12-30 0:08
 */
public class Sqrt {


    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        if(x == 1){
            return 1;
        }
        for(long i = 1; i <= x / 2; i++){
            if((i * i <= x) && ((i + 1) * (i + 1) > x)){
                return (int)i;
            }
        }
        return 0;
    }
}
