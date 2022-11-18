/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21t2;
import java.util.Scanner;
/**
 *
 * @author hserranoc01
 */
public class Ejercicio21t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaI = new Scanner(System.in);
        
        int segundos;
        System.out.println("Por favor, Introduzca un Número de segundos: ");
        segundos=entradaI.nextInt();
        
        int segundos2;
        segundos2=segundos;
        
        int dias = segundos/86400;
        segundos2=segundos2%86400;
        int horas=segundos2/3600;
        segundos2=segundos2%3600;
        int minutos=segundos2/60;
        segundos2=segundos2%60;
        int segund=segundos2;
        
        System.out.println(segundos+" segundos hacen un total de: "+dias+" dias, "+horas+" horas, "+minutos+" minutos y "+segund+" segundos");
        
    }
    
}
