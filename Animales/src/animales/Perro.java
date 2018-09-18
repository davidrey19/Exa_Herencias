/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author Hosanna
 */
public class Perro extends Animales{

    public Perro(String nombre, String alimentacion, int edad, String raza) {
        super(nombre, alimentacion, edad, raza);
    }
    
    @Override
    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de Alimentacion: " + alimentacion);
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + raza);
        
    }
}
