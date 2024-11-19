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
public class GetCharFromAsciiCode {
   
    public static void main(String[]args){
     Scanner sc= new Scanner(System.in);
        System.out.print("Introduce un codigo ASCII:");
        int caracter= sc.nextInt();
        System.out.println("El caracter asociado al ASCII "+caracter+" es:"+ (char)caracter);
    
        
    }
}