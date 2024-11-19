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
public class Alternar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una cadena: ");
        String cadena = sc.nextLine();
        
        String resultado = ""; // Usamos una cadena para almacenar el resultado
        int longitud = cadena.length();
        
        for (int i = 0; i < (longitud + 1) / 2; i++) {
          
            resultado = resultado + cadena.charAt(i);
        
            if (i != longitud - 1 - i) {
                resultado = resultado + cadena.charAt(longitud - 1 - i);
            }
        }
        
        System.out.println("Resultado: " + resultado);
    }
}

