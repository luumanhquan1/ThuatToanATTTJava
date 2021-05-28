package correctly_add_multiples;

import calculate.Calculate;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS TUF
 */
public class CorrrectlyAddMultiples extends Calculate {

    protected int e = 0;
    protected int w;
    protected int t;
    protected ArrayList<Integer> arrayA = new ArrayList<>();
    protected ArrayList<Integer> arrayB = new ArrayList<>();

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap w:");
        w = sc.nextInt();
        System.out.println("Nhập t:");
        t = sc.nextInt();
        inPutArray();
    }

    void inPutArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Array A:");
        for (int i = t - 1; i >= 0; i--) {
            arrayA.add(sc.nextInt());
        }
        System.out.println("Nhập Array B:");
        for (int i = 0; i < t; i++) {
            arrayB.add(sc.nextInt());
        }
    }

    int bitMind(int a, int b, int e, int w) {
        if (a + b + e > tinhSoMu(1, w)) {
            return 1;
        } else {
            return 0;
        }
    }

    ArrayList Count() {
        ArrayList<Integer> arrayC = new ArrayList<>();
        arrayC.add(mod(arrayA.get(arrayA.size() - 1) + arrayB.get(arrayA.size() - 1) + e, tinhSoMu(1, w)));
        e = bitMind(arrayA.get(arrayA.size() - 1), arrayB.get(arrayA.size() - 1), e, w);
        for (int i = t - 2; i >= 0; i--) {
            arrayC.add(mod(arrayA.get(i) + arrayB.get(i) + e, tinhSoMu(1, w)));
            e = bitMind(arrayA.get(i), arrayB.get(i), e, w);
        }
        System.out.printf("e:" + e + "(");
        for (int i = t - 1; i >= 0; i--) {
            System.out.printf(arrayC.get(i) + ";");
        }
        System.out.printf(")");
        return arrayC;
    }

}
