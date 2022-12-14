/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14t4;
import java.util.Scanner;
/**
 *
 * @author hserranoc01
 */
public class Ejercicio14T4 {

    public static int pedirdato(){
        int numero;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Por favor, introduzca un número mayor a 0: ");
        numero= teclado.nextInt();
        return numero;
    }
        
    public static int comprobar(int numero){
        boolean mayoracero;
        do {
            if(numero<0){
                mayoracero=true;
                System.out.println("Error el número es menor a 0");
            }
            else{
                mayoracero=false;
            }
        }while(mayoracero=true);
        return numero;
    }
    
    public static int calculos(int numero){
        
    }
    public static void main(String[] args) {
        
    }
    
}
