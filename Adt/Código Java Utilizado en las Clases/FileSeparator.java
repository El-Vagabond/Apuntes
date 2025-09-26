package ficheros;

import java.io.File;

public class FileSeparator {
    public static void main(String[] args) {
        // Usamos el directorio actual
        String ruta = System.getProperty("user.dir");
        File directorio = new File(ruta);
        // Así se vería mi directorio actual de windows (C:\Users, etc)
        System.out.println("Listado de: " + directorio.getAbsolutePath());

        // Listar ficheros y subdirectorios
        File[] archivos = directorio.listFiles();
        // Comprobamos que no sea null para evitar NullPointerException
        if (archivos != null) {
            // Recorremos e imprimimos cada archivo o directorio
            for (File f : archivos) {
                // Indicamos si es archivo o directorio
                String tipo = f.isDirectory() ? "[DIR]" : "[FILE]";
                // Mostramos el tipo y el nombre
                System.out.println(tipo + " " + f.getName());
            }
        }

        // Ejemplo de construcción de ruta portable compatible con otros SO
        String nuevaRuta = "miCarpeta"
                // Usamos File.separator para compatibilidad entre SO
                + File.separator + "subcarpeta"
                // Continuamos con la ruta
                + File.separator + "archivo.txt";
        // Mostramos la ruta construida
        System.out.println("Ruta construida de forma portable: " + nuevaRuta);
    }
}
