/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luanhm.mathutil.core;

/**
 *
 * @author ipuil
 */
public class MathUtil {

    public static long getFactorial(int n) {
        long product = 1;

        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("invalid arguament. N must be [1...20]");
        

        if (n == 0 || n == 1) 
            return 1;
        
        return n * getFactorial(n-1);
    }
    
    
    ///n! -1.2.3...n quy uoc 0!=1!=1
    //recursion de quy === goi laij chinh nos voi 1 quy mo khac
     // 5! = 5.4!
    //4! = 4.3!
    //3! =3.2!
    //2!=2.1! dung'
}
