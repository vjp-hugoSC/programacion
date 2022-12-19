/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23t2;
import java.util.Scanner;
/**
 *
 * @author hserranoc01
 */
public class Ejercicio23t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio;
        int uds;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        precio = teclado.nextDouble();
        System.out.println("¿Cuántas unidades quiere llevarse? ");
        uds=teclado.nextInt();
        double resultado= precio*uds;
        System.out.println("El precio total de su compra es: "+resultado);
    }
    
}
