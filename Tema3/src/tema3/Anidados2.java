/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

import java.util.Scanner;

/**
 *
 * @author sandr
 * 
 * 
 * Dibujamos un rectangulo cuyas dimensiones se introducen por teclado.
 * ->minimo 1
 * ->maximo 20
 * 
 */
public class Anidados2 {
    public static void main (String [] args){
        
        Scanner sc= new Scanner(System.in);
        
        int base=0;
        int altura=0;
        
        do{
            System.out.println("Base: ");
            base=sc.nextInt();
            System.out.println("Altura: ");
            altura=sc.nextInt();
            
            if((base<1 ||base>20) || (altura<1 || altura>20)){
                System.out.println("Intentelo de nuevo. Datos no validos");
            }else{
                System.out.println("Vamos a crear tu rectangulo");
            }
            
        }while((base<1 || base>20) || (altura<1 || altura>20));
            
        
        for(int i=1; i<=altura;i++){
            for(int j=1;j <=base;j++){ //pintamos una linea de asteriscos
                System.out.print("*");
                
            }
                
            System.out.println(); 
        }
        
        
    }
}
