/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vinh.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    //trong class này cung caaso cho ai đó nhiều hàm xử lí toán học
    //clone class Math của JDK
    //hàm thư viện sài chung cho ai đó , không cần lưu lại trạng thái/giá trị
    // chọn thiết kế là hàm static
    
    //hàm tính giai thừa!!!
    //n! = 1.2.3.4...n
    //không có giai thừa cho số âm
    //0! =1!- 1 quy ước
    // gia thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    // 20 giai thừa 18 con số 0, vừa ịp đủ cho kiểu long của Java
    //bài này quy ước tính n! trong khoảng từ 0...20
    public static long getFactorial(int n){
        
        if(n<0||n>20){
            throw new IllegalArgumentException("Invalid argument. N must be between 0....20");
            
        }
        if(n==0 || n==1){
            return 1;// kết thức cuộc chơi sớm nếu nhận được những dầu vào đặc biệt
        }
        long product =1;//tích nhân dồn, thuật toán heo đất, ốc bu dồn thịt
        
        for (int i = 2; i <=n; i++){
            product *=i;
            
        }
        return product;
    }
    
    
}
