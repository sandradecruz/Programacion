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
public class MCDCorrection {
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        
        
        
        System.out.println("Vamos a hacer el MCD de dos numeros aplicando el algoritmo de Euclides.");
        
        //Repetimos hasta que ambos números sean positivos, sino el algoritmo no funcionará        
        do{
        System.out.println("Introduce el primer numero (positivo): ");
        num1= sc.nextInt();
        System.out.println("Introduce el segundo numero (positivo): ");
        num2=sc.nextInt();
        if(num1 <=0 || num2 <=0){
            System.out.println("Error. Datos no validos. Intentelo de nuevo.");
        }
        }while (num1 <=0 || num2 <=0);//condicion por las que se repite el bucle
        
        
        //para que el numero seal el mayor de los dos, así funcionará el algoritmo.
        if(num1<=num2){
            //cambio de variable para que el num1 sea el mayor de los dos.
            int aux=num1;
            num2=num1;
            num1=aux;
        }
        
        //Aplicamos el algoritmo de euclides
        //sabiendo que el num1 es mayor que el num2, y también positivos
        int resto=1;
        while(resto!=0){
            resto= num1%num2;

            //hacemos el cambio si el resto no es cero
            if(resto !=0){
                num1=num2;
                num2=resto;
            }
            
            
        }
        
        System.out.println("El MCD es: "+num2);
        
        
    }
}
