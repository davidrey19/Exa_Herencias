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
public class Ingeniero extends SuperClase{
    private String razonar;
    private String grupo;

    public Ingeniero(String nombre, String apellido, int edad, String sexo, String nacimiento, String situacion, String profesion, String razonar, String grupo) {
        super(nombre, apellido, edad, sexo, nacimiento, situacion, profesion);
        this.razonar = razonar;
        this.grupo = grupo;
    }

    public String getRazonar() {
        return razonar;
    }

    public void setRazonar(String razonar) {
        this.razonar = razonar;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    public void mostrarDatos(String metodo){
        super.mostrarDatos(metodo);
        System.out.println("Nivel de razonamiento: " + razonar);
        System.out.println("Desempeño trabajo en grupo: " + grupo);
        System.out.println();
    }
    
}
