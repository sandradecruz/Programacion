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
public class Invertir {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce una cadena a invertir:");
        String cadena=sc.nextLine();
        String invertida="";
        
        for(int i=0;i<cadena.length();i++){
            if(Character.isUpperCase(cadena.charAt(i))){ //si es mayuscula
                invertida=invertida+Character.toLowerCase(cadena.charAt(i));
                
            }else if(Character.isLowerCase(cadena.charAt(i))){ //si es minuscula
                invertida=invertida+Character.toUpperCase(cadena.charAt(i));   
            }else if(Character.isSpaceChar(cadena.charAt(i))){
                invertida= invertida+" ";
            }
        }
        System.out.println("Cadena invertida: "+invertida);
    }
}
