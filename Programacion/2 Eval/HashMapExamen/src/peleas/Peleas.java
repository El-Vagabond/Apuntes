/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peleas;

import boxeador.Boxeador;

/**
 *
 * @author ALUMNOS_FP
 */
public class Peleas {

    Boxeador ganador;
    int assaltos;
    Boxeador contrincante1;
    Boxeador contrincante2;
    boolean ko;

    public Boxeador getGanador() {
        return ganador;
    }

    public void setGanador(Boxeador ganador) {
        this.ganador = ganador;
    }

    public int getAssaltos() {
        return assaltos;
    }

    public void setAssaltos(int assaltos) {
        this.assaltos = assaltos;
    }

    public Boxeador getContrincante1() {
        return contrincante1;
    }

    public void setContrincante1(Boxeador contrincante1) {
        this.contrincante1 = contrincante1;
    }

    public Boxeador getContrincante2() {
        return contrincante2;
    }

    public void setContrincante2(Boxeador contrincante2) {
        this.contrincante2 = contrincante2;
    }

    public boolean isKo() {
        return ko;
    }

    public void setKo(boolean ko) {
        this.ko = ko;
    }

    public Peleas(Boxeador ganador, int assaltos, Boxeador contrincante1, Boxeador contrincante2, boolean ko) {
        this.ganador = ganador;
        this.assaltos = assaltos;
        this.contrincante1 = contrincante1;
        this.contrincante2 = contrincante2;
        this.ko = ko;
    }

    @Override
    public String toString() {
        return "Peleas{assaltos=" + assaltos  + ", ko=" + ko + '}';
    }

}
