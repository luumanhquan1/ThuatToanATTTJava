/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segment_eratosthenes;

import java.util.Scanner;
import primitive_eratosthenes.PrimitiveEratosthenes;

/**
 *
 * @author ASUS TUF
 */
public class SegmentEratosthenes extends PrimitiveEratosthenes {

    int delta;

    @Override
    public void inPut() {
        Scanner sc = new Scanner(System.in);
        super.inPut();
        System.out.println("Nhập đoạn <=" + Math.sqrt(n) + ":");
        delta = sc.nextInt();
    }

    public void primeSequence() {
        int index = 0;
        int number = 1;
        int max = delta + 1;
        while (true) {
            for (int i = 0; i < delta; i++) {//phân đoạn//
                if (number <n) {
                    number++;
                    if (index == 0) {//đoạn đầu sử dụng sàng nguyên thủy
                        super.element(max, arrayElement);
                        if (arrayElement[i + 2] == 1) {
                            System.out.print(" " + (i + 2));
                        }
                    } else {
                           arrayElement[number]=1;
                        for (int k = 2; k <= (int) Math.sqrt(max + delta); k++) {
                        }
                    }
                }
            }
            max = number;
            if (max == n) {
                break;
            }
            index++;
        }

    }

    public void outPut() {
        for (int i = 2; i <= 5; i++) {
//            System.out.println(" " + arrayElement[i]);
        }
    }
}
