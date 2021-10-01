/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.giaolang.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    //de quy la goi lai chinh minh voi quy mo khac
    
    public static long getFactorial(int n)
    {
        if(n<0||n>20)
        {
            throw new IllegalArgumentException("n phai nam giua 0 - 20");
            
        }
        if(n==0||n==1)
        {
            return 1;
            
        }
        return n*getFactorial(n-1);
    }
}
