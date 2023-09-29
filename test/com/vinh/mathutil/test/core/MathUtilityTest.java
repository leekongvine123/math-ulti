/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vinh.mathutil.test.core;

import com.vinh.mathutil.core.MathUtil;

import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
  
      //đây là class sẽ sử dụng các hàm của thư viện/framework JUmit
      //để kiểm thử/kiểm tra code chính - hàm tínhGiaiThừa() bên
      //class core.MathUtil
    
    //có nhiều quy tắc đặt tên hàm kiểm thử
    //nhưng thường sẽ nói lên mục đích của các case/tình huống kiểm thử
    //tình huống xài hàm theo kiểu thành công và thất bại
    
    //hàm dưới đây là tính huống test hàm chạy thành công, trả về ngon
    //ta sẽ sài hàm kiểu well-đưa 5!.., hong chơi đưa -5!, 30!
    
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //có nhiều @Test tương ứng với nhiều case khác nhau đẻ kiểm thử hàm tính giai thừa
      @Test
      public void testGetFactorialGivenRightArgumentReturnWell(){
        int n=0;// test thử tình hướng tử tết đầu vào, mày phải chạy đúng
        long expected = 1;//hy vọng 0! =1
        long actual = MathUtil.getFactorial(n);//gọi hàm cần test bên core/app chính/code chính
//                System.out.println("5! ="+expected+"expected");
//                    System.out.println("5! ="+actual+"actual");

//so sánh expected vs.actual dùng xanh xanh đỏ đỏ, framework
Assert.assertEquals(expected, actual);
// hàm giúp so sánh 2 giá trị nào đó có giống nhau không
// nếu giống nhau -> thảy màu xanh đèn đường, code ngon
// ít nhất cho case đang test
//nếu không giống nhau -> thảy màu đỏ đèn đường hàm ý
//expected và actual ko giống nhau

//gộp thêm vài case thanfhc ông/đưa đầ vào ngon!! hàm phải tính ngon
Assert.assertEquals(1, MathUtil.getFactorial(1));// tôi mún 1!==1
Assert.assertEquals(2, MathUtil.getFactorial(2));// tôi mún 1!==1
Assert.assertEquals(6, MathUtil.getFactorial(3));// tôi mún 1!==1
Assert.assertEquals(24, MathUtil.getFactorial(4));// tôi mún 1!==1
Assert.assertEquals(120, MathUtil.getFactorial(5));// tôi mún 1!==1
Assert.assertEquals(720, MathUtil.getFactorial(6));// tôi mún 1!==1

      }
    //hàm getF() ta thiết kế có 2 tình huống xử lí
      //1. đưa data tử tế trong [0..20] -> tính đúng đc n! - done
      //Tao kì vọng ngoại lệ xuất hiện khi N <0 || N > 20
      //rất mong ngoại lệ xuất hiện với n cà chớn này
      
      //nếu hàm nhận vào  n < 0  hoặc n > 20 và hàm ném ra ngoại lệ
      //Hàm chạy đúng như thiết kế  -> xanh phải xuất hiện
      
      //nếu hàm nhận vào  n < 0  hoặc n > 20 và hàm ném ra ngoại lệ
// sure, hàm chạy sai thiết kế, sai kì vọng, màu đỏ
      
      //Test case:
      //input: -5
      //expected: IllegalArgumentException xuất hiện
      //là những thứ không thể đo lường so sánh theo kiểu value
      //mà chỉ có thể đo lường - cách chứng có xuất hiện hay không
      //assertEquals() không dùng để so sánh 2 ngoại lệ
      // equal() là bằng nhau hay không trên value
      
      //màu đỏ đó em, do hàm đúng là có ném ngoại lệ thật sự
      //nhưng không phải là ngoại lệ như kì vọng - thực sự kì vọng sai
      //không phải hàm ném sai
//      @Test(expected =NumberFormatException.class)
//    public void testGetFactorialGivenRightArgumentReturnWellThrowException(){
//     MathUtil.getFactorial(-5);//hàm @Test chạy, hay hàm getF() chạy
//                                 //sẽ ném về ngoại lệ NumberFormat...
//                                 
//    }
      
    @Test(expected =IllegalArgumentException.class)
    public void testGetFactorialGivenRightArgumentReturnWellThrowException(){
     MathUtil.getFactorial(-5);//hàm @Test chạy, hay hàm getF() chạy
                                 //sẽ ném về ngoại lệ NumberFormat...
                                 
    }
    
    //cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn!!
    //xài lambda
    //Test case: hàm sẽ ném về ngại lệ nếu nhận vào 21
    //tui cần thấy màu xanh khi chơi với 21!
    
       @Test(expected =IllegalArgumentException.class)
    public void testGetFactorialGivenRightArgumentReturnWellThrowException_LambdaVersion(){
     MathUtil.getFactorial(-5);//hàm @Test chạy, hay hàm getF() chạy
                                 //sẽ ném về ngoại lệ NumberFormat...
//         Assert.assertThrows(tham số 1: loại ngoại lệ mún so sánh,
//                             tham số 2: đoạn code chạy văng ra ngoại lệ runnable) ;
   Assert.assertThrows(IllegalArgumentException.class, 
           () -> MathUtil.getFactorial(-5));
   MathUtil.getFactorial(-5);
    }
   
    
    //Bắt ngoại lệ, xem hàm có ném về ngoại lệ hay không khi n cà chớn
    // có ném, tức là
     @Test
    public void testGetFactorialGivenRightArgumentReturnWellThrowException_TryCatch(){
        //kiểm soát ngoại lệ!!!
        try {
             
                MathUtil.getFactorial(-5);

         } catch (Exception e) {
             //bắt try-catch là JUnit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ
             //nhưng không chắc ngoại lệ mình cần có xuất hay không???
             //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xh
             
             Assert.assertEquals("Invalid argument. N must be between 0....20",e.getMessage());
         }
    }
}
