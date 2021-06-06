/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plus_on_Fp;

import array_representation.ArrayRepresentation;
import correctly_add_multiples.CorrrectlyAddMultiples;
import java.util.Scanner;
import subtract_exactly_multiples.SubtractExactlyMultiples;

/**
 *
 * @author ASUS TUF
 */
public class PlusOnFp extends CorrrectlyAddMultiples {

    protected int p;
   protected  int a,b;
    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập P:");
        p = sc.nextInt();
        System.out.println("Nhập W:");
        w = sc.nextInt();
        t = tinhT(log2(p), w);
        arrayA = new int[t];
        arrayB = new int[t];
        arrayC = new int[t];
        System.out.println("1.Nhập a và b:");
        System.out.println("2.Nhập Mảng A và B:");
        int select = 0;
        System.out.println("Chọn----");
        select=sc.nextInt();
        ArrayRepresentation ar=new ArrayRepresentation();
        switch(select){
        case 1:
            System.out.println("Nhập a:");
            a=sc.nextInt();
            ar.arrayShow=new int[t];
            ar.showArray(a, w, t);
            arrayA=ar.arrayShow;
             System.out.println("Nhập b:");
            b=sc.nextInt();
            ar.arrayShow=new int[t];
            ar.showArray(b, w, t);
            arrayB=ar.arrayShow;
            break;
        case 2:
            super.inPutArray();
            break;
        }
    }

    void count() {
        super.Count(arrayA, arrayB);
        if (e == 1) {
            ArrayRepresentation arrayRepresentation = new ArrayRepresentation();
            arrayRepresentation.arrayShow = new int[t];
            arrayRepresentation.showArray(p, w, t);
            SubtractExactlyMultiples subtractExactlyMultiples = new SubtractExactlyMultiples();
            subtractExactlyMultiples.arrayC = new int[t];
            subtractExactlyMultiples.t = t;
            subtractExactlyMultiples.w = w;
            subtractExactlyMultiples.minus(super.arrayC, arrayRepresentation.arrayShow);
            subtractExactlyMultiples.outPut();
        } else {
            super.outPut();
        }
    }
}
