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
public class Persona {
    private String nombre;
    private String apellido;
    private Carro carros[];

    public Persona(String nombre, String apellido) {
        this.carros = new Carro[2];
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Carro[] getCarros() {
        return carros;
    }

    public boolean addCarro(Carro carro){
        boolean resultado = false;
        for(int i = 0; i < 5; i++){
            if(carros[i]==null){
                carros[i]=carro;
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
    public boolean removeCarro(Carro carro){
        boolean resultado = false;
        for(int i = 0; i < 4; i++){
            if(carros[i]==carro){
                carros[i]=null;
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    public boolean replaceCarro(Carro carro, Carro nuevo){
        boolean resultado = false;
        for(int i = 0; i < 4; i++){
            if(carros[i]==carro){
                carros[i]=nuevo;
                resultado = true;
                break;
            }
        }
        return resultado;
    }
}
