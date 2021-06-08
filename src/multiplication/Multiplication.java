package multiplication;

import plus_on_Fp.PlusOnFp;

public class Multiplication extends PlusOnFp {

    int u = 0;
    int v = 0;

    @Override
    public void inPut() {
        super.inPut();
        arrayC = new int[2 * t];
    }

    void base2(int a, int wBitDau) {
        v = 0;
        u = 0;
        v = a & wBitDau;
        u = a & ~wBitDau;
        u = u >> w;//dịch để bit sau về đầu
    }

    public void multiply() {
        int wBitDau = wbitdau(w);
        for (int i = 0; i <= t - 1; i++) {
            arrayC[i] = 0;
        }
        for (int i = 0; i <= t - 1; i++) {
            u = 0;
            for (int j = 0; j <= t - 1; j++) {
                base2((arrayC[j + i] + (arrayA[i] * arrayB[j]) + u), wBitDau);
                arrayC[i + j] = v;
            }
            arrayC[i + t] = u;
        }
    }

    @Override
    public void outPut() {
        for (int i = 2 * t-1; i >= 0; i--) {
            System.out.print(" " + arrayC[i]);
        }
    }
}
