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
public class Organizacion {

    private int id;
    private String nombre;
    private Persona repLegal;
    private String direccion;
    private String email;
    private LocalDate fechaCreacion;
    private String tipo;

    public Organizacion() {
    } 

    public Organizacion(int id, String nombre, Persona repLegal, String direccion, String email, LocalDate fechaCreacion, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.repLegal = repLegal;
        this.direccion = direccion;
        this.email = email;
        this.fechaCreacion = fechaCreacion;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona getRepLegal() {
        return repLegal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRepLegal(Persona repLegal) {
        this.repLegal = repLegal;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Organizacion{id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", repLegal=").append(repLegal);
        sb.append(", direccion=").append(direccion);
        sb.append(", email=").append(email);
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
    
}
