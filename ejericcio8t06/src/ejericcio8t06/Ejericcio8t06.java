/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericcio8t06;

import java.util.Scanner;

/**
 *
 * @author hserranoc01
 */
public class Ejericcio8t06 {

    public static void rellenarVector(int vector[]) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce un valor para la celda " + i + ": ");
            vector[i] = teclado.nextInt();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
