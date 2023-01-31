/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14t06;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Ejercicio14t06 {

    public static void mostrarMenu(int vector[][]){
        Scanner teclado = new Scanner (System.in);
        System.out.println("1 Rellenar las temperaturas.");
        System.out.println("2 Mostrar las temperaturas.");
        System.out.println("3 Visualizar la temperatura media del mes");
        System.out.println("4 Día o días más calurosos del mes");
        System.out.println("5 Salir del programa.");
        vector[i][j]=teclado.nextInt();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] vector = new int[4][7];
        mostrarMenu(vector);
    }
    
}
