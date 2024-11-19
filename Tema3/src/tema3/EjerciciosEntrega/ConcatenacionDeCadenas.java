/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.EjerciciosEntrega;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class ConcatenacionDeCadenas {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Variable para la cadena
        String cadena;
        
        //Variable para hacer la agrupación de las cadenas
        String concatenacion="";
        
        //Bucle para que el usuario escriba las cadenas que desee
        do{ 
            System.out.println("Escriba una cadena (Pulse enter para terminar: ");
            cadena=sc.nextLine();
            concatenacion= concatenacion + cadena+ " "; //Juntamos las cadenas en otra variable string
        }while(cadena != ""); //Condición de no parar hasta que el usuario pulse "enter"
        
        //Mostramos el resultado
        System.out.println("La concatenacion resultante es: "+concatenacion);   
    }
}