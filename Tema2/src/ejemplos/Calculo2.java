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
public class Calculo2 {
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
            
            //El else if nos ayuda a solo tener una condicion if en vez de varias
            if (operacion == '+') { //Si operacion es cierta. El || significa or, y lo usamos para añadir mas opciones, una cosa u otra, al if
            System.out.println("La suma es: " + (a + b)); //hacemos la suma
        } else if(operacion == '-') {
            System.out.println("La resta es: " + (a - b)); //hacemos la resta
        } else if (operacion == 'x'|| operacion =='X') {
            System.out.println("El producto es: " + (a * b)); //hacemos la multiplicacion
        } else if(operacion == '/') {
            System.out.println("El cociente es: " + (a / b)); //hacemos la division
        } else if(operacion == '%') {
            System.out.println("EL producto es: "+ (a/b));
        } else { //La operacion no es ninguna de las permitidas
            System.out.println("Caracter no registrado.\nIntentelo de nuevo.");
        }
    }
}
