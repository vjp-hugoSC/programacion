/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3t1;

import java.util.Scanner;

/**
 *
 * @author hserranoc01
 */
public class Ejercicio3t1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n1;
        
        System.out.println("Por favor, introduzca un número: ");
        n1 = teclado.nextInt();
        
        if(n1<0){
            System.out.println("El número es negativo");
        }
        else {
            System.out.println("El numero es positivo");
        }
    }
    
}
