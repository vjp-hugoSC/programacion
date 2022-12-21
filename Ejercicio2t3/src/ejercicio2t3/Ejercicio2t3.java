/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2t3;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Ejercicio2t3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,n2;
        
        System.out.println("Por favor, introduzca un número:");
        n1 = teclado.nextInt();
        
        System.out.println("Ahora introduzca un segundo número:");
        n2 = teclado.nextInt();
        
        if(n1>10) {
            System.out.println("La operación que se realizó es producto y el resultado es: "+(n1*n2));
        }
        else {
            System.out.println("La operación que se realizó es suma y el resultado es: "+(n1+n2));
        }
    }
    
}
