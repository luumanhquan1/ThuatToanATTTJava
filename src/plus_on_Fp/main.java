/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plus_on_Fp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ASUS TUF
 */
public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String file="D:\\abc.txt";
        FileReader  fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String line;
        while ((line=br.readLine())!=null) {
            System.out.println(line);
            Thread.sleep(500);
            
        }
//        PlusOnFp plusOnFp=new PlusOnFp();
//        plusOnFp.inPut();
//        plusOnFp.count();
    }
}
