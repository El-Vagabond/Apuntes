package pruebass;

import java.io.*;

public class EjemploBuffering {
    
    public static void main(String[] args) {
        String archivo = "datos.txt"; // Sería ideal un archivo enorme
        
        System.out.println("=== PRUEBA DE VELOCIDAD ===");
        
        // Sin buffering
        long inicio = System.currentTimeMillis();
        leerSinBuffering(archivo);
        long tiempoSinBuffer = System.currentTimeMillis() - inicio;
        
        // Con buffering
        inicio = System.currentTimeMillis();
        leerConBuffering(archivo);
        long tiempoConBuffer = System.currentTimeMillis() - inicio;
        
        System.out.println("\nResultados:");
        System.out.println("Sin buffering: " + tiempoSinBuffer + " ms");
        System.out.println("Con buffering: " + tiempoConBuffer + " ms");
        System.out.println("Mejora: " + (tiempoSinBuffer - tiempoConBuffer) + " ms más rápido");
    }
    
    // Método SIN buffering (lento)
    public static void leerSinBuffering(String archivo) {
        try (FileReader fr = new FileReader(archivo)) {
            int caracter;
            while ((caracter = fr.read()) != -1) {
                // Procesar cada caracter individualmente
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Método CON buffering (rápido)
    public static void leerConBuffering(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Procesar línea completa
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
