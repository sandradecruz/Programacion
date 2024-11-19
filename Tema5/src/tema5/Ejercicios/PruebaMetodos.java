/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.Ejercicios;



/**
 *
 * @author sandr
 */
public class PruebaMetodos {
   
    //Metodo que recibe como parametro grados Celsius
    public double toFahrenheit(double celsius){
        return (9.0/5.0)*celsius+32;
    }
    
    public boolean par(int numero){
        return(numero%2==0);
    }
    
    public int divisor(int numero){
        
        for(int i=numero-1;i>0;i--){
            if(numero%i==0){
               return i; //es el divisor buscado
            }
        }
        //si no nos salimos del metodo dentro del for es porque el numero es primo
        //el numero era primo
        return 1; //el divsor mas grande de un primo distinto de el propio numero
    }
    
    public static void main(String[] args) {
        PruebaMetodos app=new PruebaMetodos();
        if(app.par(8))System.out.println("Es par");
        else System.out.println("Es impar");
        
        double gradosCelsius=25.6;
        double gradosF=app.toFahrenheit(gradosCelsius);
        System.out.println("Grados F: "+gradosF);
        
        int numero=8;
        System.out.println("El divisor mas grande de "+numero+" es "+app.divisor(numero));
    }
    
    //Hacer los ejercicios 7 y 9.
    
    
}
