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
public class Triangulo {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);

        //Pedimos la cadena al usuario
        System.out.println("Escriba una cadena de caracteres para hacer un triangulo con ellos:");
        String cadena=sc.nextLine(); //String para así poder ver la longitud de la cadena que haya escrito el usuario
        
        //Bucle hasta el maximo de caracteres que ha puesto el usuario en su cadena
        for(int i=0;i<cadena.length();i++){ 
            for (int j=0;j<=i;j++){  //Bucle para escribir caracter por caracter
                System.out.print(cadena.charAt(j)+" "); //Imprimimos el caracter por posicion
            }
            System.out.println();//salto de linea para hacer el triangulo    
        }
    }
}