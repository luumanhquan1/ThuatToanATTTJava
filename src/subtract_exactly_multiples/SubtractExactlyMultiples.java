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

    ArrayList minus() {
        ArrayList<Integer> arrayC = new ArrayList<>();
        arrayC.add(mod(arrayA.get(arrayA.size() - 1) - arrayB.get(arrayB.size() - 1) - e, tinhSoMu(1, w)));
        e = bitMind(arrayA.get(arrayA.size() - 1), arrayB.get(arrayB.size() - 1), e);
        for (int i = t - 2; i >= 0; i--) {
            arrayC.add(mod(arrayA.get(i) - arrayB.get(i) - e, tinhSoMu(1, w)));
            e = bitMind(arrayA.get(i), arrayB.get(i), e);
        }
        System.out.printf("e:" + e + "(");
        for (int i = t - 1; i >= 0; i--) {
            System.out.printf(arrayC.get(i) + ";");
        }
        System.out.printf(")");
        return arrayC;
    }
}
