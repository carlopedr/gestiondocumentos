/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;

import Basicos.Documento;
import Basicos.Persona;
import Basicos.Producto;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Factura extends Documento{
    
    protected Persona cliente;
    protected Producto producto;
    protected int cantidad;

    public Factura(int id, Date fecha, Persona cliente, Producto producto, int cantidad) {
        super(id, fecha);
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Persona getCliente() {
        return cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public void imprimir() {
        System.out.println("Factura");
        System.out.println(super.toString());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Factura{" + "cliente=" + cliente.toString() + ", producto=" + producto.toString() + ", cantidad=" + cantidad + '}';
    }
       
}
