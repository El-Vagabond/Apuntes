/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciciomatrices;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class EjercicicioMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicializamos el escaner
        Scanner escaner = new Scanner(System.in);

        //Inicializamos una matriz bidimensional a null para usarla posteriormente
        int[][] matriz = null;

        //Inicializamos una variable opciones para movernos por el switch
        int opciones = 0;

        do {
            menu();
            opciones = escaner.nextInt();
            try {

                switch (opciones) {

                    case 1:
                        System.out.println("Cuantas filas quieres en tu matriz");
                        int filas = escaner.nextInt();
                        System.out.println("Cuantas columnas quieres en tu matriz");
                        int columnas = escaner.nextInt();
                        //matriz = new int[filas][columnas];
                        matriz = generarMatriz(filas, columnas);
                        System.out.println(matriz.length);
                        if (matriz != null) {
                            System.out.println(" ");
                            System.out.println("La matriz se ha creado correctamente");
                            System.out.println(" ");
                        } else {
                            System.out.println(" ");
                            System.out.println("La matriz no se ha podido crear");
                            System.out.println(" ");
    }
                        break;
                    case 2:
                        rellenarMatriz(matriz);
                        break;

                    case 3:
                        System.out.println("La matriz se veria asi: ");

                        mostrarMatriz(matriz);
                        break;
                    case 4:
                        System.out.println("Indica que fila de la matriz quieres sumar");
                        int fila = escaner.nextInt();
                        System.out.println("La suma de los numero de la fila seleccionada es " + sumarfila(matriz, fila));
                        break;
                    case 5:
                        System.out.println("Indica que columna de la matriz quieres sumar");
                        int columna = escaner.nextInt();
                        System.out.println("La suma de los numero de la columna seleccionada es " + sumarcolumna(matriz, columna));
                        break;
                    case 6:
                        System.out.println("La suma de la diagonal  es " + sumarDiago(matriz));
                        break;

                    case 7:
                        System.out.println("La suma de la diagonal inversa  es " + sumarDiagoIn(matriz));
                        break;

                    case 8:
                        System.out.println("La media de la suma de todos los valores de la matriz es " + media(matriz));
                        break;

                }
            } catch (InputMismatchException ex) {
                System.out.println("Hay que elegir un numero correcto");

                escaner.nextLine(); //Limpiar Buffer para evitar bucle infinito
            } catch (NullPointerException ex) {
                System.out.println("Debe crearse el vector primero");

                escaner.nextLine(); //Limpiar Buffer para evitar bucle infinito
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Se debe inicialiar el vector");

                escaner.nextLine(); //Limpiar Buffer para evitar bucle infinito
            } catch (NegativeArraySizeException ex) {
                System.out.println("No se pueden poner numero negativos");

                escaner.nextLine(); //Limpiar Buffer para evitar bucle infinito
            }

        } while (opciones != 9);

    }
    //Creamos una clase para mostrar el menu

    public static void menu() {
        System.out.println("1.Generar el espacio de la Matriz");
        System.out.println("2.Rellenar la Matriz");
        System.out.println("3.MostrarMatriz");
        System.out.println("4.SumaFila");
        System.out.println("5.SumaColumna");
        System.out.println("6.SumaPrincipal");
        System.out.println("7.SumaInversa");
        System.out.println("8.Media de la suma de todos los valores de la matriz");
        System.out.println("9.Salir");
    }

    public static int[][] generarMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        return matriz;

    }

    public static void rellenarMatriz(int[][] matriz) {
        Random ran = new Random();
        if (matriz == null) {
            System.out.println("No se puede rellenar una matriz sin espacio");
        } else {

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {

                    matriz[i][j] = ran.nextInt(8, 100);
                }
            }

            System.out.println("Matriz rellenada correctamente");
        }

    }

    public static void mostrarMatriz(int[][] matriz) {

        if (matriz == null) {
            System.out.println("No se puede MOSTRAR una matriz Vacia");
        } else {

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {

                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
            }

        }

    }

    public static int sumarfila(int[][] matriz, int fila) {

        int suma = 0;

        if (fila > matriz.length - 1) {
            System.out.println("No puedes seleccionar una fila mayor que las que tiene la matriz");

        } else {
            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[fila][i];
            }
        }
        return suma;
    }

    public static int sumarcolumna(int[][] matriz, int columna) {
        int suma = 0;

        if (columna > matriz.length - 1) {
            System.out.println("No puedes seleccionar una fila mayor que las que tiene la matriz");

        } else {
            for (int i = 0; i < matriz[0].length; i++) {
                suma += matriz[i][columna];
            }
        }
        return suma;
    }

    public static int sumarDiago(int[][] matriz) {
        int suma = 0;

        int filas = matriz.length;

        for (int i = filas - 1; i >= 0; i--) {

            suma += matriz[i][i];

        }

        return suma;
    }

    public static int sumarDiagoIn(int[][] matriz) {
        int suma = 0;

        int filas = matriz.length;

        for (int i = 0; i < filas; i++) {

            suma += matriz[i][filas - 1 - i];

        }

        return suma;
    }

    public static int media(int[][] matriz) {
        int suma = 0;
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int dimen = filas * columnas;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
        }
        int media = suma / dimen;
        return media;
    }
 
}
