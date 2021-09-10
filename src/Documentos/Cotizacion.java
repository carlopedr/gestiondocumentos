/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos;

import Basicos.Documento;
import Basicos.Organizacion;
import Basicos.Persona;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Cotizacion extends Documento{
    
    private int numero; //# Cotización
    private Organizacion empresa;
    private Persona interesado;
    private float valor;
    private Date fechaCot;
    private float descuentos;
    private float impuestos;

    public Cotizacion(int id, Date fecha) {
        super(id, fecha);
    }

    public Cotizacion(int numero, Organizacion empresa, Persona interesado, float valor, Date fechaCot, float descuentos, float impuestos, int id, Date fecha) {
        super(id, fecha);
        this.numero = numero;
        this.empresa = empresa;
        this.interesado = interesado;
        this.valor = valor;
        this.fechaCot = fechaCot;
        this.descuentos = descuentos;
        this.impuestos = impuestos;
    }

    public int getNumero() {
        return numero;
    }

    public Organizacion getEmpresa() {
        return empresa;
    }

    public Persona getInteresado() {
        return interesado;
    }

    public float getValor() {
        return valor;
    }

    public Date getFechaCot() {
        return fechaCot;
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

    public void setEmpresa(Organizacion empresa) {
        this.empresa = empresa;
    }

    public void setInteresado(Persona interesado) {
        this.interesado = interesado;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setFechaCot(Date fechaCot) {
        this.fechaCot = fechaCot;
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
        sb.append("Cotizacion{numero=").append(numero);
        sb.append(", empresa=").append(empresa);
        sb.append(", interesado=").append(interesado);
        sb.append(", valor=").append(valor);
        sb.append(", fechaCot=").append(fechaCot);
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
