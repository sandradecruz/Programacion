/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class SignoNumero {
     public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
        System.out.println("Introduce un numero:");
        int numero= sc.nextInt();
        
        if(numero >0){
            System.out.println("Es positivo");
            
        }else if(numero<0){
            System.out.println("Es negativo");
        }else if (numero==0){
            System.out.println("El número introducido es 0.");
        }
    }
}
