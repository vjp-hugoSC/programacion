/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8t06;

import java.util.Scanner;

/**
 *
 * @author hserranoc01
 */
public class Ejercicio8t06 {

    public static void pedirVector(int vector[]) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce 5 números, en el siguiente orden, por favor "
                    + " número: " +(i+1)+": " );
            vector[i] = teclado.nextInt();

        }
    }

    public static void mostrarVector(int vector[]){
        for (int i = 0; i < vector.length; i++) {
             System.out.println("[" + i + "] = " + vector[i]);
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[5];
        pedirVector(vector);
        System.out.println("-------Mostrando Vector-------");
        mostrarVector(vector);
        System.out.println("-------Mostrando vector al reves-------");
    }

}
