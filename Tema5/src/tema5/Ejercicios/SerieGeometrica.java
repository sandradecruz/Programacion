/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.Ejercicios;

/**
 *
 * @author sandr
 */
public class SerieGeometrica {
    public double p(int n){
        if(n==1) return 1;
        return 1.0/n*p(n-1);
    }
    
    public double s(int n){
        if(n==1) return 0.5;
        return (double)n/(n+1) + s(n-1);
    }
    
    public static void main(String[] args) {
        SerieGeometrica app=new SerieGeometrica();
        System.out.println(app.p(5));
        System.out.println(app.s(5));
    }
}
