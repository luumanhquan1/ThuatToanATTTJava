package subtract_exactly_multiples;

import correctly_add_multiples.CorrrectlyAddMultiples;
import java.util.ArrayList;

public class SubtractExactlyMultiples extends CorrrectlyAddMultiples {

    @Override
    public void inPut() {
        super.inPut();
    }

    int bitMind(int a, int b, int e) {
        if (a - b - e < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public void minus(int A[], int B[]) {
        int exponential=tinhSoMu(1, w);
        arrayC[0] = (mod(A[0] - B[0] - e, exponential));
        e = bitMind(A[0], B[0], e);
        for (int i = 1; i < t; i++) {
            arrayC[i] = mod(A[i] - B[i] - e, exponential);
            e = bitMind(A[i], B[i], e);
        }
    }

    @Override
    public void outPut() {
        super.outPut();
    }

}
