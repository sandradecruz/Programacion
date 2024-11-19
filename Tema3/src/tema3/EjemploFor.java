/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author sandr
 */
public class EjemploFor {
    public static void main (String [] args){
        
        double ale=0;
        int impar=0;
        int par=0;
        
        
      for (int i=0; i<=25; i++){
          ale=(int) 1001*Math.random(); //Tambien se puede poner 1000*Math.random()+1???
          if(ale%2==0){
                par++;
                
            }else{
                impar++;
            }    
      
      
      
      
      }  
       System.out.println("Han salido "+par+" numeros pares.");
       System.out.println("Han salido "+impar+" numeros impares."); 
        
        
    }
}
