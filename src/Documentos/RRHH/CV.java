/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos.RRHH;

import Basicos.Documento;
import Basicos.Organizacion;
import Basicos.Persona;
import java.time.LocalDate;

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
    private LocalDate fechaRetiro;

    public CV(int id, LocalDate fecha) {
        super(id, fecha);
    }

    public CV(Persona persona, String profesion, String ocupacion, int mesesExp, String nivelEd, Organizacion ultimaEmpresa, LocalDate fechaRetiro, int id, LocalDate fecha) {
        super(id, fecha);
        this.persona = persona;
        this.profesion = profesion;
        this.ocupacion = ocupacion;
        this.mesesExp = mesesExp;
        this.nivelEd = nivelEd;
        this.ultimaEmpresa = ultimaEmpresa;
        this.fechaRetiro = fechaRetiro;
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

    public int getMesesExp() {
        return mesesExp;
    }

    public String getNivelEd() {
        return nivelEd;
    }

    public Organizacion getUltimaEmpresa() {
        return ultimaEmpresa;
    }

    public LocalDate getFechaRetiro() {
        return fechaRetiro;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public void setMesesExp(int mesesExp) {
        this.mesesExp = mesesExp;
    }

    public void setNivelEd(String nivelEd) {
        this.nivelEd = nivelEd;
    }

    public void setUltimaEmpresa(Organizacion ultimaEmpresa) {
        this.ultimaEmpresa = ultimaEmpresa;
    }

    public void setFechaRetiro(LocalDate fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
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
        sb.append("CV{persona=").append(persona);
        sb.append(", profesion=").append(profesion);
        sb.append(", ocupacion=").append(ocupacion);
        sb.append(", mesesExp=").append(mesesExp);
        sb.append(", nivelEd=").append(nivelEd);
        sb.append(", ultimaEmpresa=").append(ultimaEmpresa);
        sb.append(", fechaRetiro=").append(fechaRetiro);
        sb.append('}');
        return sb.toString();
    }

    
    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
}
