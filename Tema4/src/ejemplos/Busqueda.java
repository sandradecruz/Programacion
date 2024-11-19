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
public class Busqueda {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Intruzca una cadena: ");
        String cadena=sc.nextLine();
        
        System.out.println("Intruzca lo que desee buscar en esa cadena: ");
        String busca=sc.nextLine();
        
        int pos=-1;
        int ocurrencias=0;
        String posiciones = "";
        
         do {
            pos = cadena.indexOf(busca, pos + 1);
            if (pos != -1) {
                posiciones += pos + " "; // Agrega la posición y un espacio
                ocurrencias++;
            }
        } while (pos != -1);
        
         System.out.println("Encontrado en las posiciones: "+ posiciones);
        System.out.println("Nº de ocurrencias: "+ocurrencias);
    }
     
}
