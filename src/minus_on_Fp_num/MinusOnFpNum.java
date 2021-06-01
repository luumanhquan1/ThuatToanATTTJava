/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minus_on_Fp_num;

import array_representation.ArrayRepresentation;
import java.util.Scanner;
import minus_on_Fp.MinusOnFp;

/**
 *
 * @author ASUS TUF
 */
public class MinusOnFpNum extends  MinusOnFp{
    int a,b;
    public void Input(){
      Scanner sc=new Scanner(System.in);
        System.out.println("Nhập P:");
        p=sc.nextInt();
        System.out.println("Nhập W:");
        w=sc.nextInt();
        System.out.println("Nhập A:");
        a=sc.nextInt();
        System.out.println("Nhập B:");
        b=sc.nextInt();
        t=tinhT(log2(p), w);
        ArrayRepresentation ar=new ArrayRepresentation();
        ar.arrayShow=new int[t];
        ar.showArray(a, w, t);
        arrayA=ar.arrayShow;
        ar.arrayShow=new int[t];
        ar.showArray(b, w, t);
        arrayB=ar.arrayShow;
        arrayC=new int[t];
    }
    public  void  minus(){
    super.minus();
    }
}
