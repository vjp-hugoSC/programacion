/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16t3;

/**
 *
 * @author hserranoc01
 */
public class Ejercicio16t3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=20;
        do {
            if (x%2==0){
                
            }
            else{
                System.out.println("Los números impares existentes entre el número 20 y el 160 son: "+x);
            }
            x++;
        }while(x<=160);
        System.out.println("La cantidad de numeros impares ha sido "+x);
    }
    
}
