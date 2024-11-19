/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

/**
 *
 * @author NIGGA
 */
public class EjemploFormateoFechas {
    public static void main (String [] args){
        //Format: LocalDate-->String       Parse: String-->LocalDate
        
        //Formateo de fechas
        LocalDate hoy=LocalDate.now();
        System.out.println("Formato predefinido: "+hoy);
        DateTimeFormatter dtf=DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println("Formato ISO: "+dtf.format(hoy));
        
        dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println("Formato medio: " +dtf.format(hoy));
        
        dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println("Formato medio: " +dtf.format(hoy));
        
        
        dtf=DateTimeFormatter.ofPattern("d/MM/yyyy");
        System.out.println("Formatedo personalizado: "+
                dtf.format(LocalDate.of(2024, Month.MARCH, 1)));
        
        //Formato
        //Hoy es martes 29 de nov de 2024
        dtf=DateTimeFormatter.ofPattern("'Hoy es' EEEE,dd 'de' LLL 'de' yyyy");
                System.out.println("Formatedo personalizado: "+
                dtf.format(hoy));
                
         
                
                
        //Parseo de fechas: String -> LocalDate
        try{
            String cadena="39/10/2024";
            DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate fechaUsuario=LocalDate.parse(cadena, dtf2);

            System.out.println("Has introducido la fecha: "+dtf2.format(fechaUsuario));
        } catch(DateTimeParseException ex){
            System.err.println("Ha ocurrido un error. Fecha no valida. Intentelo de nuevo.");
        }
    }
}
