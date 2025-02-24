/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caballero;

import caballo.Caballo;
import rey.Rey;

/**
 *
 * @author ALUMNOS_FP
 */
public class Caballero {

    //Creamos los atributos del caballeros
    String nombre;
    //Atributo que es un objeto de la clase caballo
    Caballo caballo;
    boolean tieneCastillo;

    //Creamos los Constructores y getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Caballo getCaballo() {
        return caballo;
    }

    public void setCaballo(Caballo caballo) {
        this.caballo = caballo;
    }

    public boolean isTieneCastillo() {
        return tieneCastillo;
    }

    public void setTieneCastillo(boolean tieneCastillo) {
        this.tieneCastillo = tieneCastillo;
    }

    //Constructos con tieneCastillo en falso
    public Caballero(String nombre, Caballo caballo) {
        this.nombre = nombre;
        this.caballo = caballo;
        this.tieneCastillo = false;
    }

    //Creamos los metodos
    //Metodo atacar caballero
    public String atacarCaballero(Caballero caballero) {
        this.caballo = null;
        String mensaje = "Han matado al caballo";
        return mensaje;
    }

    //Metodo defenderRey
    public void defenderRey(Rey rey) {

        if (this.caballo != null) {
            rey.honrarCaballero(this);
            System.out.println("Manin yo te salvo");
        } else {
            System.out.println("No tengo caballo para ayudarte, mi Lord");
           
        }
    }
}
