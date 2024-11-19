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
public class Cambio {
     public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         double cambio=1.12; //tipo de cambio del dolar
         
        System.out.println("Introduce la cantidad en euros:");
        double numero= sc.nextDouble();
        
        double dolares= numero*cambio;
         System.out.printf("%s %.2f %n", "Cambio a dolares:", dolares);
     }
}
