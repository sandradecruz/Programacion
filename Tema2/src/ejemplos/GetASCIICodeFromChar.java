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
public class GetASCIICodeFromChar {
    public static void main(String[]args){
     Scanner sc= new Scanner(System.in);
        System.out.print("Introduce un caracter para enviar su numero ASCII:");
        char caracter= (char) sc.next().charAt(0);
        
        System.out.println("El numero del caracter es\'"+ caracter+ "\'es:"+(int)caracter);
    
        
    }
    
    
}
