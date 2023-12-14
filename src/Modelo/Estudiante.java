/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author henry
 */
public class Estudiante {
    private String cedula, nombre, apellido, direccion, telefono;

    public Estudiante(String nombre, String cedula, String apellido, String direccion, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Estudiante() {
    }
    
    

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return this.telefono;
    }

    public void setCelular(String celular) {
        this.telefono = celular;
    }

    public Estudiante(String cedula) {
        this.cedula = cedula;
    } 
}
