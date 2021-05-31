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

    public int e = 0;
    public int w;
    public int t;
    public int arrayA[];
    public int arrayB[];
    public int arrayC[];

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap w:");
        w = sc.nextInt();
        System.out.println("Nhập t:");
        t = sc.nextInt();
        arrayA=new int[t];
        arrayB=new int[t];
        arrayC=new int[t];
        inPutArray();
    
    }

    public void inPutArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Array A:");
        for (int i =t-1; i >=0; i--) {
            System.out.printf("a[%d]=", i);
            arrayA[i]=sc.nextInt();
        }
        System.out.println("Nhập Array B:");
        for (int i =t-1; i >=0; i--) {
            System.out.printf("b[%d]=", i);
             arrayB[i]=sc.nextInt();
        }
    }

    int bitMind(int a, int b, int e, int w) {
        if (a + b + e > tinhSoMu(1, w)) {
            return 1;
        } else {
            return 0;
        }
    }

    public void Count(int A[],int B[]) {
        arrayC[0]=(mod(A[0] + B[0] + e, tinhSoMu(1, w)));
        e = bitMind(A[0], B[0], e, w);
        for (int i = 1; i < t; i++) {
            arrayC[i]=(mod(A[i] + B[i] + e, tinhSoMu(1, w)));
            e = bitMind(A[i], B[i], e, w);
        }
    }

    public void outPut() {
        System.out.printf("e:" + e + "(");
        for (int i = t - 1; i >= 0; i--) {
            System.out.printf(arrayC[i] + ";");
        }
        System.out.printf(")");
    }
}
