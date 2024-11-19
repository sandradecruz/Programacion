/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author sandr
 */
public class Fecha4 {
    public static void main (String [] args){
        // Fecha en el formato "5 de agosto de 2022"
        String fechaOriginal = "5 de agosto de 2022";

        // Formateador para convertir la fecha original a LocalDate
        DateTimeFormatter dtfOriginal = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
        LocalDate fecha = LocalDate.parse(fechaOriginal, dtfOriginal);

        // Formateador para convertir la fecha a "05/08/2022"
        DateTimeFormatter dtfNuevo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaNueva = fecha.format(dtfNuevo);

        // Mostrar la fecha en el nuevo formato
        System.out.println("Fecha en el nuevo formato: " + fechaNueva);
    }
}
