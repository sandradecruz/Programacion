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
public class MiNota {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
            System.out.println("Escriba su primera nota de exmanen: ");
                int a= sc.nextInt();
            System.out.println("Escriba su segunda nota de exmanen: ");
                int b= sc.nextInt();
            System.out.println("Escriba su tercera nota de exmanen: ");
                int c= sc.nextInt();
            System.out.println("Escriba su cuarta nota de exmanen: ");
                int d= sc.nextInt();
        
        int media=((a+b+c+d)/4);
        
        if (media>=90 && media<=100){
            System.out.println("Tu calificación es: "+media+" A");
        }else if (media >=80 && media<=89){
            System.out.println("Tu calificación es: "+media+" B");
        }else if (media >=70 && media<=79){
            System.out.println("Tu calificación es: "+media+" C");
        }else if (media >=60 && media<=69){
            System.out.println("Tu calificación es: "+media+" D");
        }else if (media >=0 && media<=59){
            System.out.println("Tu calificación es: "+media+" E");
        }

        
        
        
        
        
    }
}
