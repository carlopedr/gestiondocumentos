/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos.RRHH;

import Basicos.Documento;
import Basicos.Organizacion;
import Basicos.Persona;
import java.util.Date;

/**
 *
 * @author JUAN DIEGO TRUJILLO BONILLA
 */
public class CV extends Documento { 
    private Persona persona;
    private String profesion;
    private String ocupacion;
    private int mesesExp;
    private String nivelEd;
    private Organizacion ultimaEmpresa;
    private Date fechaRetiro;

    public CV(Persona persona, String profecion, String ocupacion, int id, Date fecha) {
        super(id, fecha);
        this.persona = persona;
        this.profesion = profecion;
        this.ocupacion = ocupacion;
    }

    public Persona getPersona() {
        return persona;
    }

    public String getProfesion() {
        return profesion;
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
        this.profesion = profesion;
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
        return "CV{" + "persona=" + persona + ", profesion=" + profesion + ", ocupacion=" + ocupacion + '}';
    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
}
