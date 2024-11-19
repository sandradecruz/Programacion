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
public class Pascua {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el año: ");
        int anio=sc.nextInt();
        double A= anio%19;
        double B=anio%4;
        double C=anio%7;
        double D=(19*A+24)%30;
        double E=(2*B+4*C+6*D+5)%7;
        double N=22+D+E;
        
        String mes=(N <= 31) ? ("en marzo"):("en abril");
        int dia=(int) ((N <= 31)? N:(N-31));
        System.out.println("Pascua cae en "+dia+" de "+mes);
        
    }
}
