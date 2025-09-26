package pruebass;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class LeerLineas {
    public static void main(String[] args) {
        String archivoTexto = "datos.txt"; // tu archivo ya existente

        try {
            // -------------------------
            // 1. Reader (caracter a caracter)
            // -------------------------
            try (Reader reader = new InputStreamReader(
                    new FileInputStream(archivoTexto), StandardCharsets.UTF_8)) {
                int c;
                System.out.println("1) Lectura con Reader (char a char):");
                while ((c = reader.read()) != -1) {
                    System.out.print((char) c);
                }
                System.out.println("\n--- Fin Reader ---\n");
            }

            // -------------------------
            // 2. BufferedReader (línea a línea)
            // -------------------------
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream(archivoTexto), StandardCharsets.UTF_8))) {
                String linea;
                int contador = 1;
                System.out.println("2) Lectura con BufferedReader (línea a línea):");
                while ((linea = br.readLine()) != null) {
                    System.out.println("  Línea " + contador + ": " + linea);
                    contador++;
                }
                System.out.println("--- Fin BufferedReader ---\n");
            }

            // -------------------------
            // 3. InputStream (byte a byte)
            // -------------------------
            try (InputStream in = new FileInputStream(archivoTexto)) {
                int b;
                System.out.println("3) Lectura con InputStream (byte a byte, ASCII/UTF-8):");
                while ((b = in.read()) != -1) {
                    System.out.print((char) b);
                }
                System.out.println("\n--- Fin InputStream ---\n");
            }

            // -------------------------
            // 4. BufferedInputStream (bloques de bytes)
            // -------------------------
            try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream(archivoTexto))) {
                byte[] buffer = new byte[32]; // lee en bloques de 32 bytes
                int leidos;
                System.out.println("4) Lectura con BufferedInputStream (bloques de bytes):");
                while ((leidos = bin.read(buffer)) != -1) {
                    String chunk = new String(buffer, 0, leidos, StandardCharsets.UTF_8);
                    System.out.print(chunk);
                }
                System.out.println("\n--- Fin BufferedInputStream ---\n");
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
