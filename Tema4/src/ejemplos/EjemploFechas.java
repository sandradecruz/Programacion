/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
//import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
/**
 *
 * @author sandr
 */
public class EjemploFechas {
    public static void main(String[] args) {
        //obtener fecha y hora del sistema //ctrl+espacio para ver chuletilla
        LocalDate hoy=LocalDate.now();
        System.out.println("Hoy es: "+hoy);
        LocalTime ahora= LocalTime.now();
        System.out.println("La hora es: "+ahora);
        
        LocalDateTime hoyahora=LocalDateTime.now();
        System.out.println("Fecha y hora: "+hoyahora);
        
        //Crear fechas 
        LocalDate navidad=LocalDate.of(2024, 12, 25);
        LocalDate nocheBuena=LocalDate.of(2025, Month.DECEMBER, 24);
        System.out.println("Navidad es: "+navidad);
        
//        LocalDate navidad2=LocalDate.of(Year.now().getValue(),Month.DECEMBER,24);
//        System.out.println("Navidad 2 es: "+navidad2);

        navidad=LocalDate.of(LocalDate.now().getYear(),Month.DECEMBER,25);
        System.out.println(navidad);
        
        LocalDate fecha=LocalDate.ofEpochDay(2500L);
        
        LocalDate.ofYearDay(2025, 364);
        
        //Crear horas concretas
        LocalTime hora1=LocalTime.of(11,40);
        
        //Sumar y restar fechas
        LocalDate otraFecha=navidad.plusDays(10);
        System.out.println(otraFecha);
        
        //comparar fechas
        
        //ver si son iguales
        System.out.println(navidad.equals(otraFecha));
        System.out.println(navidad.compareTo(hoy));
        
        
        //ver cual es mas reciente
        System.out.println(navidad.isAfter(hoy));
        System.out.println(navidad.isBefore(hoy));
        
        
        //--> ver la diferencia de dias que hay entre ellas
        Period p=Period.between(navidad, hoy);
        
        //cambiamos de zona horaria
            //-->vemos las zonas horarias disponibles
        Set <String> zonas=ZoneId.getAvailableZoneIds();
        for(String zona: zonas){
            System.out.println(zona);
        }
        ZoneId japon=ZoneId.of("Japan");
        ZonedDateTime horaJapon=ZonedDateTime.now(japon);
        System.out.println(horaJapon);
    
    }
}
