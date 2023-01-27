/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocla;

import java.util.Scanner;

/**
 *
 * @author hserranoc01
 */
public class Ejerciciocla {

    public static void rellenarVector(int vector[]) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce un valor para la celda " + i + ": ");
            vector[i] = teclado.nextInt();
        }
    }

    public static void mostrarVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("El valor guardado en la posición " + i + "es :" + vector[i]);
        }

    }

    public static void pedirNumero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número");
        return;
    }
    public static void comprobarNumero(int num,int vector[]){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[10];
        rellenarVector(vector);
        mostrarVector(vector);
    }

}
