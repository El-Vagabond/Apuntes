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
        if (archivos != null) {
            for (File f : archivos) {
                String tipo = f.isDirectory() ? "[DIR]" : "[FILE]";
                System.out.println(tipo + " " + f.getName());
            }
        }

        // Ejemplo de construcción de ruta portable compatible con otros SO
        String nuevaRuta = "miCarpeta" 
                + File.separator + "subcarpeta" 
                + File.separator + "archivo.txt";

        System.out.println("Ruta construida de forma portable: " + nuevaRuta);
    }
}
