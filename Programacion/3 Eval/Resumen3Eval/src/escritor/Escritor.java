/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Vagabond
 */
public class Escritor {

    public static void escribirfichero() {

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("texto.txt"));

            Scanner escaner = new Scanner(System.in);
            String palabra;

            do {
                System.out.println("Introduce una palabra");
                palabra = escaner.nextLine();
                escritor.write(palabra);
                escritor.newLine();

            } while (!palabra.isEmpty());

        } catch (IOException e) {
            System.out.println("Fichero no encontrado");
        }

    }

    public static int escribirColeccion(LinkedList<String> lista) {

        int nlineas = 0;

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("texto.txt", true));
            int contadorlineas = 0;
            for (String palabra : lista) {
                contadorlineas++;
                escritor.write(palabra);

                if (contadorlineas == 3) {
                    escritor.newLine();
                    contadorlineas = 0;
                    nlineas++;
                }
            }
        } catch (IOException e) {
            System.out.println("Fichero no encontrado");
        }
        return nlineas;
    }

    public static String leerUltimaPalabra() {
        String palabra = " ";
        try {
            BufferedReader lector = new BufferedReader(new FileReader("texto.txt"));
            String linea = " ";
            while ((linea = lector.readLine()) != null) {
                String[] palabras = linea.split(" ");
                if (palabras.length > 0) {
                    palabra = palabras[palabra.length() - 1];
                }
                linea = lector.readLine();
            }

        } catch (IOException e) {
            System.out.println("Fichero no encontrado");
        }
        return palabra;
    }

    public static int contarEspacios() {
        int espacios = 0;

        try {
            BufferedReader escritor = new BufferedReader(new FileReader("texto.txt"));
            int caracter = 0;

            while ((caracter = escritor.read()) != -1) {
                caracter = escritor.read();
                char letra = (char) caracter;

                if (letra == ' ') {
                    espacios++;
                }
            }
        } catch (Exception e) {
        }
        return espacios;
    }

    public static void escribirFichero(String fichero, String contenido) {
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(fichero));

            String[] filas = contenido.split("\\.");

            for (int i = 0; i < filas.length - 1; i++) {
                escritor.write(filas[i]);
                if (i < filas.length - 1) {
                    escritor.newLine();
                }

            }

        } catch (IOException e) {
        }

    }

    public static void escribirNumeros(String fichero, ArrayList<Integer> lista) {
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(fichero, true));

            for (int i = 0; i < lista.size() - 1; i++) {
                escritor.write(lista.get(i).toString());
                if (i < lista.size() - 1) {
                    escritor.write(',');
                }
            }

        } catch (IOException e) {
        }
    }

    public static int buscarPalabra(String palabra) {

        try {
            /*  BufferedReader lector = new BufferedReader(new FileReader("texto.txt"));

            String linea;
            int numLinea = 0;
            while ((linea = lector.readLine()) != null) {
                numLinea++;
                if (linea.contains(palabra)) {
                    return numLinea;
                }

            }

            
             */

            BufferedReader lector = new BufferedReader(new FileReader("texto.txt"));

            int numLinea = 0;
            String linea = " ";

            while ((linea = lector.readLine()) != null) {
                numLinea++;
                if (linea.contains(palabra)) {
                    return numLinea;
                } else {
                    return -1;
                }

            }

            int numPalabras = 0;

            String lineas = " ";

            while ((linea = lector.readLine()) != null) {
                if (lineas.contains(palabra)) {
                    numPalabras++;
                }
                return numPalabras;
            }

        } catch (IOException e) {
        }
        return -1;
    }

    public static void escribirNumeros(ArrayList<Integer> numeros, String ficheros) {

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(ficheros, true));
            String lineas = " ";
            for (int i = 0; i < numeros.size() - 1; i++) {

                if (i < numeros.size() - 1) {
                    escritor.write(',');
                }
            }

        } catch (IOException ex) {
            System.out.println("Fichero no encontrad");
        }

    }

    public static void escritorfichero(String fichero, String contenido) {

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter(fichero));
            String[] lineas = contenido.split("\\.");

            for (int i = 0; i < lineas.length - 1; i++) {
                escritor.write(lineas[i]);
                if (i < lineas.length - 1) {
                    escritor.newLine();
                }
            }

        } catch (IOException e) {
            System.out.println("Error encontrado");
        }

    }

    public static void escritoresFichero() {
        Scanner escaner = new Scanner(System.in);

        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("texto.txt"));
            {
                System.out.println("Introduce palabras.Cadena vacia termina.");

                String palabra = escaner.nextLine();
                while ((!palabra.isEmpty())) {
                    escritor.write(palabra);

                }

            }
        } catch (IOException e) {
            System.out.println("Error");
        }

    }

    public static int main(LinkedList<Integer> lista) {
        int numLineas = 0;
        int contador = 0;
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("texto.txt"));
            for (int i = 0; i < lista.size() - 1; i++) {
                escritor.write(lista.get(i).toString());
                contador++;
                if (contador == 3) {
                    escritor.newLine();
                    numLineas++;

                }

            }
        } catch (Exception e) {
        }
        return numLineas;
    }

    public static int main() {

        int numespacios=0;
        try {BufferedReader lector = new BufferedReader(new FileReader("texto.txt"));{
            int caracter;

            while((caracter=lector.read())!=-1){
                char letra=(char)caracter;

                if(letra==' '){
                    numespacios++;
                    return numespacios;
                }else{
                    return -1;
                }

            }
            
        }
            
        } catch (Exception e) {
        }
        return 1;
   }

   public static void escribirfichero(String fichero,String contenido){
    
    try {BufferedWriter escritor = new BufferedWriter(new FileWriter(fichero));
        String[]texto=contenido.split("\\.");
        for(int i=0; i<texto.length;i++){
            escritor.write(texto[i]);
            if(i<texto.length-1){
                escritor.newLine();
            }

        }
        
    } catch (Exception e) {
    }

   }
}
