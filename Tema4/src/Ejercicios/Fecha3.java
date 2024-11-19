/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Fecha3 {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        //Pedimos los dias a sumar o a restar
        System.out.println("Escriba los dias a sumar o a restar a partir del dia de hoy: ");
        long dias=sc.nextInt();
        
        //Incluimos la fecha actual
        LocalDate fechaact=LocalDate.now();
        
        //Hacemos la operacion
        LocalDate fechafin=fechaact.plusDays(dias);
        
        //Seleccionamos el formato de la fecha
        DateTimeFormatter dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        
        //Mostramos resultado        
        System.out.println("La fecha resultante es: "+dtf.format(fechafin));   
    }
}
