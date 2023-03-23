package ed_ut4_proyecto;

import java.util.Scanner;

public class ED_UT4_Proyecto {
/**
 * El método main es el punto de entrada de la aplicación.
 * Se encarga de inicializar un objeto Scanner para recibir la entrada del usuario, 
 * y un arreglo de objetos Pelicula de tamaño 2.
 * A continuación, se muestra un menú con 6 opciones que el usuario puede elegir.
 * Cada opción llama a una función auxiliar que realiza una operación específica con el arreglo de objetos Pelicula.
 * La aplicación se ejecuta en un bucle do-while que se repite hasta que el usuario elige la opción "Salir" (6).
 * @param args Argumentos de la línea de comandos. No se utilizan en este programa.
 */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pelicula[] vPeliculas = new Pelicula[2];
        int opc;
        do {
            System.out.println("1. Rellenar");
            System.out.println("2. Mostrar");
            System.out.println("3. Mostrar + rentable");
            System.out.println("4. Mostrar - rentable");
            System.out.println("5. Buscar película");
            System.out.println("6. Salir");
            opc = teclado.nextInt();
            teclado.nextLine(); // Sirve para omitir el salto de línea después de leer un número
            switch (opc) {
                case 1:
                    rellenar(vPeliculas);
                    System.out.println("\n");
                    break;
                case 2:
                    mostrar(vPeliculas);
                    System.out.println("\n");
                    break;
                case 3:
                    masRentable(vPeliculas);
                    System.out.println("\n");
                    break;
                case 4:
                    menosRentable(vPeliculas);
                    System.out.println("\n");
                    break;
                case 5:
                    buscarPelicula(vPeliculas);
                    System.out.println("\n");
                    break;
                case 6:
                    System.out.println("HAS SALIDO DEL PROGRAMA ");
                    System.out.println("\n");
                    break;
            }

        } while (opc != 6);
    }

    public static void rellenar(Pelicula[] vPeliculas) {
        Scanner teclado = new Scanner(System.in);
        String n;
        float l, precioA;
        for (int i = 0; i < vPeliculas.length; i++) {
            rellenarTitulo(vPeliculas);
            rellenarPrecioLicencia(vPeliculas);
            for (int j = 0; j < vPeliculas[i].vSocios.length; j++) {
                rellenarNombreSocio(vPeliculas);
                rellenarPrecioAbonado(vPeliculas);
            }
        }
    }

    public static void rellenarTitulo(Pelicula[] vPeliculas) {
        Scanner teclado = new Scanner(System.in);
        String t;
        for (int i = 0; i < vPeliculas.length; i++) {
            vPeliculas[i] = new Pelicula();
            System.out.println("Titulo: ");
            t = teclado.nextLine();
            vPeliculas[i].titulo = t;
        }
    }

    public static void rellenarPrecioLicencia(Pelicula[] vPeliculas) {
        Scanner teclado = new Scanner(System.in);
        float l;
        for (int i = 0; i < vPeliculas.length; i++) {
            System.out.println("Precio de Licencia: ");
            l = teclado.nextFloat();
            teclado.nextLine(); // Sirve para omitir el salto de línea después de leer un número
            vPeliculas[i].costeLicencia = l;
        }
    }

    public static void rellenarNombreSocio(Pelicula[] vPeliculas) {
        Scanner teclado = new Scanner(System.in);
        String n;
        for (int i = 0; i < vPeliculas.length; i++) {
            for (int j = 0; j < vPeliculas[i].vSocios.length; j++) {
                vPeliculas[i].vSocios[j] = new Socio();
                System.out.println("Nombre de Socio: ");
                n = teclado.nextLine();
                vPeliculas[i].vSocios[j].nombre = n;
            }
        }
    }

    public static void rellenarPrecioAbonado(Pelicula[] vPeliculas) {
        Scanner teclado = new Scanner(System.in);
        float precioA;
        for (int i = 0; i < vPeliculas.length; i++) {
            for (int j = 0; j < vPeliculas[i].vSocios.length; j++) {
                System.out.println("Precio Abonado: ");
                precioA = teclado.nextFloat();
                teclado.nextLine(); // Sirve para omitir el salto de línea después de leer un número
                vPeliculas[i].vSocios[j].precioAbonado = precioA;
            }
        }
    }

    public static void mostrar(Pelicula[] vPeliculas) {
        for (int i = 0; i < vPeliculas.length; i++) {
            vPeliculas[i].mostrarPelicula();
        }
    }

    public static void masRentable(Pelicula[] vPeliculas) {
        String t;
        float rAct, rMax;
        rMax = vPeliculas[0].getRentabilidad();
        t = vPeliculas[0].titulo;
        for (int i = 0; i < vPeliculas.length; i++) {
            rAct = vPeliculas[i].getRentabilidad();
            if (rAct > rMax) {
                rMax = rAct;
                t = vPeliculas[i].titulo;
            }
        }
        System.out.println("La película " + t + " con una rentabilidad de " + rMax + " euros es la mas rentable");
    }

    public static void menosRentable(Pelicula[] vPeliculas) {
        String t;
        float rAct, rMin;
        rMin = vPeliculas[0].getRentabilidad();
        t = vPeliculas[0].titulo;
        for (int i = 0; i < vPeliculas.length; i++) {
            rAct = vPeliculas[i].getRentabilidad();
            if (rAct < rMin) {
                rMin = rAct;
                t = vPeliculas[i].titulo;
            }
        }
        System.out.println("La película " + t + " con una rentabilidad de " + rMin + " euros es la menos rentable");
    }

    public static void buscarPelicula(Pelicula[] vPeliculas) {
        Scanner teclado = new Scanner(System.in);
        String t;
        boolean enc;
        System.out.println("Título: ");
        t = teclado.nextLine();
        int i = 0;
        enc = false;
        while ((i < vPeliculas.length) && (!enc)) {
            if (vPeliculas[i].titulo.equalsIgnoreCase(t)) {
                enc = true;
            } else {
                i++;
            }
        }
        if (enc) {
            vPeliculas[i].mostrarPelicula();
            System.out.println(vPeliculas[i].getRentabilidad());
        } else {
            System.out.println("La película no está registrada");
        }
    }
}
