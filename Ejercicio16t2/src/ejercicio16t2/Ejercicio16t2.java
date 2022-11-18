/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16t2;

/**
 *
 * @author hserranoc01
 */
public class Ejercicio16t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cartera = 130, carteraaux, billetes50, billetes10;
        carteraaux = cartera;
        billetes50 = cartera/50;
        cartera= cartera%50;
        billetes10=cartera/10;
        System.out.println(carteraaux+" euros hacen un total de: ");
    }
    
}
