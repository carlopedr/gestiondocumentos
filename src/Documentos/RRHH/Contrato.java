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
 * @author Usuario
 */
public class Contrato extends Documento{

    protected Persona empleado;
    protected String cargo;
    protected double sueldo;
    protected Date fechaIngreso;
    protected String tipoContrato;
    protected Date fechaVence;

    public Contrato(int id, Date fecha) {
        super(id, fecha);
    }

    public Contrato(Persona empleado, String cargo, double sueldo, Date fechaIngreso, String tipoContrato, Date fechaVence, int id, Date fecha) {
        super(id, fecha);
        this.empleado = empleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.fechaIngreso = fechaIngreso;
        this.tipoContrato = tipoContrato;
        this.fechaVence = fechaVence;
    }

    public Persona getEmpleado() {
        return empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public Date getFechaVence() {
        return fechaVence;
    }

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setEmpleado(Persona empleado) {
        this.empleado = empleado;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public void setFechaVence(Date fechaVence) {
        this.fechaVence = fechaVence;
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
        sb.append("Contrato{empleado=").append(empleado);
        sb.append(", cargo=").append(cargo);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", fechaIngreso=").append(fechaIngreso);
        sb.append(", tipoContrato=").append(tipoContrato);
        sb.append(", fechaVence=").append(fechaVence);
        sb.append('}');
        return sb.toString();
    }

    
    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
