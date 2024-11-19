/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Fecha1 {
     public static void main (String [] args){
         Scanner sc=new Scanner(System.in);
         
         String cadena="";
         
         System.out.println("Escriba una el dia de su nacimiento:");
         String dia=sc.nextLine();
         cadena=cadena+dia+"/";
         
         System.out.println("Escriba una el mes de su nacimiento:");
         String mes=sc.nextLine();
         cadena=cadena+mes+"/";
         
         System.out.println("Escriba una el año de su nacimiento:");
         String ano=sc.nextLine();
         cadena=cadena+ano;
         
         //Indiciamos en que formato de fecha está escrita la cadena
         DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
         LocalDate fecha=LocalDate.parse(cadena, dtf);  
         
         //convertimos a short
         dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
         System.out.println("Tu fecha de nacimiento en SHORT es: "+dtf.format(fecha));
         
         
         //convertimos a long
         dtf=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
         System.out.println("Tu fecha de nacimiento en LONG es: "+dtf.format(fecha));
         
         
         
         
         //Recoger la fecha con int
         
         System.out.println("Introduce fecha nacimiento:");
         System.out.println("\tDia:");
         int dia2=sc.nextInt();
         System.out.println("\tMes:");
         int mes2=sc.nextInt();
         System.out.println("\tAnio:");
         int ano2=sc.nextInt();
         
         LocalDate fechanac=LocalDate.of(ano2, mes2, dia2);
         
         DateTimeFormatter dtfS=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
         DateTimeFormatter dtfL=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
         
         System.out.println("Tu fecha de nacimiento en SHORT es: "+dtfS.format(fechanac));
         System.out.println("Tu fecha de nacimiento en LONG es: "+dtfL.format(fechanac));
     }
}
