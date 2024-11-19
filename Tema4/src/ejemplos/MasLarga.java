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
public class MasLarga {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        String cadena;
        String longer="";
        do{ 
            System.out.println("Escriba una cadena (Pulse enter para terminar: ");
            cadena=sc.nextLine();
            if(longer.length()<cadena.length()){
                longer=cadena;
            }
        }while(!cadena.equals("")); //o tambien while(!cadea.isBlank())
        System.out.println("La cadena mas larga de todas es: "+longer);
    }
}
