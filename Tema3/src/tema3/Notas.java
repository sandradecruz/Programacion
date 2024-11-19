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
public class Notas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Inttroduzca la nota de tu examen:");
        double nota=sc.nextDouble();
    switch((int)nota){
        case 0,1,2:
            System.out.println("MB");
            break;
        case 3,4:
            System.out.println("I");
            break;
        case 5:
            System.out.println("A");
            break;
        case 6:
            System.out.println("B");
            break;
        case 7,8:
            System.out.println("N");
            break;
        case 9,10:
            System.out.println("SB");
            break;
        default:
            System.out.println("Caracter no registrado.Try again.");
            
        
        
    } 
    
    
    
    
    
    }
    
}
