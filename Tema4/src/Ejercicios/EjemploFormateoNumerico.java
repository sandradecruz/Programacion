/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author sandr
 */
public class EjemploFormateoNumerico {
    public static void main(String[] args) {
//        //formateo con number fortmat
//        double num1=0.0123;
//        double num2=123456.89;
//        
//        NumberFormat nf1=NumberFormat.getInstance();
//        nf1.setMaximumFractionDigits(1);
//        
//        System.out.println(nf1.format(num1));
//        System.out.println(nf1.format(num2));
//        
//        
//        NumberFormat nf2=NumberFormat.getCurrencyInstance();
//        nf2.setMaximumFractionDigits(2);
//        
//        System.out.println(nf2.format(num1));
//        System.out.println(nf2.format(num2));
//    
//        System.out.println(NumberFormat.getPercentInstance().format(num1));
        
        
        //foramteo con DecimalFormat-->Pattern
        double num3=999888777.654;
        double num4=.123;
        double num5=12.56;
        double num6=-456.70;
        
        DecimalFormat df3=new DecimalFormat();
        df3.applyPattern("#,###.0;(#,###.00");
        
        System.out.println(df3.format(num3));
        System.out.println(df3.format(num4));
        System.out.println(df3.format(num5));
        System.out.println(df3.format(num6));
        
        
        //formateo con marcador posicional
//        String.format
    }
}
