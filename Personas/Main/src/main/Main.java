/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Hosanna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona("Alejandro", "Leiva", 16, "Masculino", "05 de diciembre de 2001", "Soltero", "Mecanico Industrial");
        Ingeniero ingeniero = new Ingeniero("Gerardo", "Leiva", 19, "Masculino", "25 de septiembre de 1999", "Soltero", "Ingeniero Civil", "Medio", "Construccion de edificio");
        Ing_Informatico infor = new Ing_Informatico("Edwin", "Hernández", 21, "Masculino", "25 de enero de 1999", "Casado", "Ingeniero Informático", "Alto", "Creacion de programas", "Crea proramas");
    
        persona.mostrarDatos("Datos de una persona" .toUpperCase());
        System.out.println("***************************************************************************");
        ingeniero.mostrarDatos("Datos de un ingeniero" .toUpperCase());
        System.out.println("***************************************************************************");
        infor.mostrarDatos("Datos de un ingeniero informatico" .toUpperCase());
        System.out.println("***************************************************************************");
    }
    
}
