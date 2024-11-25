/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deCruzSandra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author crutorsa
 */
public class Javito {
    public static Scanner sc=new Scanner(System.in);
    
    //metodo de validacion
    public boolean jugueteValido(String juguete){
        boolean valido=true;
        for(int i=0;i<juguete.length();i++){
            if (Character.isAlphabetic(juguete.charAt(i))){
                valido= true;
            }
            else{
                valido = false;
                System.out.println("Error. Solo debe de haber letras. Intentelo de nuevo");
                System.out.println();
                break; //Salimos del bucle porque ya hay un caracter erroneo
            }
        }
        return valido;
    }
    
    
    
    public static void main(String[] args) {
        Javito  app=new Javito();
        
        Random rd=new Random();
        //Validacion do while para mas tarde
        boolean valido;
        String juguete;
        do{
            System.out.print("Javito, que juguete se te ha perdido? ");
            juguete=sc.next();
            valido=app.jugueteValido(juguete); //Llamamos al metodo de validacion.
         }while(!valido);
        
        //Hallamos los pasos a los que se encuentra el juguete
        int pasosFinal=0;
        
        //Hallamos los pasos que Javito ha de realizar
        for(int i=0;i<juguete.length();i++){
            int caracter=juguete.charAt(i);
            pasosFinal=pasosFinal+caracter;
        }
        System.out.println("El juguete esta a "+pasosFinal+" pasos.");
        
        int pasosJavito=0;
        int errores=0;
        int aciertos=0;
        
        do{
            //Decidimos el que operacion se va a hacer.
            int operacionRandom=rd.nextInt(3)+1;

            //Generamos los numeros aleatorios para la operacion.
            int num1=rd.nextInt(10)+1;
            int num2=rd.nextInt(10)+1;

            switch (operacionRandom) {
                case 1: //Sumamos en el caso 1.
                    {
                        System.out.println("Responde...");
                        System.out.print(">"+num1+"+"+num2+"= ");
                        int solucion=sc.nextInt();
                        int operacion=num1+num2;
                        if(solucion==operacion){ //En caso de que Javito acierte
                            System.out.println("Correcto.");
                            pasosJavito= pasosJavito+50;
                            aciertos++;
                            System.out.println("(Pasos Javito: "+pasosJavito+")");
                        }else{
                            System.out.println("Incorrecto.");
                            errores++;
                            if(pasosJavito<50){ //En caso de que Javito falle
                                pasosJavito=0;
                                System.out.println("(Pasos Javito: 0)"); //Evitamos los pasos negativos
                            }else{
                                pasosJavito=pasosJavito-50;
                                System.out.println("(Pasos Javito: "+pasosJavito+")");
                            }
                        }       break;
                    }
                case 2: //Restamos en el caso 2.
                    {
                        System.out.println("Responde...");
                        System.out.print(">"+num1+"-"+num2+"= ");
                        int solucion=sc.nextInt();
                        int operacion=num1-num2;
                        if(solucion==operacion){ //En caso de que Javito acierte
                            System.out.println("Correcto.");
                            pasosJavito= pasosJavito+50;
                            aciertos++;
                            System.out.println("(Pasos Javito: "+pasosJavito+")");
                        }else{ //En caso de que Javito falle
                            System.out.println("Incorrecto.");
                            errores++;
                            if(pasosJavito<50){ //Evitamos los pasos negativos
                                pasosJavito=0;
                                System.out.println("(Pasos Javito: 0)"); 
                            }else{
                                pasosJavito=pasosJavito-50;
                                System.out.println("(Pasos Javito: "+pasosJavito+")");
                            }
                        }       break;
                    }
                case 3: //Multiplicamos en el caso 3.
                    {
                        System.out.println("Responde...");
                        System.out.print(">"+num1+"*"+num2+"= ");
                        int solucion=sc.nextInt();
                        int operacion=num1*num2;
                        if(solucion==operacion){ //En caso de que Javito acierte
                            System.out.println("Correcto.");
                            pasosJavito= pasosJavito+50;
                            aciertos++;
                            System.out.println("(Pasos Javito: "+pasosJavito+")");
                        }else{ //En caso de que Javito falle
                            System.out.println("Incorrecto.");
                            errores++;
                            if(pasosJavito<50){ //Evitamos los pasos negativos
                                pasosJavito=0;
                                System.out.println("(Pasos Javito: 0)"); 
                            }else{
                                pasosJavito=pasosJavito-50;
                                System.out.println("(Pasos Javito: "+pasosJavito+")");
                            }
                        }       break;
                    }
                default:
                    break;
            }
            System.out.println();
            if(pasosJavito>=pasosFinal){ //Javito ha llegado al final
                System.out.print("Yuju! Mi "+juguete+".");
                System.out.print(" (Javito ha tenido "+aciertos+" aciertos y "+errores+" fallos)");
            }
        }while(pasosJavito<pasosFinal);
    }
}
