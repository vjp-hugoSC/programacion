/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20t2;
import java.util.Scanner;
/**
 *
 * @author hserranoc01
 */
public class Ejercicio20t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaD = new Scanner(System.in);
       
        double n1;
        double n2;
        int suma;
        
        System.out.println("\t Escriba el primer entero: ");
        n1=entradaD.nextDouble();
        System.out.println("\t Escriba el segundo entero: ");
        n2=entradaD.nextDouble();
        suma =(int)n1+(int)n2 ;
        System.out.println("La suma es: " +suma);
    }
    
}
