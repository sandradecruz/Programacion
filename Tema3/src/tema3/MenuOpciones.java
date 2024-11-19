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
public class MenuOpciones {
    //Muestre al usuario el siguiente menu de opciones: a.OPCION A b.OPCION B,...OPCION D, SALIR, ELIGE O INTRODUCE OPCION.
    //Cuando el usuario seleccione una opcion aparecera un mensaje informando de la opción elegida, si es una opcion no contemplada
    //mostrará un mensaje de error. El proceso se repetira continuamente hasta que el usuario seleccion 'q', entonces acabrá el programa.
    public static void main (String [] args){
        char aux= ' ';
        Scanner sc= new Scanner(System.in);
        while (aux !='Q'){
            System.out.println(" ");
            System.out.println("Opcion A");
            System.out.println("Opcion B");
            System.out.println("Opcion c");
            System.out.println("Opcion D");
            System.out.println("Salir (Q)");
            System.out.println("Introduce una opcion: ");
            aux=sc.next().toUpperCase().charAt(0);
            
            
            switch(aux){
                
                case 'A':
                    System.out.println("Seleccionaste la opcion A.");
                    break;
                case 'B':
                    System.out.println("Seleccionaste la opcion B.");
                    break;
                case 'C':
                    System.out.println("Seleccionaste la opcion C.");
                    break;
                case 'D':
                    System.out.println("Seleccionaste la opcion D.");
                    break;
                case 'Q':
                    System.out.println("A tu casa.");
                    break;
                default:
                    System.out.println("Opcion no valida. Intentelo de nuevo.");
                    break;
            }
            System.out.println(" ");
        }
        
        
        
    
        
        
        
        
    }

}
