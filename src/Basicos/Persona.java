/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basicos;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Persona {
   private double id;
    private String nombre;
    private String email;
    private LocalDate fechaNacimiento;
    private String direccion;
    private Organizacion eps;

    public Persona() {
    }

    public Persona(double id, String nombre, String email, LocalDate fechaNacimiento, String direccion, Organizacion eps) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.eps = eps;
    }

    public double getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public Organizacion getEps() {
        return eps;
    }

    public void setId(double id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEps(Organizacion eps) {
        this.eps = eps;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", email=").append(email);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", direccion=").append(direccion);
        sb.append(", eps=").append(eps);
        sb.append('}');
        return sb.toString();
    }

    
        
}
