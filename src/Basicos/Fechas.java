/*
 * Clase creada con el proposito de ilustrar el manejo de 
 * fechas
 */
package Basicos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;





/**
 *
 * @author Usuario
 */
public class Fechas {

    public static void main(String[] args) {

        System.out.println("La fecha actual es: " + LocalDate.now());
        System.out.println("La hora actual es: " + LocalTime.now());
        System.out.println("La fecha y hora actuales son: " + LocalDateTime.now());
        System.out.println("El instante actual es: " + Instant.now());
        //System.out.println("La fecha y hora actuales con zona horaria son: " + ZonedLocalDateTime.now());

        //Método of(): construyen fechas y horas a partir de sus partes.
        System.out.println("Fecha de mi cumpleaños: " + LocalDate.of(1972, Month.MAY, 23));
        //Con número de mes
        System.out.println("Fecha de mi cumpleaños: " + LocalDate.of(1972, 6, 23));

        //Parseando" fechas
        //Una tarea habitual en el manejo de fechas es "parsearlas", es decir, interpretarlas a partir de una cadena, generalmente recibida de la entrada de un usuario o de algún sistema de almacenamiento externo.
        //Las clases de java.time, por fortuna, ofrecen el método parse() 
        //que se ocupa de esto de manera trivial. 
        //Tiene dos sobrecargas, una que recibe la cadena a 
        //interpretar y, una segunda que además añade un formateador
        //especializado si lo necesitamos:
        
        String fecha;
        System.out.print("Fecha (dd/mm/aaaa):");
        Scanner input = new Scanner(System.in);
        fecha=input.nextLine();
        LocalDate fechaD = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("d/M/yyyy") );
        System.out.print("Fecha recibida: "+fechaD.toString());
        


    }
}
