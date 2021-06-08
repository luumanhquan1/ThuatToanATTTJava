package calculate;

public class Calculate {

    public int mod(int a, int b) {
        int r;
        r = a % b;
        return r < 0 ? r + b : r;
    }

    public int log2(int f) {
        return (int) Math.ceil(Math.log10(f) / Math.log10(2));
    }

    public int tinhT(int m, int w) {
        return (int) Math.ceil((double) m / w);
    }

   public int wbitdau(int w) {
        int sum = 0;
        int bit = 1;
        for (int i = 0; i < w; i++) {
            sum = sum + tinhSoMu(1, i);
        }
        return sum;
    }

    public int tinhSoMu(int a, int w) {
        int ketQua = 1;
        ketQua = ketQua << a * w;
        return ketQua;
    }
}
