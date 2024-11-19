/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.Ejercicios;
import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Frase {
    //Programa que dada una frase introducida por el usuario, alterne mays. por minus. y viceversa,
    //diga cuantas vocales tiene y si el tama�o de la frase es par o impar y que cifre la frase aplicando
    //el algoritmo cesar con un desplazamiento variable.
    
    public int vocales(String fraseUsuario){
        int vocales=0;
        for(int i=0;i<fraseUsuario.length();i++){
            switch(Character.toLowerCase(fraseUsuario.charAt(i))){
                case 'a':
                    vocales++;
                    break;
                case 'e':
                    vocales++;
                    break;
                case 'i':
                    vocales++;
                    break;
                 case 'o':
                    vocales++;
                    break;
                 case 'u':
                    vocales++;
                    break;
            }
        }
        return vocales;
    }
    
    public String mayusMinus (String fraseUsuario){
        String fraseInvertida="";
        for(int i=0;i<fraseUsuario.length();i++){
            if(Character.isLowerCase(fraseUsuario.charAt(i))){
                fraseInvertida=fraseInvertida+Character.toUpperCase(fraseUsuario.charAt(i));
            }else if(Character.isUpperCase(fraseUsuario.charAt(i))){
                fraseInvertida=fraseInvertida+Character.toLowerCase(fraseUsuario.charAt(i));
            }else if(Character.isSpaceChar(fraseUsuario.charAt(i))){
                fraseInvertida= fraseInvertida+" ";
            }
        }
        return fraseInvertida;
    }
    
    public boolean esPar (String fraseUsuario){
        return (fraseUsuario.length()%2==0);
    }
    
    public String cifradoCesar (String fraseUsuario, int desplazamiento){
        
        String encriptado = "";
        for (int i = 0; i < fraseUsuario.length(); i++) {
            char caracActual = fraseUsuario.charAt(i);
            int codigoASCII = (int) caracActual;
            int codigoDesplazado = codigoASCII + desplazamiento;
            
            if(codigoDesplazado>255){
                codigoDesplazado= codigoDesplazado-256;   
            }
            encriptado = encriptado + (char) codigoDesplazado;
        }
        return encriptado;
    }
    
    public static void main(String[] args) {
        Frase app=new Frase();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Escriba una frase:");
        String fraseUsuario=sc.nextLine();
        
        System.out.println("Escriba la clave numerica, que sera el desplazamiento para el cifrado:");
        int desplazamiento =sc.nextInt();
        
        //Llamamos al metodo de invertir la frase
        System.out.println("Frase invertida: "+app.mayusMinus(fraseUsuario));

        //Llamamos al metodo de contar vocales
        System.out.println("Numero de vocales: "+app.vocales(fraseUsuario));
        
        //Llamamos al metodo de par o impar
        if(app.esPar(fraseUsuario)){
            System.out.println("La frase es par");
        }else{
            System.out.println("La frase es impar");
        }
        //Llamamos al metodo de cifrado Cesar
        System.out.println("Frase cifrada: "+app.cifradoCesar(fraseUsuario,desplazamiento));
    }
}