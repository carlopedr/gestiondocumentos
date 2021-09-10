package gestiondocumentos;

import Basicos.Organizacion;
import Basicos.Persona;
import DAO.PersonaDAO;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Test {

    public static void main(String[] args) throws ParseException {
        LocalDate f = LocalDate.parse("23/11/1995", DateTimeFormatter.ofPattern("d/M/yyyy"));
        Persona rl = null;
        Organizacion eps1 = new Organizacion(101, "Sanitas", rl, "Cll 6 23 56", "contacto@sanitas.com.co", f, "EPS");
        Organizacion eps2 = new Organizacion(102, "Medimas", rl, "Cll 6 23 56", "contacto@sanitas.com.co", f, "EPS");
        Persona p = new Persona(8, "Esther Rodríguez", "erod01@gmail.com", f, "Plaza Mayor", eps2);
        PersonaDAO perdao = new PersonaDAO();
        //Test insertarPersona
       //perdao.insertarPersona(p);
        //Test listaPersona()
       /* List<Persona> list = perdao.listPersona();
        Iterator<Persona> iter = list.iterator();
        Persona pl;
        System.out.println("Listado Personas");
        while (iter.hasNext()) {
            pl = iter.next();
            System.out.println(pl.toString());
        }*/
        
        //Test buscar persona por id
        /*
        try {
            Persona p1 = perdao.obtenerPersona(7.0);
            System.out.println("Persona: " + p1.toString());
        } catch (Exception e) {
            System.out.println("Error");
        }*/
        //Test actualizarPersona
        /*System.out.println("Antes de actualizar");
        Persona pAct = new Persona(7, "Rocio Dueñas", "rocio1234@yahoo.com", f, "Centro Histórico", eps1);
        perdao.actualizarPersona(pAct);
        System.out.println("Despes de actualizar");
        try {
            Persona p1 = perdao.obtenerPersona(7.0);
            System.out.println("Persona: " + p1.toString());
        } catch (Exception e) {
            System.out.println("Error");
        }*/
        //Test borrarPersona
        Persona pDel = new Persona(2, "Camila Ruiz", "cami.ruiz@mail.com", f, "Torres del Prado ", eps2);
        perdao.eliminarPersona(pDel);
        //System.out.println("Persona: " + p.toString()); */
    }
}
