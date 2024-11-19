/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Ticket {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    System.out.println("Introduzca el total de su compra:");
    double precioT=sc.nextDouble();
    
        System.out.println("Porcentaje IVA (%):");
        double iva=sc.nextDouble();
        
      //Calculo del IVA  
        double Tsiniva= precioT-(precioT*(iva/100));
    
    
    
    
    //Resultados
        System.out.println("El total de la compra sin IVA:"+Tsiniva);
        System.out.println("Total IVA:"+precioT*(iva/100));
    
    }
}   
