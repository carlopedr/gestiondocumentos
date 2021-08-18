/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos.RRHH;

import Basicos.Documento;
import Basicos.Persona;
import java.util.Date;

/**
 *
 * @author JUAN DIEGO TRUJILLO BONILLA
 */
public class CV extends Documento { 
    private Persona persona;
    private String profecion;
    private String ocupacion;

    public CV(Persona persona, String profecion, String ocupacion, int id, Date fecha) {
        super(id, fecha);
        this.persona = persona;
        this.profecion = profecion;
        this.ocupacion = ocupacion;
    }

    public Persona getPersona() {
        return persona;
    }

    public String getProfecion() {
        return profecion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }
/////////////////////////////////////////////////////////
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setProfecion(String profecion) {
        this.profecion = profecion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "CV{" + "persona=" + persona + ", profecion=" + profecion + ", ocupacion=" + ocupacion + '}';
    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
}
