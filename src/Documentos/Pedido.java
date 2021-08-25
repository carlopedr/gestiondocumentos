/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;

import Basicos.Documento;
import Basicos.Organizacion;
import Basicos.Persona;
import Basicos.Producto;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Pedido extends Documento{
    private int numero;
    private Organizacion proveedor;
    protected Persona vendedor;
    private float valor;
    private Date fechaFac;
    private float descuentos;
    private float impuestos;

    public Pedido(int id, Date fecha) {
        super(id, fecha);
    }

    public Pedido(int numero, Organizacion proveedor, Persona vendedor, float valor, Date fechaFac, float descuentos, float impuestos, int id, Date fecha) {
        super(id, fecha);
        this.numero = numero;
        this.proveedor = proveedor;
        this.vendedor = vendedor;
        this.valor = valor;
        this.fechaFac = fechaFac;
        this.descuentos = descuentos;
        this.impuestos = impuestos;
    }

    public int getNumero() {
        return numero;
    }

    public Organizacion getProveedor() {
        return proveedor;
    }

    public Persona getVendedor() {
        return vendedor;
    }

    public float getValor() {
        return valor;
    }

    public Date getFechaFac() {
        return fechaFac;
    }

    public float getDescuentos() {
        return descuentos;
    }

    public float getImpuestos() {
        return impuestos;
    }

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setProveedor(Organizacion proveedor) {
        this.proveedor = proveedor;
    }

    public void setVendedor(Persona vendedor) {
        this.vendedor = vendedor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setFechaFac(Date fechaFac) {
        this.fechaFac = fechaFac;
    }

    public void setDescuentos(float descuentos) {
        this.descuentos = descuentos;
    }

    public void setImpuestos(float impuestos) {
        this.impuestos = impuestos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido{numero=").append(numero);
        sb.append(", proveedor=").append(proveedor);
        sb.append(", vendedor=").append(vendedor);
        sb.append(", valor=").append(valor);
        sb.append(", fechaFac=").append(fechaFac);
        sb.append(", descuentos=").append(descuentos);
        sb.append(", impuestos=").append(impuestos);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
