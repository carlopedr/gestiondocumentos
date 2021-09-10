/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Documentos.RRHH;

import Basicos.Documento;
import Basicos.Persona;
import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class Contrato extends Documento{

    protected Persona empleado;
    protected String cargo;
    protected double sueldo;
    protected LocalDate fechaIngreso;
    protected String tipoContrato;
    protected LocalDate fechaVence;

    public Contrato(int id, LocalDate fecha) {
        super(id, fecha);
    }

    public Contrato(Persona empleado, String cargo, double sueldo, LocalDate fechaIngreso, String tipoContrato, LocalDate fechaVence, int id, LocalDate fecha) {
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

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public LocalDate getFechaVence() {
        return fechaVence;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
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

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public void setFechaVence(LocalDate fechaVence) {
        this.fechaVence = fechaVence;
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
