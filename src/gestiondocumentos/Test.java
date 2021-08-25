/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondocumentos;

import Basicos.Persona;
import Basicos.Producto;
import Documentos.Factura;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");
        Date fecha;
        
        fecha = objSDF.parse("07-08-2021");
        //Persona c1 = new Persona(1, "Pedro", "pp@gmail.com");
        //Producto p1 = new Producto(100, "Mouse BT");
        //Factura f1 = new Factura(555, fecha, c1, p1, 4);
        //f1.imprimir();
         
     }
    
}
