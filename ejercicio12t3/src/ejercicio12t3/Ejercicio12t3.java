/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12t3;

/**
 *
 * @author Hugo
 */
public class Ejercicio12t3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 11;
        do {
            if (x%2==0){
                System.out.println(x+ " Es un par entre 11 y 133");
            }
            x++;
        }while (x<133);
        
    }
    
}
