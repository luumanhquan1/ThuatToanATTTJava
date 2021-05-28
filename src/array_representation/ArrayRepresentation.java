package array_representation;

import calculate.Calculate;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayRepresentation extends Calculate {

    int m;
    int a;
    int w;
    int f;
    int t;
    ArrayList<Integer> arrayShow = new ArrayList<>();

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a:");
        a = sc.nextInt();
        System.out.println("Nhập w:");
        w = sc.nextInt();
        System.out.println("Nhập F");
        f = sc.nextInt();
        m = log2(f);
        t = tinhT(m, w);
    }

    public ArrayList showArray(int a, int w, int t) {
        int tg = 0;
        for (int i = t - 1; i >= 0; i--) {
            if (i == t - 1) {
                arrayShow.add(a / tinhSoMu(i, w));
                tg = a % tinhSoMu(i, w);
            } else {
                arrayShow.add(tg / tinhSoMu(i, w));
                tg = a % tinhSoMu(i, w);
            }
        }
        return arrayShow;
    }
}
