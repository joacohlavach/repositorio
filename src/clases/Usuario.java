/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Galle
 */
public class Usuario {
    String nombre;
    int telefono, edad;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Usuario(String nombre, int telefono, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }
    
    
}
