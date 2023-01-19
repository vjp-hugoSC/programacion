/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22t5;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Ejercicio22t5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        objeto obj1 = new objeto("Canarios", 10, 30);
        objeto obj2 = new objeto("Pienso perros", 7, 43);
        objeto obj3 = new objeto("pez globo", 3, 21);
        Scanner teclado = new Scanner(System.in);
        int opc;

        do {
            System.out.println("Pulse 1 para comprar canarios cuyo precio es 10 y su stock es de 30: ");
            System.out.println("Pulse 1 para comprar Pienso para perros cuyo precio es 7 y su stock es de 43: ");
            System.out.println("Pulse 1 para comprar canarios cuyo precio es 3 y su stock es de 21: ");
            opc = teclado.nextInt();
        } while (opc < 3 && opc > 0);
    }

}
