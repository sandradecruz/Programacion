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
public class Coordenadas {
    public double obtenerX(double r, double angulo){
        return(r*Math.cos(angulo));
    }
    
    public double obtenerY(double r, double angulo){
        return(r*Math.sin(angulo));
    }
    public void mostrarCartesianas(double x, double y){
        DecimalFormat nf=new DecimalFormat("#,###.00");
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        System.out.println("COORDENADAS CARTESIANAS");
        System.out.println("-----------------------");
        System.out.println("x="+nf.format(x));
        System.out.println("y="+nf.format(y));
    }
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Introduce distancia del punto:");
            double distancia=sc.nextDouble();
            System.out.println("Introduce angulo(en grados):");
            double angulo=sc.nextDouble();

            //obtenemos las coordenadas
            Coordenadas app=new Coordenadas();
            double x=app.obtenerX(distancia, angulo) + Math.toRadians(angulo);
            double y=app.obtenerY(distancia, angulo) + Math.toRadians(angulo);
            
            app.mostrarCartesianas(x, y);
        }catch (Exception e){
            System.err.println("Introduzca las cordenadas correctamente");
        }
    }
}

    