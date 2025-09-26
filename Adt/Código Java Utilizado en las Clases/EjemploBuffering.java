package pruebass;

import java.io.*;

public class EjemploBuffering {
    
    public static void main(String[] args) {
        //Creanos un archivo de prueba (debería ser grande para notar la diferencia)
        String archivo = "datos.txt"; // Sería ideal un archivo enorme
        //
        System.out.println("=== PRUEBA DE VELOCIDAD ===");
        
        // Creamos el archivo de prueba y  y lo leemos sin buffering
        long inicio = System.currentTimeMillis();
        leerSinBuffering(archivo);
        long tiempoSinBuffer = System.currentTimeMillis() - inicio;
        
        // Creamos el archivo de prueba y lo leemos con buffering
        inicio = System.currentTimeMillis();
        leerConBuffering(archivo);
        long tiempoConBuffer = System.currentTimeMillis() - inicio;
        //Mostramos los reultados con buffering vs sin buffering
        System.out.println("\nResultados:");
        System.out.println("Sin buffering: " + tiempoSinBuffer + " ms");
        System.out.println("Con buffering: " + tiempoConBuffer + " ms");
        System.out.println("Mejora: " + (tiempoSinBuffer - tiempoConBuffer) + " ms más rápido");
    }
    
    // Creamos el método para leer archivos sin buffering (lento)
    public static void leerSinBuffering(String archivo) {
        // Usamos try-with-resources para asegurar el cierre del FileReader
        //Creamos un FileReader para leer el archivo carácter por carácter 
        try (FileReader fr = new FileReader(archivo)) {
            int caracter;
            while ((caracter = fr.read()) != -1) {
                // Procesar cada caracter individualmente (ineficiente)
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Creamos el método para leer archivos con buffering (rápido)
    public static void leerConBuffering(String archivo) {
        // Usamos try-with-resources para asegurar el cierre del BufferedReader
        // BufferedReader envuelve a FileReader para mejorar la eficiencia
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            // Leemos línea por línea (mucho más eficiente)
            String linea;
            //Mientras haya líneas que leer lo procesamos
            while ((linea = br.readLine()) != null) {
                // Procesar línea completa
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
