/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author 84868
 */
// TA VIẾT CÁI CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
// KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KO CẦN NHỚ CÁI GÌ
// CHO RIÊNG TA, HÀM STATIC GIÚP LÀM ĐIỀU NÀY
public class MathUtil {
    
    //n! = 1*2*3...*n
    //Quy ước: 0! = 1! = 1
    // ko tính giai thừa cho số âm
    // 20! là vừa khớp kiểu long, kiểu long tối ta 18 con số 0
    // 21! là lố kiểu long
    // nếu đưa vào âm, 21 giai thừa hoặc lớn hơn, ta éo tính
    // ta đập vào mặt ai xài hàm một cái ngoại lệ, chửi
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0...20");
         // hàm dừng liền éo cần return
         
         // xuống đây là n = 0...20
        if (n == 0 || n == 1) return 1;
         
         // chơi for hoặc đệ quy - recursion
         // kĩ thuật nhồi con heo đất, ốc bu dồn thịt
         // i = 2, i = 3, i = 4, ... i = n nhồi liên tục i vào tích
         
        long product = 1; //tích khởi đầu = 1, nhồi 2 3 4 ... n 
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        
        return product;
    }
}
