/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.taller1.automovil.modelo;

/**
 *
 * @author Nicolás
 */
public class Motor {
    private String numeroSerie;
    private int cilindros;

    public Motor(String numeroSerie, int cilindros) {
        this.numeroSerie = numeroSerie;
        this.cilindros = cilindros;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
}
