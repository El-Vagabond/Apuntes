/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trucomagico;

import interfaztruco.InterfazTruco;

/**
 *
 * @author Vagabond
 */
public class TrucoMagico implements InterfazTruco {

    private String nombreTruco;
    private int duracion;

    public TrucoMagico(String nombreTruco, int duracion) {
        this.nombreTruco = nombreTruco;
        this.duracion = duracion;
    }

    public String getNombreTruco() {
        return nombreTruco;
    }

    public void setNombreTruco(String nombreTruco) {
        this.nombreTruco = nombreTruco;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    

    @Override
    public String toString() {
        return "TrucoMagico{" + "nombreTruco=" + nombreTruco + ", duracion=" + duracion + '}';
    }

    @Override
    public int obtenerDificultadTruco() {
        int num;
        num = duracion / 2;
        return num;
    }

    @Override
    public void mostrarTruco() {
        System.out.println("El nombre del truco es " + nombreTruco + " y la duracion es " + duracion);

    }

}
