package ficheros;

import java.io.FileWriter;
import java.io.IOException;

// Ejemplo de uso de finally para asegurar el cierre de recursos
public class Finally {
    public static void main(String[] args) {
        // Declaramos el FileWriter fuera del try para poder usarlo en finally
        FileWriter writer = null;
        // Intentamos escribir en un archivo
        try {
            // Abrimos el archivo (puede lanzar IOException)
            writer = new FileWriter("ejemplo.txt");
            // Escribimos algo en el archivo
            writer.write("Hola mundo");
        } // Capturamos la excepción si ocurre un error de E/S
        catch (IOException e) {
            System.out.println("Error al escribir en el fichero.");
        }
        // finally se ejecuta siempre, haya o no excepción
        finally {
            // Intentamos cerrar el FileWriter si se abrió correctamente
            try {
                // Comprobamos que no sea null antes de cerrar
                if (writer != null) {
                    // Cerramos el recurso
                    writer.close();
                    // Confirmamos que se cerró
                    System.out.println("Fichero cerrado.");
                }
            }
            // Capturamos cualquier error al cerrar el recurso
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
