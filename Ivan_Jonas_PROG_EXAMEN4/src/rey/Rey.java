/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rey;

import caballero.Caballero;

/**
 *
 * @author ALUMNOS_FP
 */
public class Rey {

    //Atributos del Rey
    String nombre;
    String apodo;
    int numeroCastillos;

    //Creamos los constructores y los metodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getNumeroCastillos() {
        return numeroCastillos;
    }

    public void setNumeroCastillos(int numeroCastillos) {
        this.numeroCastillos = numeroCastillos;
    }

    //Creamos el constructor
    public Rey(String nombre, String apodo, int numeroCastillos) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.numeroCastillos = numeroCastillos;
    }

    //Creamos el metodo honrarCaballero
    public void honrarCaballero(Caballero caballero) {

        if (numeroCastillos > 0) {
            caballero.setTieneCastillo(true);
            numeroCastillos--;
        } else {
            System.out.println("El rey no tiene mas castillos para dar");
        }

    }

}
