/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2t11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author hserranoc01
 */
public class Ejercicio2T11 {

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un nombre para el producto");
        String nombre = entrada.nextLine();

        return nombre;
    }

    public static float pedirPrecio() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un precio para el producto");
        float precio = entrada.nextFloat();

        return precio;
    }

    public static int pedirStock() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un stock para el producto");
        int stock = entrada.nextInt();

        return stock;
    }

    public static void introducirProductos(Map<Integer, Producto> mapa) {
        String nombre = pedirNombre();
        float precio = pedirPrecio();
        int stock = pedirStock();

        Producto p1;
        p1 = new Producto(nombre, precio, stock);

        mapa.put(mapa.size(), p1);

    }

    public static void visualizarProductos(Map<Integer, Producto> mapa) {
        for (Integer i : mapa.keySet()) {
            System.out.println("Producto " + i + mapa.get(i).toString());
        }
    }

    public static void eliminarProductos(Map<Integer, Producto> mapa) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la clave que quieres eliminar :");
        int borrar = entrada.nextInt();
        mapa.remove(borrar);
    }

    public static void menuAdministracion(Map<Integer, Producto> mapa) {
        Scanner entrada = new Scanner(System.in);
        int opc;

        do {
            System.out.println("-----MENU-DE-ADMINISTRACION-----");
            System.out.println("1. Introducir productos en la lista");
            System.out.println("2. Visualizar todos los productos");
            System.out.println("3. Eliminar productos de la lista");
            System.out.println("4. Volver al Menu Principal");
            System.out.println("-----------OPCION---------------");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    introducirProductos(mapa);
                    System.out.println("\n");
                    break;
                case 2:
                    visualizarProductos(mapa);
                    System.out.println("\n");
                    break;
                case 3:
                    eliminarProductos(mapa);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("Has salido del menu.");
                    break;
                default:

            }
        } while (opc != 4);
    }

    public static void menuCompra(Map<Integer, Producto> mapa) {
        Scanner entrada = new Scanner(System.in);
        int opc;

        do {
            System.out.println("---------MENU-DE-COMPRA---------");
            System.out.println("1. Comprar productos");
            System.out.println("2. Volver al Menu Principal");
            System.out.println("-----------OPCION---------------");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Has salido del menu.");
                    System.out.println("\n");
                    break;
                default:
            }
        } while (opc != 2);
    }

    public static void comprarProductos(Map<Integer, Producto> mapa){
        System.out.println("La lista de los productos que hay disponible es la siguiente: "+mapa.toString());
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Map<Integer, Producto> mapa = new HashMap<>();
        int opc;

        do {
            System.out.println("------------MENU----------------");
            System.out.println("1. Menu de Administracion");
            System.out.println("2. Menu de Compra");
            System.out.println("3. Salir");
            System.out.println("-----------OPCION---------------");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    menuAdministracion(mapa);
                    System.out.println("\n");
                    break;
                case 2:
                    menuCompra(mapa);
                    break;
                case 3:
                    System.out.println("Has salido del menu.");
                    break;
                default:

            }
        } while (opc != 3);

    }

}
