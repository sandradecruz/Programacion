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
public class Intercambio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pedimos ambas variables al usuario
        System.out.println("Introduce el primer valor:");
            int valor1=sc.nextInt();
        System.out.println("Introduce el segundo valor:");
            int valor2=sc.nextInt();
        
        //Añadimos una variable más para que nos ayude a hacer el intercambio, un recipiente para pasar las variables
        int extra;
        
        //Realizamos el cambio
        extra=valor1;
        valor1=valor2;
        valor2=extra;
        
        //Mostramos el resultado final
        System.out.println("Resultado del cambio del primer valor: "+valor1);
        System.out.println("Resultado del cambio del segundo valor:"+valor2);
        
        
        
    }
    
    
    
    
    
}
