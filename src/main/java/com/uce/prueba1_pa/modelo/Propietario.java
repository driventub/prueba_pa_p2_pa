package com.uce.prueba1_pa.modelo;

import java.time.LocalDateTime;

public class Propietario {
    private String nombre;
    private String apellido;
    private String cedula;
    private LocalDateTime fechaNacimiento;

    // Set y Get
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
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    @Override
    public String toString() {
        return "Propietario [apellido=" + apellido + ", cedula=" + cedula + ", fechaNacimiento=" + fechaNacimiento
                + ", nombre=" + nombre + "]";
    }

        
}
