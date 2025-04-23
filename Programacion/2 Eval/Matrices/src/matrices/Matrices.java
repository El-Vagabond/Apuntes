/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ALUMNOS_FP
 */
public class Matrices {

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

        //Creamos una matriz de 4x4 para sumarla en un apartado
        int[][] matrizsuma = {{12, 12, 12, 12}, {14, 14, 14, 14}, {15, 15, 15, 15}, {16, 16, 16, 16}};
        do {
            menu();
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Que opciones quieres ejecutar?"));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "De que tamaño quieres la matriz?");

                    // System.out.println("De que tamaño quieres la matriz?");
                    // System.out.println("Cuantas filas quieres?");
                    //int filas = escaner.nextInt();
                    int filas;
                    filas = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas filas quieres?"));
                    //System.out.println("Cuantas columnas quieres?");
                    //int columnas = escaner.nextInt();
                    int columnas;
                    columnas = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas columnas quieres?"));
                    matriz = new int[filas][columnas];
                    if (generarMatriz(filas, columnas) != null) {
                        System.out.println("Matriz creada con exito");
                    } else {
                        System.out.println("La matriz no se pudo realizar");
                        System.out.println("Regresando...");
                        menu();
                    }
                    break;
                case 2:
                    rellenarMatriz(matriz);

                    break;
                case 3:

                    System.out.println("El matriz se veria asi:");
                    mostrarMatriz(matriz);
                    System.out.println("La matriz recorridas por columnas se veria asi");
                    mostrarMatrizColumnas(matriz);
                    break;

                case 4:

                    System.out.println("La suma de los numero de la matriz es:");
                    System.out.println(sumarMatriz(matriz));
                    break;

                case 5:
                    //Una matriz es simetrica Una matriz simétrica es una matriz cuadrada que verifica:
                    // A = At. Una matriz antisimétrica o hemisimétrica es una matriz cuadrada que verifica: A = -At.
                    System.out.println(matrizSimetrica(matriz));
                    break;

                case 6:
                    mostrarMatriz(matrizInvertida(matriz));
                    break;

                case 7:

                    mostrarMatriz(sumaMatrices(matriz, matrizsuma));
                case 8:
                    System.out.println("Saliendo...");
                    break;
            }

        } while (opcion != 8);

    }

    public static void menu() {
        System.out.println("------------------");
        System.out.println("1.Creamos MATRIZ");
        System.out.println("2.Rellenar una matriz con numeros aleatorios");
        System.out.println("3.Mostrar la Matriz");
        System.out.println("4.Suma  todos los numero de la matriz");
        System.out.println("5.Comprobar si la Matriz es Simetrica");
        System.out.println("6.Invertir la Matriz");
        System.out.println("7.Suma de Dos Matrices"); //HACER ESTE
        System.out.println("8.Salir");
    }

    public static int[][] generarMatriz(int fila, int columna) {
        int[][] matriz = new int[fila][columna];
        return matriz;
    }

    public static void rellenarMatriz(int[][] matriz) {

        //Comprobamos si la matriz esta o no nula
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            System.out.println("La matriz está vacía o es nula.");
            return;
        }
        Random random = new Random();

        // Rellenar la matriz con valores aleatorios
        System.out.println("Rellenando la matriz...");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10, 100);
            }
        }
    }

    public static void mostrarMatriz(int[][] lamati) {

        for (int i = 0; i < lamati.length; i++) {
            for (int j = 0; j < lamati[i].length; j++) {
                System.out.print(lamati[i][j] + "   ");
            }
            System.out.println();
        }

    }

    public static void mostrarMatrizColumnas(int[][] lamati) {
        int filas = lamati.length;

        int columnas = lamati[0].length;

        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(lamati[j][i] + "   ");
            }
            System.out.println();
        }
    }

    public static int sumarMatriz(int[][] lamati) {
        //Para sumar los valores dentro de una posicion de una matriz tenemos que crear variable sobre las filas y columnas para trabajar mejor

        int nfilas = lamati.length;

        //creamos variable para guardar la suma del numero en la posicion
        int suma = 0;

        for (int filas = 0; filas < nfilas; filas++) {
            //Creamos una variable dentro del bucle ya que queremos saber el numero de columnas , una vez estamos dentro de la matriz para trabajar con ellas
            int ncolumnas = lamati[filas].length;

            for (int columnas = 0; columnas < ncolumnas; columnas++) {
                suma += lamati[filas][columnas];
            }
        }
        return suma;
    }

    public static boolean matrizSimetrica(int[][] lamati) {
        //Creamos una variable que confirme si la variable se sigue manteniendo simetrica o  cambia en alguna fase
        boolean simetrica = true;
        //Para calcular las filas de una matriz miramos la logitus de la misma (miramos de cuantos arrays se compone)
        int filas = lamati.length;
        //Para calcular las columnas , una vez dentro del primer array de la matriz (la primera fila), calculariamos la longitus de ese array para ver sus columnas
        int columnas = lamati[0].length;
        if (filas == columnas) { //Si la matriz tiene el mismo numero de filas y de columnas  puede llegar a ser inversa
            //Creamos variables para las columnas y filas
            int i, j;
            i = 0;
            //Hacemos que la matriz recorras las filas mientras siga siendo  posible ser simetrica
            while (i < filas && simetrica == true) {
                //Una vez recorriendo las filas , queremos recorrer la posicion de los valores de la matriz en cada columna
                //Creamos una variable para que recorra las columnas
                j = 0;
                //creamos un bucle que mientras recorre las filas y columnas y siga pudiendo ser simetrica
                while (j < i && simetrica == true) {
                    //Dentro de este bucle comprobamos los valores de la matriz  con su matriz transpuesta, si estos son diferentes dejaria de ser simetrica y en caso contrario lo seria.
                    if (lamati[i][j] != lamati[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (simetrica == true) {
            }
        } else {//La matriz no tiene ni filas ni columnas iguales
            simetrica = false;
        }
        return simetrica;
    }

    public static int[][] matrizInvertida(int[][] lamati) {
        //Creamos una variable que guarde las filas y las columnas
        int filas = lamati.length;
        int columnas = lamati[0].length;
        //Creamos una variable para guardar la inversa de nuestra matriz
        int[][] inversa = new int[filas][columnas];
        //Creamos un puntero que vaya cambiando la posicion en la que estamos en la matriz  para ir guardando el nuevo valor
        int posicionfi = 0;
        //Creamos un bucle que recorra la matriz de manera inversa
        for (int i = filas - 1; i >= 0; i--) {
            //Creamos una variable para que vaya guardandno y actualziando la posicion de las columnas
            int posicionco = 0;

            for (int j = columnas - 1; j >= 0; j--) {
                inversa[posicionfi][posicionco] = lamati[i][j];
                posicionco++;
            }
            posicionfi++;
        }
        return inversa;
    }

    public static int[][] sumaMatrices(int[][] lamati, int[][] ivan) {
        //Creamos una variable para almacenar las filas y las columnas que tendria la matriz origen
        int filas = lamati.length;
        int columnas = lamati[0].length;
        //Creamos una matriz que guarde los valores de la suma de las otras matrices
        int[][] matriznueva = new int[filas][columnas];
        //Creamos un bucle para que saque los valores de la primera matriz y los separe para sumarlos
        //creamos una varibale para guardar la posicion de un numero
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int sumanum = lamati[i][j] + ivan[i][j];
                matriznueva[i][j] = sumanum;
            }
        }
        return matriznueva;
    }
}
