/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1ampliacion;

import java.util.Scanner;

/**
 *
 * @author hserranoc01
 */
public class Ejercicio1ampliacion {

    public static void rellenarVector(int vector[]) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce un valor entre 0 y 10 para la celda " + i + ": ");
            vector[i] = teclado.nextInt();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[6];
        rellenarVector(vector);
    }

}
