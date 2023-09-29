/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vinh.mathutil.main;

import com.vinh.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        // thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay không
        // ta phải đưa ra cấc tình huống sử dụng hàm trong thực tế
        //ví dụ: -5 coi tính được hok
        // 0 coi tính mấy
        // 20 coi tính mấy
        // Test case: một tình huống hàm/app/màn hình/tính năng được đưa vào sử dụng
        //giả lập hành vi sử dụng của ai đó

//Test Case: là một tình huống sử dụng App(Hàm) mà nó bao hàm
//Input: DATA đầu vào cụ thể nào đó
//OutPut :đầu ra ứng vớ xử lí của hàm/chức năng của app, Dĩ nhiên dùng đầu vào để xử lí
//Kì vọng: mong hàm sẽ trả về value nào đó ứng với input ở trên
// so sánh để xem kết quả có như kì vọng hay không

long expected = 120;//kì vọng hàm trả về 120 nếu tính 5!
int n= 10;//input
long actual = MathUtil.getFactorial(n);
System.out.println("5! ="+expected+ "(expected)");
System.out.println("5! = "+actual+"(actual)");

    }
 
}
