/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecionesparaexamen;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class ColecionesParaExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* //crear arrayList
        ArrayList<Integer> lista= new ArrayList<Integer>();
       // ArrayList<Integer> lista2 = new ArrayList<>();
        //Añadir elemento
        lista.add(57);
        lista.add(20);
        //Se pueden añadir varios elementos a la vez
        lista.addAll(Arrays.asList(2,6,8));
        //Eliminar elemento, se introduce la posicion que quieras eliminar
        lista.remove(0);
        //Obtener el numero de elementos de la coleccion
        lista.size();
        //Comprobar si la coleccion esta vacia, si esta vacia devolveria true,si tiene datos devuelve false
        lista.isEmpty();
        //Eliminar todos los elementos de la lista
        lista.clear();
        //Comprobar si contiene un elemento
        lista.contains(10);
        //Devuelve el elemento 
        lista.get(0);
        //Modificar el elemento de una posicion por otro elemento 
        lista.set(0,10);*/

        Scanner escaner = new Scanner(System.in);
        //TRABAJANDO CON ARRAYLIST
        ArrayList<String> nombres = new ArrayList<>();
        int opciones = 0;

        do {
            menu();
            opciones = escaner.nextInt();

            //Si justo despues de leer un INT leemos una linea o un String , tenemos que limpiar el buffer para que no haya problemas
            // escaner.nextLine(); Antes de cada nueva asignacion de Elementos.
            switch (opciones) {
                case 1:
                    añadirElementos(nombres);
                    break;
                case 2:
                    eliminarElemento(nombres);
                    break;
                case 3:
                    comprobarElemento(nombres);
                    break;
                case 4:
                    recorrerArray(nombres);
                    break;
                case 5:
                    duplicadosArray(nombres);
                    break;
                case 6:
                    System.out.println(nombres.reversed());
                    break;
                case 7:
                    remplazoArray(nombres);
                    break;
                case 8:
                    intercambioArray(nombres);
                    break;
                case 9:
                    System.out.println("Saliendo....");
                    break;

            }

        } while (opciones != 9);

    }

    public static void menu() {
        System.out.println("_____________");
        System.out.println("1.Meter elementos al ArrayList");
        System.out.println("2.Eliminar elemento si existe");
        System.out.println("3.Comprombamos  si el elemento esta en la lista");
        System.out.println("4.Mostramos el array");
        System.out.println("5.Comprobar si hay duplicados"); //HACERLO
        System.out.println("6.Invertir orden lista");
        System.out.println("7.Reemplazo de un elemento");
        System.out.println("8.Intercambio de elementos");
        System.out.println("9.Salir");
    }

    public static void añadirElementos(ArrayList<String> lista) {
        Scanner escaner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Que palabra nombre quieres añadir a la lista");
            String nombre = escaner.nextLine();
            if (lista.contains(nombre)) {
                System.out.println("El elemento ya esta introducido");
            } else {
                lista.add(nombre);
            }
        }
    }

    public static void recorrerArray(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public static void recorrerArrayForeach(ArrayList<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void eliminarElemento(ArrayList<String> lista) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Los elementos de la lista son: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("Que elemento de la lista quieres eleminar");
        String nombre = escaner.nextLine();
        if (lista.remove(nombre)) {
            System.out.println("El elemento ha sido eliminado correcamente");
        } else {
            System.out.println("El elemento no se encuentra en esta lista");
        }

    }

    public static void comprobarElemento(ArrayList<String> lista) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Que elemento de la lista quieres comprobar si esta en la lista");
        String nombre = escaner.nextLine();
        if (lista.contains(nombre)) {
            System.out.println("El elemento se encuentra en la lista");
        } else {
            System.out.println("El elemento no se encuentra en la lista");
        }

    }

    public static void duplicadosArray(ArrayList<String> lista) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Que elemento quieres añadir a la lista");
        String nombre = escaner.nextLine();
        if (lista.contains(nombre)) {
            System.out.println("El elemento ya esta en la lista");
        } else {
            lista.add(nombre);
        }
    }

    public static void invertirArray(ArrayList<String> lista) {

        //Metodo para mostrarla inversa con bucle
        /*
        for (int i lista.size(); i>=0; i--) {
            System.out.println(lista.get(i));
        }
         */
        //Metodo ArrayList
        lista.reversed();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public static void remplazoArray(ArrayList<String> lista) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Que posicions del arraylist quieres remplazar?");
        int posi = escaner.nextInt();
        escaner.nextLine();
        System.out.println("Que nombre quieres poner en su lugar");
        String nombre = escaner.nextLine();
        lista.set(posi, nombre);
    }

    public static void intercambioArray(ArrayList<String> lista) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Que nombre del arraylist quieres remplazar?");
        String nombre1 = escaner.nextLine();
        String temp = nombre1;
        System.out.println("Porque nombre quieres intercambiarlo");
        String nombre2 = escaner.nextLine();

        int posi = lista.indexOf(nombre1);
        int posi2 = lista.indexOf(nombre2);
        lista.set(posi, nombre2);
        lista.set(posi2, temp);

    }
}
