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
public class Not {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String entrada="";
        boolean repetir;
        
       //EJERCICIO: tenemos que validar que sean ocho caracteres, ademas de que tengan que ser bits
        //????????
         
       do{ 
           repetir=false; //valor inicial del repetir
           
            System.out.println("Introduce el nº binario de 8 bits: ");
            entrada=sc.next();
            
            //compruebo casos no validos
            if (entrada.length() !=8){
                System.out.println("Error. Debe introducir 8 bits.");
                repetir=true;
                
            }else{ //tenemos una entrada de tamaño 8
                
                boolean seguir=true;
                for(int i=0; i<8 && seguir==true;i++){
                    
                    if(entrada.charAt(i) !='0' && entrada.charAt(i) !='1'){
                        System.out.println("Error. Debe introducir bits (0 o 1).");
                        repetir=true;
                        seguir=false;//no continuo viendo el  resto de bits
                    }
                }
            }
            
       }while(repetir==true);
        
        
        String not=""; //va a contener la negacion de entrada
        
        //en este punto estamos seguros que el nº es binario y de 8 bits.
        //algoritmo de not binario
        int decimal=0;
        for (int i=0; i<entrada.length();i++){
            char bit=entrada.charAt(i);
            if (bit=='0'){ 
                not=not+'1';
                decimal=decimal+(int) (Math.pow(2,entrada.length()-1-i)); //lo pasamos a decimmal
            }
            else if (bit == '1' ){
                not=not+'0';
            }
            
            
            
            
        }
        
        System.out.println("NOT("+entrada+"): "+not);
        System.out.println("NOT("+entrada+"): "+decimal);  
    }
}
