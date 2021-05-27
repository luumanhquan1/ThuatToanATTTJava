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
public class CorrrectlyAddMultiples extends Calculate{
   int e=0;
    int w;
    int t;
    ArrayList<Integer> arrayA = new ArrayList<>();
    ArrayList<Integer> arrayB = new ArrayList<>();

    void inPutArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Array A:");
        for (int i = 0; i < t; i++) {
            arrayA.add(sc.nextInt());
        }
        System.out.println("Nhập Array B:");
        for (int i = 0; i < t; i++) {
            arrayB.add(sc.nextInt());
        }
    }

    public void inPut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap w:");
        w = sc.nextInt();
        System.out.println("Nhập t:");
        t = sc.nextInt();
        inPutArray();
    }

    public void Count() {
        ArrayList<Integer> arrayC = new ArrayList<>();
        arrayC.add(arrayA.get(0) + arrayB.get(0));
        for (int i = 1; i < t; i++) {
                 
        }
    }
}
