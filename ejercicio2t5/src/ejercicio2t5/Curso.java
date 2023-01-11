/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2t5;

/**
 *
 * @author hserranoc01
 */
public class Curso {
    private static int numerodecursos=0;
    private String nombre;
    private int numhoras;
    
    public String getnombre(){
        return nombre;
    }
    public int getNumhoras(){
        return numhoras;
    }
    public void setnombre(String nom){
        nombre = nom;
    }
    public void setNumhoras(int num){
        numhoras = num;
    }
    public static void sumarCursos(){
        numerodecursos++;
    }
    public static void vernumerocursos(){
        System.out.println("numero de cursos: "+numerodecursos);
    }
}
