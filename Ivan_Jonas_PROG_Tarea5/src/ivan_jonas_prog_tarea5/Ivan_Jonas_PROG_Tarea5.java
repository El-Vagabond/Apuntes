/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ivan_jonas_prog_tarea5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import lista.Lista;
import matrices.Matrices;

/**
 *
 * @author Vagabond
 */
public class Ivan_Jonas_PROG_Tarea5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos las Matrices sobre las que trabajaremos
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];

        // Creamos el hashmap que usaremos y el Arraylist
        //  HashMap<Integer, Persona> mapaivan = new HashMap<>();
        ArrayList<String> lista = new ArrayList<String>();
        //Creamos la Persona 
        // Persona ivan = new Persona("Ivan", 25);

        //Inicializamos el Scanner
        Scanner escaner = new Scanner(System.in);

        //Creamos un Switch para trabajar cobre el metodo del menu
        //Creamos la variable para manejarnos por el switch
        int opciones = 0;

        do {
            menu();
            opciones = escaner.nextInt();
            try {
                switch (opciones) {
                    case 1:
                        Matrices.rellenarMatriz(matriz1, matriz2);

                        break;
                    case 2:
                        System.out.println(Matrices.compararMatriz(matriz1, matriz2));

                        break;
                    case 3:
                        Matrices.frecuenciaMatriz(matriz1, matriz2);

                        break;

                    case 4:
                        Matrices.mostrarMatriz(matriz1, matriz2);

                        break;
                    case 5:
                        Lista.rellenarLista(lista);

                        break;

                    default:
                        System.out.println("La opcion no ha sido valida, seleccione otro numero");
                        ;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Hay que elegir un numero correcto");

                escaner.nextLine(); //Limpiar Buffer para evitar bucle infinito
            } catch (NullPointerException ex) {
                System.out.println("No puedes pasarte de indice");

                escaner.nextLine(); //Limpiar Buffer para evitar bucle infinito
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Hay que inicializarlo");

                escaner.nextLine(); //Limpiar Buffer para evitar bucle infinito
            } catch (NegativeArraySizeException ex) {
                System.out.println("No se pueden poner numero negativos");

                escaner.nextLine(); //Limpiar Buffer para evitar bucle infinito
            }

        } while (opciones != 13);

    }

    public static void menu() {
        System.out.println("Matrices: ");
        System.out.println("1. Generar matrices aleatorias");
        System.out.println("2. Comprobar matrices iguales");
        System.out.println("3. Frecuencia de número");
        System.out.println("4. Mostrar matrices");
        System.out.println("Listas: ");
        System.out.println("5. Rellenar lista");
        System.out.println("6. Ordenar lista");
        System.out.println("7. Mostrar palabra más larga");
        System.out.println("8. Comprobar expresión regular");
        System.out.println("9. Mostrar lista");
        System.out.println("Mapas: ");
        System.out.println("10. Añadir elemento a mapa");
        System.out.println("11. Vaciar mapa");
        System.out.println("12. Mostrar mapa");
        System.out.println("13. Salir");
    }

}
