/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24t3;
import java.util.Scanner;
/**
 *
 * @author hserranoc01
 */
public class Ejercicio24t3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n1, n2;
        
        do{
            System.out.println("Por favor introduzca un numero:");
            n2= entrada.nextInt();
            if (n2<=0){
                System.out.println("Te has confundido, el numero ha de ser mayor a 0");
            }
        }while(n2<1);
        
        
    }
    
}
