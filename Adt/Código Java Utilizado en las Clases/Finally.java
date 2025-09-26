package ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class Finally {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("ejemplo.txt");
            writer.write("Hola mundo");
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero.");
        } finally {
            try {
                if (writer != null) {
                    writer.close(); // Liberación del recurso
                    System.out.println("Fichero cerrado.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
