package pruebass;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class LeerLineas {
    public static void main(String[] args) {

        // Archivo de texto a leer (debe existir)
        String archivoTexto = "datos.txt"; // tu archivo ya existente
        // Usamos diferentes métodos para leer el archivo
        try {
            // -------------------------
            // 1. Reader (caracter a caracter)
            // -------------------------
            try (Reader reader = new InputStreamReader(
                    // Usamos FileInputStream para leer bytes y convertimos a caracteres con
                    // InputStreamReader
                    new FileInputStream(archivoTexto), StandardCharsets.UTF_8)) {
                // Leemos carácter a carácter
                int c;
                // Mostramos un mensaje indicando el método usado
                System.out.println("1) Lectura con Reader (char a char):");
                // Mientras haya caracteres los leemos e imprimimos
                while ((c = reader.read()) != -1) {
                    // Imprimimos cada carácter leído
                    System.out.print((char) c);
                }
                // Indicamos el fin de la lectura
                System.out.println("\n--- Fin Reader ---\n");
            }

            // -------------------------
            // 2. BufferedReader (línea a línea)
            // -------------------------
            try (BufferedReader br = new BufferedReader(
                    // Usamos FileInputStream + InputStreamReader para manejar la codificación
                    new InputStreamReader(new FileInputStream(archivoTexto), StandardCharsets.UTF_8))) {
                // Leemos línea a línea
                String linea;
                // Creamos un contador para numerar las líneas
                int contador = 1;
                // Mostramos un mensaje indicando el método usado
                System.out.println("2) Lectura con BufferedReader (línea a línea):");
                // Creamos un bucle para leer cada línea hasta el final del archivo
                while ((linea = br.readLine()) != null) {
                    // Imprimimos la línea con su número
                    System.out.println("  Línea " + contador + ": " + linea);
                    // Incrementamos el contador
                    contador++;
                }
                System.out.println("--- Fin BufferedReader ---\n");
            }

            // -------------------------
            // 3. InputStream (byte a byte)
            // -------------------------
            try
            // Usamos FileInputStream para leer bytes del archivo
            (InputStream in = new FileInputStream(archivoTexto)) {
                // Leemos byte a byte (ASCII/UTF-8)
                int b;
                // Mostramos un mensaje indicando el método usado
                System.out.println("3) Lectura con InputStream (byte a byte, ASCII/UTF-8):");
                // Mientras haya bytes los leemos e imprimimos
                while ((b = in.read()) != -1) {
                    // Imprimimos cada byte leído como carácter
                    System.out.print((char) b);
                }
                // Indicamos el fin de la lectura
                System.out.println("\n--- Fin InputStream ---\n");
            }

            // -------------------------
            // 4. BufferedInputStream (bloques de bytes)
            // -------------------------
            // Usamos BufferedInputStream para leer en bloques de bytes
            try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream(archivoTexto))) {
                // Buffer para almacenar bytes leídos
                byte[] buffer = new byte[32]; // lee en bloques de 32 bytes
                // Variable para contar bytes leídos
                int leidos;
                // Mostramos un mensaje indicando el método usado
                System.out.println("4) Lectura con BufferedInputStream (bloques de bytes):");
                // Leemos bloques de bytes hasta el final del archivo
                while ((leidos = bin.read(buffer)) != -1) {
                    // Convertimos los bytes leídos a String usando UTF-8
                    String chunk = new String(buffer, 0, leidos, StandardCharsets.UTF_8);
                    // Imprimimos el bloque leído
                    System.out.print(chunk);
                }
                System.out.println("\n--- Fin BufferedInputStream ---\n");
            }

        }
        // Capturamos errores de E/S
        catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
