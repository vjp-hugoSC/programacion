/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08t7;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio08T7 {

    public static String pedirNombreProducto(){
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.print("Introduzca nombre del producto: ");
        nombre = teclado.nextLine();
        return nombre;
    }
    
    public static int pedirPrecioProducto(){
        Scanner teclado = new Scanner(System.in);
        int precio;
        System.out.print("Introduzca precio del producto: ");
        precio = teclado.nextInt();
        return precio;
    }
    
    public static int pedirStockProducto(){
        Scanner teclado = new Scanner(System.in);
        int stock;
        System.out.print("Introduzca stock del producto: ");
        stock = teclado.nextInt();
        return stock;
    }
    
    public static void rellenarProductos(Producto[] vProductos){
        String nombre;
        int stock, precio;
        for(int i = 0;i < vProductos.length;i++){
            nombre = pedirNombreProducto();
            precio = pedirPrecioProducto();
            stock = pedirStockProducto();
            vProductos[i] = new Producto(nombre, precio, stock);
            System.out.println("-- PRODUCTO "+(i+1)+" ALMACENADO CON ÉXITO --");
        }
    }
    
    public static int pedirLongitud(){
        Scanner teclado = new Scanner(System.in);
        int numProd;
        do{
            System.out.print("Cuántos productos desea dar de alta? ");
            numProd = teclado.nextInt();
            if  (numProd <= 0){
                System.out.println("Error. Debe dar de alta algún producto.");
            }
        }while(numProd <= 0);
        return numProd;
    }
    
    //Mostramos el menú de administración y retornamos el vector de productos creado
    public static Producto[] mostrarMenuAdmin(){
        int numProd;
        Producto[] vProductos;
        System.out.println("-- Bienvenido a mi tienda de deportes --");
        System.out.println("");
        System.out.println("Acceso al menú de Administración");
        //numProd siempre va a ser positivo
        numProd = pedirLongitud();
        
        //CREAMOS VECTOR DE PRODUCTOS
        vProductos = new Producto[numProd];
        
        //RELLENAMOS PRODUCTOS
        rellenarProductos(vProductos);
        
        return vProductos;
    }
    
    public static void mostrarProductos(Producto[] vProductos){
        for(int i = 0;i < vProductos.length;i++){
            System.out.println("Pulse "+(i+1)+" para comprar "+vProductos[i].getNombre()+" cuyo precio es de "+vProductos[i].getPrecio()+" y el stock es de "+vProductos[i].getStock()+" unidades");
        }
    }
    
    public static int elegirProducto(){
        Scanner teclado = new Scanner(System.in);
        int opc;
        System.out.print("Elija producto: ");
        opc = teclado.nextInt();
        return opc;
    }
    
    public static int pedirUnidades(){
        Scanner teclado = new Scanner(System.in);
        int unidades;
        System.out.print("¿Cuántas unidades desea? ");
        unidades = teclado.nextInt();
        return unidades;
    }
    
    public static String seguirOSalir(){
        Scanner teclado = new Scanner(System.in);
        String resp;
        System.out.print("¿Desea comprar otro producto? (SI/NO) ");
        resp = teclado.nextLine();
        return resp;
    }
    
    public static void actualizarStock(Producto productoElegido, int unidades){
        int stockAct = productoElegido.getStock();
        productoElegido.setStock(stockAct-unidades);
    }
    
    public static void mostrarMenuVentas(Producto[] vProductos){
        Scanner teclado = new Scanner(System.in);
        String nombre, resp;
        int stock, precio, opc, unidades, stockAct, precioTotal = 0;
        System.out.println("Acceso al menú de Ventas: ");
        do{
            mostrarProductos(vProductos);
            opc = elegirProducto();
            System.out.println("Ha elegido comprar "+vProductos[opc-1].getNombre());
            unidades = pedirUnidades();
            //Actualizamos stock del producto
            stockAct = vProductos[opc-1].getStock();
            if  (stockAct >= unidades){
                actualizarStock(vProductos[opc-1], unidades);
                System.out.println("Venta realizada con éxito");
                precioTotal = precioTotal + (unidades * vProductos[opc-1].getPrecio());
            }
            else{
                System.out.println("Lo sentimos, sólo tenemos disponibles "+vProductos[opc-1].getStock()+" unidades.");
            }
            System.out.println("Subtotal: "+precioTotal+" euros");
            resp = seguirOSalir();
        }while(resp.equalsIgnoreCase("SI"));
        System.out.println("El total de su compra asciende a "+precioTotal+" euros");
        System.out.println("Muchas gracias. Vuelva cuando quiera. ");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto[] vProductos = mostrarMenuAdmin();
        mostrarMenuVentas(vProductos);
    }
    
}
