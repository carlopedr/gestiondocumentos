/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDAO;

import Basicos.Organizacion;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IOrganizacionDAO {
    public List<Organizacion> listOrganizacion();

    public Organizacion obtenerOrganizacion(double id);

    public void insertarOrganizacion(Organizacion organizacion);
    
    public void actualizarOrganizacion(Organizacion organizacion);
    
    public void eliminarOrganizacion(Organizacion organizacion);
}
