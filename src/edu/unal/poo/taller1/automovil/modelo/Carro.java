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
public class Carro {
    private Rueda[] ruedas;
    private Chasis chasis;
    private Motor motor;

    public Carro() {
        this.ruedas = new Rueda[4];
        this.chasis = chasis;
        this.motor = motor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public boolean addRueda(Rueda rueda){
        boolean resultado = false;
        for(int i = 0; i < 4; i++){
            if(ruedas[i]==null){
                ruedas[i]=rueda;
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
    public boolean removeRueda(Rueda rueda){
        boolean resultado = false;
        for(int i = 0; i < 4; i++){
            if(ruedas[i]==rueda){
                ruedas[i]=null;
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    public boolean replaceRueda(Rueda rueda, Rueda nueva){
        boolean resultado = false;
        for(int i = 0; i < 4; i++){
            if(ruedas[i]==rueda){
                ruedas[i]=nueva;
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
