/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Fecha2 {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduzca una fecha:");
        String cadena=sc.nextLine();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate fechaUsuario=LocalDate.parse(cadena, dtf);

            LocalDate hoy=LocalDate.now();
        try{
//            //Imprimir los dias que hay entre la fecha de hoy y la elegida por el usuario
//            long diast=ChronoUnit.DAYS.between(fechaUsuario,hoy);
//            System.out.println("Los dias de diferencia son: "+Math.abs(diast));

            long dias2;
            if(fechaUsuario.isAfter(hoy)){
                dias2 = fechaUsuario.toEpochDay()-hoy.toEpochDay();
                System.out.println("La diferencia de dias entre las dos fechas: "+dias2);
            }else{
                dias2 = hoy.toEpochDay()-fechaUsuario.toEpochDay();
                System.out.println("La diferencia de dias entre las dos fechas: "+dias2);
            }
        }catch(DateTimeParseException e){
            System.err.println("Formato de fecha incorrecto");
        }
        
        
        }
}
