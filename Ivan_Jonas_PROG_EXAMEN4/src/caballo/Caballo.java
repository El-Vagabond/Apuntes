/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caballo;

/**
 *
 * @author ALUMNOS_FP
 */
public class Caballo {
    
    //Creamos el numerador para el origen del caballo

    public static enum ORIGEN {
        europeo,
        pirineos,
        salvaje,
        astur,
        marciano;

    }
    
    //Creamos los atributos del caballo
    
    String color;
    int edad;
    ORIGEN origen;
    boolean isYegua;
    
    
    //Creamos los Constructores y getter y setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ORIGEN getOrigen() {
        return origen;
    }

    public void setOrigen(ORIGEN origen) {
        this.origen = origen;
    }

    public boolean isIsYegua() {
        return isYegua;
    }

    public void setIsYegua(boolean isYegua) {
        this.isYegua = isYegua;
    }
    
    //Constructores

    public Caballo(String color, int edad, ORIGEN origen, boolean isYegua) {
        this.color = color;
        this.edad = edad;
        this.origen = origen;
        this.isYegua = isYegua;
    }
    
     public Caballo(String color, ORIGEN origen, boolean isYegua) {
        this.color = color;
        this.edad = 1;
        this.origen = origen;
        this.isYegua = isYegua;
    }
    
    
}
