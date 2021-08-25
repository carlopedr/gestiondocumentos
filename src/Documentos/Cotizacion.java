/*
 * KevixTo change this license header, choose License Headers in Project Properties.
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
 * @author Kevin
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

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
