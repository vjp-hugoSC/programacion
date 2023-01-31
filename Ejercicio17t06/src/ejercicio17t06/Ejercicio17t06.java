/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17t06;

/**
 *
 * @author Hugo
 */
public class Ejercicio17t06 {

    public static int generarAleatorio() {
        double aleatorioDouble;
        int aleatorio;
        aleatorioDouble = Math.floor((Math.random() * 10));
        aleatorio = (int) aleatorioDouble;
        return aleatorio;
    }

    public static void rellenarVector(int[] vector) {
        int n;
        for (int i = 0; i < vector.length; i++) {
            n = generarAleatorio();
            vector[i] = n;
        }
    }

    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + vector[i] + "]");
        }
    }
    public static void ordenarVector(int[] vector){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[10];
        rellenarVector(vector);
        mostrarVector(vector);
        ordenarVector(vector);
        System.out.println("--------------------------------------");
        System.out.println("------------Vector ordenado-----------");
        System.out.println("--------------------------------------");
        mostrarVector(vector);
    }

}
