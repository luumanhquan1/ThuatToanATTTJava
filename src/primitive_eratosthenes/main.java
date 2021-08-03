/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitive_eratosthenes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ASUS TUF
 */
public class main {

    public static void main(String[] args) throws FileNotFoundException, IOException {


        PrimitiveEratosthenes primitiveEratosthenes = new PrimitiveEratosthenes();
        primitiveEratosthenes.inPut();
        primitiveEratosthenes.element(primitiveEratosthenes.n, primitiveEratosthenes.arrayElement);
        primitiveEratosthenes.outPut();
    }
}
