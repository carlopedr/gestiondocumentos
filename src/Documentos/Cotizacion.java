/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;

import Basicos.Documento;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Cotizacion extends Documento{
    
    private int cantidad;
    private float descuento;

    public Cotizacion(int cantidad, float descuento, int id, Date fecha) {
        super(id, fecha);
        this.cantidad = cantidad;
        this.descuento = descuento;
        
        
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getDescuento() {
        return descuento;
    }

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    

    @Override
    public void imprimir() {
            System.out.println("Cotizacion");
            System.out.println(super.toString());
            System.out.println(toString());
        }

    @Override
    public String toString() {
        return "Cotizacion{" + "cantidad=" + cantidad + ", descuento=" + descuento + '}';
    }
}
