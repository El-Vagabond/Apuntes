/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxeador;

import java.util.ArrayList;
import peleas.Peleas;

/**
 *
 * @author ALUMNOS_FP
 */
public class Boxeador {

    public static enum Categoria {
        pesado,
        medio,
        welter,
        ligero,
        pluma,
        mosca

    }
    
        //Pasamos La categoria por enum , y un arraylist de todo de peleas
    Categoria categoria;
    int edad;
    int altura;
    ArrayList<Peleas> pelea;

    public Boxeador(Categoria categoria, int edad, int altura, ArrayList<Peleas> pelea) {
        this.categoria = categoria;
        this.edad = edad;
        this.altura = altura;
        this.pelea = pelea;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public ArrayList<Peleas> getPelea() {
        return pelea;
    }

    public void setPelea(ArrayList<Peleas> pelea) {
        this.pelea = pelea;
    }

    @Override
    public String toString() {
        return "Boxeador{" + "categoria=" + categoria + ", edad=" + edad + ", altura=" + altura + ", pelea=" + pelea + '}';
    }

}
