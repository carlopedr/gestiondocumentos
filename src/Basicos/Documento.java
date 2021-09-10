/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basicos;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public abstract class Documento {
    protected int id; //Consecutivo
    protected Date fecha; //Fecha de registro

    public Documento(int id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public abstract void imprimir();

    @Override
    public String toString() {
        return "Documento{" + "id=" + id + ", fecha=" + fecha + '}';
    }
           
}
