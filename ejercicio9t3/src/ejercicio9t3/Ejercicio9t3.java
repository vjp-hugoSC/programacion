/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9t3;
import java.util.Scanner;
/**
 *
 * @author Hugo
 */
public class Ejercicio9t3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int n1, n2, n3, n4, aux, contador;
        System.out.println("Por favor, Introduzca el primer numero: ");
        n1=entrada.nextInt();
        
        System.out.println("Ahora, Introduzca el segundo numero: ");
        n2=entrada.nextInt();
        
        System.out.println("Introduzca el tercer numero: ");
        n3=entrada.nextInt();
        
        System.out.println("Por ultimo, Introduzca el cuarto numero: ");
        n4=entrada.nextInt();
        
        for(contador=1;contador<=4;contador++){
            if (n1>n2) {
            aux=n1;
            n1=n2;
            n2=aux;
        }
            if (n2>n3) {
            aux=n2;
            n2=n3;
            n3=aux;         
        }
            if (n3>n4) {
            aux=n3;
            n3=n4;
            n4=aux;  
        }
        }
        System.out.println("El orden de los numeros introducidos es el: "+n1+ "-"+n2+ "-"+n3+"-"+n4);
    }
    
}
