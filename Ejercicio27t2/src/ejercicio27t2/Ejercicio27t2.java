/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio27t2;
import java.util.Scanner;
/**
 *
 * @author Hugo
 */
public class Ejercicio27t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,doble,cubo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número: ");
        n1= teclado.nextInt();
        doble = n1*n1;
        System.out.println("El doble de "+n1+ " es: "+doble);
        cubo = n1*n1*n1;
        System.out.println("El cubo de "+n1+ " es: "+cubo);
    }
    
}
