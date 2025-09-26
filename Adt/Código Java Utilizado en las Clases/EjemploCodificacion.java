package pruebass;

import java.io.*;

public class EjemploCodificacion {
    public static void main(String[] args) {
        // Definimos los archivos y las codificaciones
        String archivoEntrada = "entrada_utf8.txt";
        String archivoSalida = "salida_iso8859.txt";
        String codificacionEntrada = "UTF-8";
        String codificacionSalida = "ISO-8859-1"; // Elegimos la codificación que queramos

        // Usamos try-with-resources para manejar los streams
        try {
            // Creamos los streams de entrada y salida con las codificaciones especificadas
            FileInputStream fis = new FileInputStream(archivoEntrada);
            InputStreamReader isr = new InputStreamReader(fis, codificacionEntrada);
            BufferedReader br = new BufferedReader(isr);

            // Escribir archivo en otra codificación (ej: ISO-8859-1)
            FileOutputStream fos = new FileOutputStream(archivoSalida);
            OutputStreamWriter osw = new OutputStreamWriter(fos, codificacionSalida);
            BufferedWriter bw = new BufferedWriter(osw);

            // Leer línea por línea desde el archivo de entrada y escribir en el de salida
            String linea;
            while ((linea = br.readLine()) != null) {
                //Indicamos lo que leemos en UTF-8
                System.out.println("Leyendo (UTF-8): " + linea);
                //Escribimos la línea en el nuevo archivo con la codificación deseada
                bw.write(linea);
                bw.newLine();
            }

            // Cerrar recursos
            br.close();
            bw.close();

            // Mensaje de confirmación
            System.out.println("Conversión completada: " + codificacionEntrada + " -> " + codificacionSalida);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
