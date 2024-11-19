/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class DNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dni; //dni introducido por el usuario
        final int  MAX=3; //limite de intentos permitidos
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int contador=0; //contador de intentos fallidos
        char letradni; //letra DNI introducida por el usuario
        char letracorrecta; //letra DNI calculadada
        //bucle de validacion del dni
        do {
            System.out.print("Introduce un DNI: ");
            dni = sc.nextLine().toUpperCase();
            if (dni.matches("\\d{8}[A-Z]")) {
                int numerodni = Integer.parseInt(dni.substring(0, 8));
                letradni = dni.charAt(8);
                int resto = numerodni % 23;
                letracorrecta = letras.charAt(resto);
                if (letradni == letracorrecta) {
                    System.out.println("El DNI es valido");
                } else {
                    System.out.println("La letra del DNI deberia ser: " + letracorrecta);
                    contador++;
                }
            } else {
                System.out.println("Formato de DNI incorrecto");
                contador++;
            }           
            if (contador < MAX) {
                System.out.println("Intento " + contador + " de 3");
            }
        } while (contador < MAX && !dni.matches("\\d{8}[A-Z]"));
        
        if (contador == MAX) {
            System.out.println("Has alcanzado el limite de intentos");
        }
    }
}
