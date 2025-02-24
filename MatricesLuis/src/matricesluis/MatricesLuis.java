/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matricesluis;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUMNOS_FP
 */
public class MatricesLuis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Inicializamos el Escaner
        Scanner escaner = new Scanner(System.in);
        //Inicializamos las opciones del swtich
        int opcion = 0;
        Random random = new Random();
        //Creamos un vector null para trabajar sobre el
        int[][] matriz = null;
        
        do {
            menu();
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Que opciones quieres ejecutar?"));

            switch (opcion) {
                case 1:

                case 2:

                case 3:
                    
                case 4:

            }

        } while (opcion != 4);

    }

    public static void menu() {
        System.out.println("------------------");
        System.out.println("1.Generar MATRIZ");
        System.out.println("2.Creamos una matriz con numeros aleatorios");
        System.out.println("3.Mostrar la Matriz");
        System.out.println("4.Salir");
    }

}
