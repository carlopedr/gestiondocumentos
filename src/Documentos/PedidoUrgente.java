/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;

import Basicos.Persona;
import Basicos.Producto;
import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author Juan Diego Coronado Yucuma COD:20192182431
 */
public class PedidoUrgente extends Pedido{
    private String fecha_entrega;
    private String hora;
    private String direccion;

    public PedidoUrgente(String fecha_entrega, String hora, String direccion, Persona proveedor, Producto producto, int cantidad, int id, Date fecha) {
        super(proveedor, producto, cantidad, id, fecha);
        this.fecha_entrega = fecha_entrega;
        this.hora = hora;
        this.direccion = direccion;
    }

    public PedidoUrgente(String fecha_entrega, String hora, String direccion, int id, Date fecha) {
        super(id, fecha);
        this.fecha_entrega = fecha_entrega;
        this.hora = hora;
        this.direccion = direccion;
    }
    private static final Logger LOG = Logger.getLogger(PedidoUrgente.class.getName());

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public String getHora() {
        return hora;
    }

    public String getDireccion() {
        return direccion;
    }

    public static Logger getLOG() {
        return LOG;
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

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    

    @Override
    public String toString() {
        return "PedidoUrgente{" + "fecha=" + fecha + "\nhora=" + hora + "\ndireccion=" + direccion + '}';
    }
    
    
    
    
    
}
