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
        super.inPutArray();
    }

    void count() {
        super.Count(arrayA,arrayB);
        if (e == 1) {
            ArrayRepresentation arrayRepresentation = new ArrayRepresentation();
            arrayRepresentation.arrayShow = new int[t];
            arrayRepresentation.showArray(p, w, t);
            SubtractExactlyMultiples subtractExactlyMultiples = new SubtractExactlyMultiples();
            subtractExactlyMultiples.arrayC = new int[t];
            subtractExactlyMultiples.t=t;
            subtractExactlyMultiples.w=w;
            subtractExactlyMultiples.minus(super.arrayC, arrayRepresentation.arrayShow);
            subtractExactlyMultiples.outPut();
        } else {
            super.outPut();
        }
    }
}
