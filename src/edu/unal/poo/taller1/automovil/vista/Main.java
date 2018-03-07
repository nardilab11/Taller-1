/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.taller1.automovil.vista;

import edu.unal.poo.taller1.automovil.modelo.Carro;
import edu.unal.poo.taller1.automovil.modelo.Motor;
import edu.unal.poo.taller1.automovil.modelo.Chasis;
import edu.unal.poo.taller1.automovil.modelo.Rueda;
import edu.unal.poo.taller1.automovil.modelo.Persona;
/**
 *
 * @author Nicolás
 */
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Nicolas","Ardila");
        Carro carro1 = new Carro();
        Chasis chasis1 = new Chasis("Acero");
        Motor motor1 = new Motor("24A",2);
        Rueda rueda1 = new Rueda("Goodyear","Rin",3);
        Rueda rueda2 = new Rueda("Goodyear","Rin",3);
        Rueda rueda3 = new Rueda("Goodyear","Rin",3);
        Rueda rueda4 = new Rueda("Goodyear","Rin",3);
        carro1.setChasis(chasis1);
        carro1.setMotor(motor1);
        carro1.addRueda(rueda1);
        carro1.addRueda(rueda2);
        carro1.addRueda(rueda3);
        carro1.addRueda(rueda4);
        persona1.addCarro(carro1);
        Carro carro2 = new Carro();
        Chasis chasis2 = new Chasis("Titanio");
        Motor motor2 = new Motor("12B",3);
        Rueda rueda5 = new Rueda("Goodyear","Rin",4);
        Rueda rueda6 = new Rueda("Goodyear","Rin",4);
        Rueda rueda7 = new Rueda("Goodyear","Rin",4);
        Rueda rueda8 = new Rueda("Goodyear","Rin",4);
        carro2.setChasis(chasis2);
        carro2.setMotor(motor2);
        carro2.addRueda(rueda5);
        carro2.addRueda(rueda6);
        carro2.addRueda(rueda7);
        carro2.addRueda(rueda8);
        persona1.addCarro(carro2);
        persona1.getCarros();
    }
}
