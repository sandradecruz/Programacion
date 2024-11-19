/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author sandr
 *
 *
 * Ejemplo de intrduccion de datos desde el teclado
 * Uso de la clase 'escaner'
 * 
 * 
*/
public class EntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el numero entero:");
    int numero= sc.nextInt();
        System.out.println("Has introducido el numero "+numero);
        
        System.out.println("Introduce tu altura en metros:");
    double numero2=sc.nextDouble();
        System.out.println("Mides: "+numero2+"metros");
   
        System.out.print("Introduce tu nombre:");
        String nombre= sc.next();
        System.out.println("Te llamas " +nombre);
    
   
    
    }
    
}
