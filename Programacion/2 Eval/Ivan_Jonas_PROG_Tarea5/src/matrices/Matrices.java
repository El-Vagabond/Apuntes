/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vagabond
 */
public class Matrices {

    public static void mostrarMatriz(int[][] matriz1, int[][] matriz2) {
        if (matriz1 == null && matriz2 == null) {
            System.out.println("No se puede MOSTRAR una matriz Vacia");
        } else {
            System.out.println("Primera Matriz");
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[0].length; j++) {

                    System.out.print(matriz1[i][j] + " ");
                }
                System.out.println("");
            }

            System.out.println("Segunda Matriz");
            for (int i = 0; i < matriz2.length; i++) {
                for (int j = 0; j < matriz2[0].length; j++) {

                    System.out.print(matriz2[i][j] + " ");
                }
                System.out.println("");
            }

        }

    }

    public static void rellenarMatriz(int[][] matriz1, int[][] matriz2) {
        Random ram = new Random();

        if (matriz1 == null && matriz2 == null) {
            System.out.println("No puedo rellenar una matriz sino tiene definido el espacio");
        } else {
            //Uso la Matriz1 porque se que ambos tienen la misma dimension
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    matriz1[i][j] = ram.nextInt(10, 99);
                    matriz2[i][j] = ram.nextInt(10, 99);
                }
            }
            System.out.println("La matriz ha sido rellenada exitosamente");
        }

    }

    public static boolean compararMatriz(int[][] matriz1, int[][] matriz2) {

        //Creo un boolean para mirar si todos los valores son iguales
        boolean iguales = true;

        if (matriz1 == null && matriz2 == null) {
            System.out.println("No pueden estar las matrices nulas");
        } else {
            //Uso la Matriz1 porque se que ambos tienen la misma dimension sino comprobaria si tienen la misma dimension guardando las filas y columnas de cada uno y comparandolas con un if.
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    if (matriz1[i][j] != matriz2[i][j]) {
                        iguales = false;

                    }
                }
                iguales=true;
            }
        }
        return iguales;
    }
            

        

    

    public static void frecuenciaMatriz(int[][] matriz1, int[][] matriz2) {
        if (matriz1 == null && matriz2 == null) {
            System.out.println("No pueden estar las matrices nulas");
        } else {
            //Inicializamos la variable que contara cuantas veces tiene el numero y otra para guardar el numero preguntado
            int num = 0;
            int recuento1 = 0;
            int recuento2 = 0;
            //Inicializamos el escaner

            Scanner escaner = new Scanner(System.in);

            System.out.println("Introduce el numero a comparar la frecuencia");
            num = escaner.nextInt();

            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    if (matriz1[i][j] == num) {
                        recuento1++;
                    }
                }
            }

            for (int i = 0; i < matriz2.length; i++) {
                for (int p = 0; p < matriz2[0].length; p++) {
                    if (matriz2[i][p] == num) {
                        recuento2++;
                    }
                }
            }

            System.out.println("El numero se ha repetido " + recuento1 + " en la primera matriz y " + recuento2 + " en la segunda matriz");
        }
    }
}
