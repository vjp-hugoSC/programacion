/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25t2;
import java.util.Scanner;
/**
 *
 * @author Hugo
 */
public class Ejercicio25t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3,suma,producto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer número: ");
        n1 = teclado.nextInt();
        System.out.println("Por favor, introduzca el segundo número: ");
        n2 = teclado.nextInt();
        System.out.println("Por favor, introduzca el tercer número: ");
        n3 = teclado.nextInt();
        suma = n1+n2+n3;
        producto = n1*n2*n3;
        System.out.println("La suma de los numeros introducidos es: "+suma);
        System.out.println("El producto de los numeros introducidos es: "+producto);
    }
    
}
