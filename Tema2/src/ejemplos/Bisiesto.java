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
public class Bisiesto {
    public static void main(String[] args) {
    
     Scanner sc= new Scanner(System.in);   
    
        System.out.println("Introduce el anio:");
        int anio= sc.nextInt();
        
        boolean bisiesto=false;
        
        
        if(anio % 4 ==0){//Bisiesto si cumple lo siguiente
             bisiesto = true;//Si es bisiesto
            if ((anio % 100 ==0) && (anio % 400 !=0)){
             bisiesto= false;
            }
            }
        if(bisiesto==true){
            System.out.println("El anio es BISIESTO.");
        
      
        }else{
            System.out.println("El anio NO ES BISIESTO.");
        }
    }
}

