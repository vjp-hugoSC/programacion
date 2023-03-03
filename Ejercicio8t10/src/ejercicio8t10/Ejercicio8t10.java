/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8t10;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author hserranoc01
 */
public class Ejercicio8t10 {

    public static String pedirNombre(){
        Scanner entrada = new Scanner  (System.in);
        System.out.println("--------------------------------");
        System.out.println("Introduce el Nombre del Alumno: ");
        return entrada.nextLine();
    }
    
    public static int pedirCurso(){
        Scanner entrada = new Scanner  (System.in);
        System.out.println("--------------------------------");
        System.out.println("Introduce el curso del Alumno: ");
        return entrada.nextInt();
    }
    
    public static void rellenarAlumnos(ArrayList<Alumno> alumnos){
        Scanner entrada = new Scanner  (System.in);
        String nombre;
        int curso;
        
        do {
            System.out.println("Datos del Alumno: ");
            alumnos.add(new Alumno(pedirNombre(),pedirCurso()));
            System.out.println("¿Desea añadir otro alumno?");
        } while (entrada.nextLine().equalsIgnoreCase("si"));
        
    }
    
    public static void mostrarAlumnos(ArrayList<Alumno> alumnos){
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("Datos del alumno número "+(i+1));
            System.out.println("Nombre "+alumnos.get(i).getNombre());
            System.out.println("Curso "+alumnos.get(i).getCurso());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList();
    }
    
}
