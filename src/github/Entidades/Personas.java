/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github.Entidades;

/**
 *
 * @author anico
 */
public class Personas {
    
    private String Nombre;
    private String Apellido;
    private int Edad;

    public Personas() {
    }

    public Personas(String Nombre, String Apellido, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Personas{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Edad=" + Edad + '}';
    }
    
    
}
