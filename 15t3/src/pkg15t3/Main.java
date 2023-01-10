/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15t3;
import java.util.Scanner;
/**
 *
 * @author Hugo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,i=0,result;
        
        System.out.println("Introduzca un número para calcular su tabla de multiplicar:");
        n1=teclado.nextInt();
        
        for(i=1;i<=10;i++){
            result=n1*i;
            System.out.println(result);
        }
    }
    
}
