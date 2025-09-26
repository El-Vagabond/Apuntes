package ficheros;

import java.io.IOException;
import java.io.RandomAccessFile;

public class EjemploRandomAccessFile {
    public static void main(String[] args) {
        try {
            // Abrimos el fichero en modo lectura/escritura
            RandomAccessFile raf = new RandomAccessFile("datos.txt", "rw");

            // Leer la primera línea (para saltarla)
            String linea1 = raf.readLine();
            long puntero = raf.getFilePointer(); // Guardamos la posición actual (inicio de línea 2)

            // Escribir encima de la segunda línea
            raf.seek(puntero);
            raf.writeBytes("Linea 2 MODIFICADA\n");

            // Cerrar fichero
            raf.close();

            System.out.println("✅ Línea 2 modificada con éxito.");
        } catch (IOException e) {
            System.out.println("❌ Error al modificar el fichero: " + e.getMessage());
        }
    }
}
