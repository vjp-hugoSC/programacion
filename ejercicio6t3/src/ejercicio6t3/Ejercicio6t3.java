/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6t3;
import java.util.Scanner;
/**
 *
 * @author Hugo
 */
public class Ejercicio6t3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce la nota de tu examen: ");
        nota = entrada.nextInt(); 
        switch(nota){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Te has equivocado, la nota ha de ser inferior a 10.");
        }
        
    }
    
}
