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
public class EjemploBucles1 {
    public static void main(String [] args){
        //mostrar los 10 primeros numeros
        int num=0;
        System.out.println(num);
        while(num<10){
            num++;
            System.out.println(num);
        }
        //mostrarlos en orden decreciente
        System.out.println(" ");
       
        System.out.println(num);
        while(num>0){
            num--;
            System.out.println(num);
        }
        
        //Sumar los 10 primeros numeros
        System.out.println(" ");
        
        int num2=0;
        while(num<=10){
            System.out.println(num);
            num++;
            num2=num2+num;
        }
        System.out.println("Suma de los 10 numeros:"+num2);
      
        
        
//1. Mostrar los numeros que hay entre un numero introducidos por el usuario (para negativos tambien)
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca un numero entero: ");
        int n=sc.nextInt();
        int a=1;
        if (n>1){
            while (a<=n){
                System.out.println(a);
                a++;
                
            }
        } 
        a=n;
        if (n>1){
            while (a>=n){
                System.out.println(a);
                a--;
                
            }
            
            
        }
        
        
//2. Mostrar los numeros que hay entre 2 valores enteros introducidos por el teclado.
        System.out.println("Introduzca el primer numero (el menor primero): ");
        int b=sc.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int c=sc.nextInt();
        System.out.println(" ");
        System.out.println(b);
        
        int aux;
        if(b>=c){
           aux=b;
           b=c;
           c=aux;
            
            
        }
        //Bucle siempre va del menor al mayor.
        while(b<c){
            b++;
            System.out.println(b);
        }
        
        
        
//3. mostrar los pares que hay entre uno y cien, contarlos y sumarlos
        System.out.println(" ");
        int d=2;
        int par=0;
        int parcont=0;
        System.out.println(d);
        while(d<100){
            d++;
            
            
            
            
            if(d%2==0){
                System.out.println(d);
                par=par+d;
                parcont++;
            }
        }
        System.out.println("La suma de los pares es: "+par);
        System.out.println("Hay un total de "+par+" pares.");
        
        
//4.Pedir al usuario enteros repetidamente hasta que introduzca un 0, entonces el programa dirá cuantos positivos y negativos ha introducido
        
        int pos=0;
        int neg=0;

        System.out.println("Introduzca un numero:");
            int valor=sc.nextInt();    
        
            if (valor>0){
                 pos++;
            }else if (valor<0){
                neg++;
            } 
        
        
        
        
        while(valor !=0){
            System.out.println("Introduzca otro numero: ");
            valor=sc.nextInt();
            if (valor>0){
                pos++;
            }else if (valor<0){
                neg++;
            } 
        
        }
        System.out.println("Has introducido "+pos+" numeros positivos.");
        System.out.println("Has introducido "+neg+" numeros negativos.");    
    
    }
}
