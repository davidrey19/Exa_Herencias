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
public class Persona extends SuperClase{

    public Persona(String nombre, String apellido, int edad, String sexo, String nacimiento, String situacion, String profesion) {
        super(nombre, apellido, edad, sexo, nacimiento, situacion, profesion);
    }
    
    
    @Override
    public void mostrarDatos(String metodo){
        super.mostrarDatos(metodo);
        System.out.println();
    }
}
