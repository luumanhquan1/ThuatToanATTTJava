/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitive_eratosthenes;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class PrimitiveEratosthenes {

    public int n;
    public int arrayElement[];

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số nguyên tố nhỏ hơn(<=)n:");
        n = sc.nextInt();
        arrayElement = new int[n + 1];
    }

    public void element(int n, int array[]) {
        int k = 0;
        int check = 0;
        for (int i = 2; i <= n; i++) {
            array[i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            if (array[i] == 0) {
                continue;
            }
            for (int j = 2 * i; j <= n; j = j + i) {
                if (array[j] == 0) {//kiểm tra để break
                    check++;
                }
                array[j] = 0;
                k++;//đếm số vòng lặp j
            }
            if (check == k) {//kiểm tra
                break;
            }
            k = 0;
            check = 0;
        }
    }

    public int doa(int i) {
        String k = "";
        String num = String.valueOf(i);
        int leght = num.length();
        for (int j = leght - 1; j >= 0; j--) {//123=3+2+1=321
            k = k + num.charAt(j);
        }
        return  Integer.valueOf(k);

    }

    public boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void outPut() {
        for (int i = 2; i <= n; i++) {
            if (arrayElement[i] == 1) {
                if (i >= 10) {
                  if(doa(i)<n){
                  if(isPrimeNumber(doa(i))){
                      System.out.println(" "+i);
                  }
                  }
                }
            }
        }
    }
}
