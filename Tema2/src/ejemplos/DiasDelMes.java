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
public class DiasDelMes {
    public static void main(String [] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce mes(1-12): ");
        int mes=sc.nextInt();
        int dias= (mes==1 ||mes==3||mes==5||mes==7||mes==10||mes==12)? 31:
                (mes==2)? 28 : (mes==4||mes==6||mes==9||mes==11)?30:-1;
      
        
      if (dias !=-1){
          System.out.println("Dias del mes:"+dias);
          
      }else{
          System.err.println("Error.Mes fuera de rango.Intentalo de nuevo.");
      }  
        
        
        
        
        
        
        
    }
}
