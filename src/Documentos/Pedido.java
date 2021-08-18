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
public class Pedido extends Documento{
    protected Persona proveedor;
    protected Producto producto;
    protected int cantidad;

    public Pedido(Persona proveedor, Producto producto, int cantidad, int id, Date fecha) {
        super(id, fecha);
        this.proveedor = proveedor;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public void setProveedor(Persona proveedor) {
        this.proveedor = proveedor;
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

    public Pedido(int id, Date fecha) {
        super(id, fecha);
    }

    public Persona getProveedor() {
        return proveedor;
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

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
