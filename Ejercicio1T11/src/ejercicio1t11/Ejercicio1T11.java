/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1t11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author hserranoc01
 */
public class Ejercicio1T11 {

    public static int generarAleatorio() {
        int aleatorio;
        aleatorio = (int) (Math.random() * 50);  //Generamos una temperatura aleatorio entre 0º y 49º
        return aleatorio;
    }

    //Rellena los días del mes
    public static Dia rellenarTemperaturas() {
        String[] vNombres = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int temperatura;
        int j = (int) (Math.random() * 7);  //Generamos aleatorio entre 0 y 6
        temperatura = generarAleatorio();  //Generamos una temperatura aleatorio entre 0º y 49º
        Dia dia = new Dia(vNombres[j], temperatura);
        j++; //Incrementamos el índice para que pase al siguiente nombre del día de la semana
        if (j == 7) {  //Si se pasa del domingo, volvemos a empezar en el 0 (el lunes)
            j = 0;
        }
        return dia;
    }
    public static void rellenarDia(Map<Integer, Dia> mapa){
        for(int i=0;i<31;i++){
            mapa.put(i, rellenarTemperaturas());
        }
    }
    
    public static void mostrarTemp(Map<Integer, Dia> mapa){
        for (Integer i : mapa.keySet()) {
            System.out.println("Clave: "+i+ "Valor: "+mapa.get(i).toString());
        }
    }
    
    public static void mostrarTempMedia(Map<Integer, Dia> mapa){
        int suma=0;
        int media;
        for (int i = 0; i < mapa.size(); i++) {
            suma+=mapa.get(i).getTemperatura();
        }
        media=suma/mapa.size();
    }
    
    public static void diaCaluroso(Map<Integer, Dia> mapa){
        int tempMax=mapa.get(0).getTemperatura();
        for (Integer m : mapa.keySet()) {
            if (mapa.get(m).getTemperatura()>tempMax) {
                tempMax=mapa.get(m).getTemperatura();
            }
        }
        
        for (Integer i : mapa.keySet()) {
            if (mapa.get(i).getTemperatura()==tempMax) {
                System.out.println("El dia mas caluroso feu "+mapa.get(i).getNombredia()+" dia "+i+"con"+tempMax+"grados");
            }
        }
    }
     /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Map<Integer, Dia> mapa = new HashMap<>(31);
       
        int opc;
       
        do{
            System.out.println("1.Rellenar las temperaturas:");
            System.out.println("2.Mostrar las temperaturas:");
            System.out.println("3.Visualizar la temperatura media:");
            System.out.println("4.Dia o días más calurosos del mes");
            System.out.println("5.Salir del programa");
            System.out.println("===OPCION===");
            opc=entrada.nextInt();
            switch(opc){
                case 1:
                    rellenarDia(mapa);
                    break;
                case 2:
                    mostrarTemp(mapa);
                    break;
                case 3:
                    mostrarTempMedia(mapa);
                    break;
                case 4:
                    diaCaluroso(mapa);
                    break;
                case 5:
                    System.out.println("Has salido del programa.");
                    break;
                default:
                    System.out.println("Por favor, pon un numero entre el 1 y 5");
            }
        }while(opc != 5);
        
    }
}
    

