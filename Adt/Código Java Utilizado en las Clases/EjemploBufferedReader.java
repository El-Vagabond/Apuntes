package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjemploBufferedReader {
    public static void main(String[] args) {
        try {
            // Abrimos el fichero en modo lectura
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            //Creamos una variable para almacenar cada línea leída
            String linea;
            // Mostramos un mensaje indicando que vamos a leer el fichero
            System.out.println("Contenido del fichero:");

            // Leer línea a línea (acceso secuencial)
            while ((linea = br.readLine()) != null) {
                System.out.println("- " + linea);
            }

            // Cerrar el BufferedReader
            br.close();
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
