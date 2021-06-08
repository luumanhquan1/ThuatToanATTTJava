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

    void base2(int a) {
        int b;
        int bitDau = 0, bitSau = 0;
        int j = 0;
        for (int i = 0; i < 2 * w; i++) {
            b = a % 2;
            if (i < w) {//w bit dau
                bitDau = bitDau + b * tinhSoMu(1, i);
            } else {//w bit sau
                bitSau = bitSau + b * tinhSoMu(1, j);
                j++;
            }
            a = a / 2;
        }
        v = bitDau;
        u = bitSau;
    }

    public void multiply() {
        for (int i = 0; i <= t - 1; i++) {
            arrayC[i] = 0;
        }
        for (int i = 0; i <= t - 1; i++) {
            u = 0;
            for (int j = 0; j <= t - 1; j++) {
                base2((arrayC[j + i] + (arrayA[i] * arrayB[j]) + u));
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
