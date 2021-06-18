/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luanhm.mathutil.core;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Executable;
import java.lang.reflect.TypeVariable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import sun.reflect.generics.repository.ConstructorRepository;

/**
 *
 * @author ipuil
 */
public class MathUtilTest {
    //data-driven:   tachrieng data test maf loi goi ham, ko bi tron lan
    //can kiem chung

    public static Integer[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {3, 6},
            {4, 24},
            {5, 120}
        };
    }
    // bắt exception  Junit 4:  @Test(expected - ngoại lệ.class)
    //                 junit5: Khác dùng Lamda Expresstion
    @Test
    public void testFactorialGivenWrongArguamentThrowsException(){
    
        org.junit.jupiter.api.function.Executable negativeF = new org.junit.jupiter.api.function.Executable() {
            @Override
            public void execute() throws Throwable {
              MathUtil.getFactorial(-5);
            }
        };
        
        
        assertThrows(IllegalArgumentException.class, negativeF); 
        }
        
      
    
    
    
    
    
    

    @ParameterizedTest
    @MethodSource("initData") //tham so hoa
    public void testFactorialGivennRightArgumentReturnWell(int n, long expected) {
        assertEquals(expected, MathUtil.getFactorial(n));

    }

//        @Test
//        public void testFactorialGivennRightArgumentReturnWell(){
//            assertEquals(120, MathUtil.getFactorial(5));
//        
//    }
    
    //                                                 HỌC TDD để phỏng vấn, Regestion testing(test trở lại những thứ mình cần xác minh)
    
}
