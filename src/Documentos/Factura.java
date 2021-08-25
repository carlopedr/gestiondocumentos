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
 * @author Luis Miguel
 */
public class Factura extends Documento{
    
    private int numero;
    private Organizacion orgCliente;
    protected Persona cliente;
    private float valor;
    private Date fechaFac;
    private float descuentos;
    private float impuestos;

    public Factura(int id, Date fecha) {
        super(id, fecha);
    }

    public Factura(int numero, Organizacion org, Persona cliente, float valor, Date fechaFac, float descuentos, float impuestos, int id, Date fecha) {
        super(id, fecha);
        this.numero = numero;
        this.orgCliente = org;
        this.cliente = cliente;
        this.valor = valor;
        this.fechaFac = fechaFac;
        this.descuentos = descuentos;
        this.impuestos = impuestos;
    }

    public int getNumero() {
        return numero;
    }

    

    public Persona getCliente() {
        return cliente;
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

    

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
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
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
       
}
