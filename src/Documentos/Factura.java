/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;

import Basicos.Documento;
import Basicos.Organizacion;
import Basicos.Persona;
import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Factura extends Documento{
    
    private int numero;
    private Organizacion orgCliente;
    protected Persona cliente;
    private float valor;
    private LocalDate fechaFac;
    private float descuentos;
    private float impuestos;

    public Factura(int id, LocalDate fecha) {
        super(id, fecha);
    }

    public Factura(int numero, Organizacion orgCliente, Persona cliente, float valor, LocalDate fechaFac, float descuentos, float impuestos, int id, LocalDate fecha) {
        super(id, fecha);
        this.numero = numero;
        this.orgCliente = orgCliente;
        this.cliente = cliente;
        this.valor = valor;
        this.fechaFac = fechaFac;
        this.descuentos = descuentos;
        this.impuestos = impuestos;
    }

    public int getNumero() {
        return numero;
    }

    public Organizacion getOrgCliente() {
        return orgCliente;
    }

    public Persona getCliente() {
        return cliente;
    }

    public float getValor() {
        return valor;
    }

    public LocalDate getFechaFac() {
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setOrgCliente(Organizacion orgCliente) {
        this.orgCliente = orgCliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setFechaFac(LocalDate fechaFac) {
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

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura{numero=").append(numero);
        sb.append(", orgCliente=").append(orgCliente);
        sb.append(", cliente=").append(cliente);
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
