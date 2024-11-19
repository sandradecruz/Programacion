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
public class Calculo {
    
        public static void main(String[]args){
     Scanner sc= new Scanner(System.in);
            System.out.println("Introduce el primer numero: ");
        
         //Numeros enteros= int. Numeros reales= double   
            double a= sc.nextDouble();
            System.out.println("Introduce el segundo numero: ");
            double b=sc.nextDouble();
            System.out.println("Introduce la operacion (+, -, x, /, %): ");
        char operacion = sc.next().charAt(0);
            
            //vemos lo que contiene la variable operacion
            //Para realizar la operacion correspondiente
            if (operacion == '+') { //Si operacion es cierta. El || significa or, y lo usamos para añadir mas opciones, una cosa u otra, al if
            System.out.println("La suma es: " + (a + b)); //hacemos la suma
        } if (operacion == '-') {
            System.out.println("La resta es: " + (a - b)); //hacemos la resta
        } if (operacion == 'x'|| operacion =='X') {
            System.out.println("El producto es: " + (a * b)); //hacemos la multiplicacion
        } if (operacion == '/') {
            System.out.println("El cociente es: " + (a / b)); //hacemos la division
        } if (operacion == '%') {
            System.out.println("EL producto es: "+ (a/b));
        } if (operacion != '+' 
                && operacion != '-' && operacion != 'x' && operacion != '/'  //El && indica 'y', para añadir mas opciones SIMULTANEAS al if
                && operacion != '%' && operacion != 'X') {
            System.out.println("Caracter no registrado.\nIntentelo de nuevo.");
        }
            
            
        /*System.out.println("El resultado es: " + (operacion == '+' ? (a + b) :
                            operacion == '-' ? (a - b) :
                            operacion == 'x' ? (a * b) :
                            operacion == '/' ? (a / b) :". "));
        */                            
                            
            
        
            
         
        
        
                                    }
}
