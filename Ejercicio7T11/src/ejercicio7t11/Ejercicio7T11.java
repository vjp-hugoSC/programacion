/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7t11;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author hserranoc01
 */
public class Ejercicio7T11 {

    public static String pedirNombreC(HashMap<Integer,Campania> mapa) {
        Scanner teclado = new Scanner(System.in);
        String nombre;

        System.out.println("Por favor, introduce el nombre de la campaña");
        nombre = teclado.nextLine();
        Campania c=new Campania(nombre);
        mapa.put(mapa.size(),c);
        return nombre;
    }
    public static void rellenarDonacion(HashMap<Integer,Campania> mapa){
        Scanner teclado=new Scanner(System.in);
        Campania c=new Campania();
       
        c.rellenarDatos();
        int i;
       
        System.out.println("¿A que campaña quiere añadir la donacion?");
        i=teclado.nextInt();
       
        mapa.put(i,c);
       
    }
    public static void mostrarDatos(HashMap<Integer,Campania> mapa){
        for (Integer i : mapa.keySet() ) {
            System.out.println("===CAMPAÑA===");
            System.out.println("Nombre: "+mapa.get(i).getNombreC());
            mapa.get(i).mostrarDatos();
        }
    }
    public static void totalDinero(HashMap<Integer,Campania> mapa){
        for (Integer i : mapa.keySet()) {
            mapa.get(i).mostrarDinero();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int opc;
        HashMap<Integer,Campania> mapa=new HashMap<>();
       
        do{
            System.out.println("1.Añadir campaña.");
            System.out.println("2.Añadir donacion.");
            System.out.println("3.Mostrar datos.");
            System.out.println("4.Mostrar campaña por nombre.");
            System.out.println("5.Mostrar total de dinero recaudado.");
            System.out.println("6.Mostrar Mayor donacion.");
            System.out.println("7.Salir del menu.");
            System.out.println("===OPCION===");
            opc=teclado.nextInt();
           
            switch(opc){
                case 1:
                    pedirNombreC(mapa);
                    System.out.println("\n");
                    break;
                case 2:
                    rellenarDonacion(mapa);
                    System.out.println("\n");
                    break;
                case 3:
                    mostrarDatos(mapa);
                    System.out.println("\n");
                    break;
                case 4:
                   
                    System.out.println("\n");
                    break;
                case 5:
                    totalDinero(mapa);
                    System.out.println("\n");
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Has salido del programa.");
                    break;
                default:
                    System.out.println("Introduce un numero entre el 1 y el 7.");
            }
        }while(opc!=7);
    }
}
