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
public class Vocales {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Escriba una letra:");
        char letra= sc. next().toLowerCase(). charAt(0);
        switch(letra){
            case 'a':
                System.out.println("Es una vocal");
                break;
            
            case 'e':
                System.out.println("Es una vocal");
                break;
            
            case 'i':
                System.out.println("Es una vocal");
                break;
             case 'o':
                System.out.println("Es una vocal");
                break;
             case 'u':
                System.out.println("Es una vocal");
             break;
             default:
                 System.out.println("No es una vocal");
            }
        
        
        }
        
        
        
    }
