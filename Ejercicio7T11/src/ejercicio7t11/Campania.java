/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7t11;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author hserranoc01
 */
public class Campania {
    private String nombreC;
    private HashSet<Donacion> conjunto;

    public Campania() {
        this.conjunto = new HashMap<>();
        this.nombreC = "";
    }

    public Campania(String nombreC) {
        this.conjunto = new HashMap<>();
        this.nombreC = nombreC;
    }

    public HashMap<Integer, Donacion> getConjunto() {
        return conjunto;
    }

    public void setConjunto(HashMap<Integer, Donacion> conjunto) {
        this.conjunto = conjunto;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String pedirNombre() {
        Scanner teclado = new Scanner(System.in);
        String nombre;

        System.out.println("Por favor, introduce el nombre del donante:");
        nombre = teclado.nextLine();
        return nombre;
    }

    public int pedirCantidadD() {
        Scanner teclado = new Scanner(System.in);
        int cantidad;

        System.out.println("Introduce la cantidad a donar:");
        cantidad = teclado.nextInt();
        return cantidad;
    }

    public void rellenarDatos() {
        String nombrec;
        String nombre;
        int cantidad;
        nombre = pedirNombre();
        cantidad = pedirCantidadD();

        Donacion dDonacion = new Donacion(nombre, cantidad);
        this.conjunto.put(cantidad, dDonacion);
    }
    public void mayorDonacion(){
        
    }

    }
    

