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
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long rs = MathUtil.getFactorial(5); // hàm tính đi coi là mấy
        System.out.println("5! = 120; actual: " + rs);
        // kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì
        // expected value: 5! = 120
        // mày/ hàm ai đó viết khi chạy thực tế là mấy = actual, giả sử 120
        // if expected = actual -> hàm ngon trong tình huống này
        
        // MathUtil.getFactorial(-5); ném ngoại lệ thật rồi
        // ai biểu đưa cà chớn 
        
        //Thêm code sau lần đầu làm chuyện ấy code lên server 12:02PM 14/1/2024
        System.out.println("1! = 1; actual: " + MathUtil.getFactorial(1));
        System.out.println("3! = 720; actual: " + MathUtil.getFactorial(3));
        
        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));
        
        System.out.println("0! = 1;   actual: " + MathUtil.getFactorial(0));
        
    }
    
}
