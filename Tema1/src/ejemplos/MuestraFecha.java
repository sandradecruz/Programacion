/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

/**
 *
 * @author sandr
 */

//Añado una refenrencia a la clase local date para que asi pueda usar la fecha.
import java.time.LocalDate;
import java.time.LocalTime;

public class MuestraFecha {


    
    public static void main(String[] args){
    
        LocalDate hoy = LocalDate.now();
        
        LocalTime ahora = LocalTime.now();
        
        System.out.println(hoy+" "+ahora);
        
    }
}
