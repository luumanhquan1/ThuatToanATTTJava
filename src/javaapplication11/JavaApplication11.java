/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class JavaApplication11 {

    static void ipPut(ArrayList<String> arrayTest) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng bộ test:");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arrayTest.add(sc.nextLine());
        }

    }

    static boolean checkSoThuanNghic(String a) {
        String soTruoc = "";
        String soSau = "";
        for (int i = 0; i < a.length(); i++) {
            soTruoc = soTruoc + a.charAt(i);
        }
        for (int j = a.length() - 1; j >= 0; j--) {
            soSau = soSau + a.charAt(j);
        }
        
        if (soTruoc.equals(soSau)) {
      
            return true;
        }
        return false;
    }

    static void check(String a) {
        String g = "";
        ArrayList arrayNumber = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {//loại bỏ tất cả các chữ
            try {
                String ab = String.valueOf(a.charAt(i));
                g = g + ab;
                int index = Integer.parseInt(ab);//nếu là số thì ép kiểu được không là số thì nhảy vảo catch và không làm gì
                arrayNumber.add(index);

                if (g.length() > 1) {
                 if(checkSoThuanNghic(g)){
                     System.out.println(" "+g);
                 }
                      
                }
            } catch (Exception e) {
                g = "";
            }
        }

        if (arrayNumber.size() == 0) {//không có số nào trong mảng
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arrayTest = new ArrayList<>();

//        ipPut(arrayTest);
        check("abc30x212yz11");
//        check(arrayTest);
//checkSoThuanNghic("123");
    }

}
