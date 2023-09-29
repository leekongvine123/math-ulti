/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.vinh.mathutil.test.core;

import com.vinh.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
//cau lenh nay cua JUNIT bao hieu rang se can loop qua tap data de
//lay cap data input/expected nhoi vao ham test
@RunWith(value = Parameterized.class)

public class MathUtilDDTTest {
    
        //ta se tra ve  mang 2 chieu gom nhieu cap Expected|input
//JUnit se ngam chay loop qua tung dong
                        //cua mang de lay ra cap data input/expected
                       //ten ham khong quan trong, quan trong la @
@Parameterized.Parameters
   public static Object[][] initData(){
            
            return new Integer[][] {
                {0,1},
                {1,1},
                {2,2},
                {3,6},
                {4,24},
                {5,120},
            };
            
        }
        //gia su loop qua tung dong cua mang, ta van can gan tung value cua cot
    //vao bien tuong ung input, expected de lat hoi feed cho ham
    @Parameterized.Parameter(value=0)//valiue= 0 la mapp voi mang data
    public int n; //bien map voi value cua cot 0 cua mang
        @Parameterized.Parameter(value=1)//valiue= 0 la mapp voi mang data
    public long expected;//kieu long vi gia tri tra ve cua ham getF()
                         //la long
    
    
    @Test
public void testGetFactorialGivenRightArgumentReturnWell(){
Assert.assertEquals(expected, MathUtil.getFactorial(n));// tôi mún 1!==1



}





}    


