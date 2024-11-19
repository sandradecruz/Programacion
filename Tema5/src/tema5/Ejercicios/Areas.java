/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.Ejercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Areas {
     public  static Scanner sc=null;
     /*
     * @return      
     */
    
    //Metodo circulo
    public double circulo() {
        System.out.println("Ingrese el radio del circulo:");
        double radio = sc.nextDouble();
        //Formato de solo 2 decimales
        DecimalFormat nf = new DecimalFormat("#,###.00");
        nf.setMaximumFractionDigits(2);
        
        double area1 = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del circulo es: " + nf.format(area1));
        
        return area1;
    }
    
    //Metodo cuadrado
    public double cuadrado(){
        System.out.println("Ingrese base del cuadrado:");
        double base=sc.nextDouble();
        
        double area2=Math.pow(base, 2);
        System.out.println("El area del cuadrado es: "+area2);
        return area2;
    }
    
    //Metodo rectangulo
    public double rectangulo(){
        System.out.println("Ingrese base del rectangulo:");
        double base=sc.nextDouble();
        System.out.println("Ingrese altura del rectangulo:");
        double altura=sc.nextDouble();
        
        double area3=base*altura;
        System.out.println("El area del rectangulo es: "+area3);
        
        return area3;
    }
    
    //Metodo triangulo
    public double triangulo(){
        System.out.println("Ingrese base del triangulo:");
        double base=sc.nextDouble();
        System.out.println("Ingrese altura del triangulo:");
        double altura=sc.nextDouble();
        
        double area4=(base*altura)/2;
        System.out.println("El area del triangulo es: "+area4);
        
        return area4;
    }
    
    

    public static void main(String[] args) {
        Areas app = new Areas();
        sc=new Scanner(System.in);
        String num;
        do{
            System.out.println(" \n"+"Elija una de las siguientes figuras para hallar el area:\n"+"--------------\n"
                    + "1-Circulo\n"+"2-Cuadrado\n"+"3-Rectangulo\n"+"4-Triangulo\n"+"0-Salir\n"+"--------------\n");
            num=sc.next();
            if(num.equals("1")){
                app.circulo();
            }
            if(num.equals("2")){
                app.cuadrado();
            }
            if(num.equals("3")){
                app.rectangulo();
            }
            if(num.equals("4")){
                app.triangulo();
            }
            if(num.equals("0")){
                System.out.println("Bye bye");
            }
            if(!num.equals("0") && !num.equals("1")&&!num.equals("2")&&!num.equals("3")&&!num.equals("4")){
                System.err.println("ERROR.Porfavor escriba un numero dentro del rango.");
            }
        }while(!num.equals("0"));
    
    }
}
