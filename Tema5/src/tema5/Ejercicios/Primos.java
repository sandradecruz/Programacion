/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.Ejercicios;

/**
 *
 * @author sandr
 */
public class Primos{
//    public boolean esPrimo(){
//        
//        boolean primo=true;
//        int contador=1; //contador de los 100 numeros
//        int num=2; //empezamos por el numero 2
//        do{
//            primo=true;
//            int a = 2;
//            if (num % a == 0 && num>a) { 
//                primo = false;
//            }
//
//            if(primo){
//            System.out.println(contador+". "+num); //mostramos el numero y su posicion respecto a los 100
//            contador++;
//            
//            }
//            
//            a++;
//            num++;
//        }while(contador<=100);
//            
//        return primo;
//    }
    
    
    public static void main(String[] args) {
        Primo app=new Primo();
        int contador=1;
        int num=2;
        boolean primo=true;
        while(contador<100){
            app.esPrimo(num);
            if(primo==true){
                System.out.println(num); //mostramos el numero y su posicion respecto a los 100
                contador++;
                
            }

                
                num++;
        }
    }
}


