/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bufon;

/**
 *
 * @author ALUMNOS_FP
 */
public class Bufon {
    //Creamos el numerador para habilidades del bufon

    public static enum HABILIDAD {
        malabares,
        acrobacia,
        uquelele,
        comedia,
        historias;

    }

    //Creamos los atributos del bufon
    String chistefavorito;
    String idioma;
    HABILIDAD habilidad;

    //Creamos los Constructores y getter y setter 
    public String getChistefavorito() {
        return chistefavorito;
    }

    public void setChistefavorito(String chistefavorito) {
        this.chistefavorito = chistefavorito;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public HABILIDAD getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(HABILIDAD habilidad) {
        this.habilidad = habilidad;
    }

    //Constructores
    public Bufon(String chistefavorito, String idioma, HABILIDAD habilidad) {
        this.chistefavorito = chistefavorito;
        this.idioma = idioma;
        this.habilidad = habilidad;
    }

    //Constructos con la habilidad de malabares por defecto
    public Bufon(String chistefavorito, String idioma) {
        this.chistefavorito = chistefavorito;
        this.idioma = idioma;
        this.habilidad = HABILIDAD.malabares;
    }

    //Creamos los metodos que usara el bufon
    public String contarChiste(String chiste) {
        return "JAJAJA que gracioso mi vasallo";
    }

    public String contarChiste() {
        String chistaco = this.chistefavorito;
        return chistaco;

    }

    //Metodo Entretener
    public static entretener() {
        switch{ case1: malavares
            
        }
                
             
      
    }
}
