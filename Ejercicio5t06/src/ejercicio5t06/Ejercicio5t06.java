/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5t06;

import java.util.Scanner;

/**
 *
 * @author hserranoc01
 */
public class Ejercicio5t06 {

    public static void pedirVector(int vector[][]) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                System.out.println("Introduce un valor para la posición [" + i + j + "] : ");
                vector[i][j] = teclado.nextInt();
            }

        }
    }

    public static void mostrarVector(int vector[][]) {
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                System.out.println("[" + i + j + "] = " + vector[i][j]);
            }
        }
    }

    private static void mostrarMayor(int vector[][]) {
        int mayor;
        mayor = vector[0][0];
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                if (vector[i][j] > mayor) {
                    mayor = vector[i][j];
                }
            }
        }
        System.out.println("El mayor es:"+mayor);
    }

    private static void mostrarMenor(int vector[][]) {
        int menor;
        menor = vector[0][0];
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                if (vector[i][j] < menor) {
                    menor = vector[i][j];
                }
            }
        }
        System.out.println("El menor es:"+menor);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] vector = new int[4][2];
        pedirVector(vector);
        mostrarVector(vector);
        mostrarMayor(vector);
        mostrarMenor(vector);
    }
}
