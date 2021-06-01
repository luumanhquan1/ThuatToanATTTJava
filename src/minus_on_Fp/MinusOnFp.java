/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minus_on_Fp;

import array_representation.ArrayRepresentation;
import plus_on_Fp.PlusOnFp;
import subtract_exactly_multiples.SubtractExactlyMultiples;

/**
 *
 * @author ASUS TUF
 */
public class MinusOnFp extends PlusOnFp {

    @Override
    public void inPut() {
        super.inPut();
    }

    public void minus() {
        SubtractExactlyMultiples sem = new SubtractExactlyMultiples();
        sem.arrayC = new int[t];
        sem.t = t;
        sem.w = w;
        sem.minus(arrayA, arrayB);
        if (sem.e == 1) {
            ArrayRepresentation ar = new ArrayRepresentation();
            ar.arrayShow = new int[t];
            ar.showArray(p, w, t);
            super.Count(sem.arrayC, ar.arrayShow);
            super.outPut();
        } else {
            sem.outPut();
        }
    }
}
