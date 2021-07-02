/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatest_common_divisor;

import calculate.Calculate;
import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class GreatestCommonDivisor extends Calculate {
    
    int a, b;
    
    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a:");
        a = sc.nextInt();
        System.out.println("Nhập b:");
        b = sc.nextInt();
    }
    
    public int gcd(int a, int b) {
        int A = a;
        int B = b;
        while (B > 0) {
            int r = mod(A, B);
            A = B;
            B = r;
        }
        return A;
    }

    public void outPut() {
        System.out.println("Ước Chung Lớn Nhất:" + gcd(a, b));
    }
}
