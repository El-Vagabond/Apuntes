/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioficheros;

import lector.Lector;
import lector.LectorScanner;

/**
 *
 * @author diego
 */
public class EjercicioFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filename = "fichero.txt";
        
        /*int nPalabras = Lector.contarPalabras(filename);
        System.out.println("El numero de palabras del fichero " + filename + " es "+
                nPalabras);
        */
        
        //LectorScanner.leer(filename);
        LectorScanner.leerConDelimitador(filename);
    }
    
}
