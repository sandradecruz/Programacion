/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos;

/**
 *
 * @author sandr
 */
public class EjemploString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //comparacion de cadenas
        String s1="abejorro";
        String s2="abeja";
        
        int resultado= s2.compareToIgnoreCase(s1); //devuelve numeros 0 si son iguales, <0 o >0
        System.out.println(resultado);
        
        System.out.println(s1.equals(s2));
        System.out.println("Hola".equals("Hola"));
        
        System.out.println("hola"+"adios"+"que pasa");
        System.out.println("hola".concat("adios").concat("que pasa"));
        
        
        //busqueda en cadena
        String s3="Desarrollo de Aplicaciones Multiplataforma";
        
        System.out.println(s3.contains("Aplicaciones"));
        System.out.println(s3.indexOf("Aplicaciones"));
        
        //busca todas las concurrencias de 'a' que haya en s3
        int pos=-1; //posicion a partir de la cual vamos a buscar
        do{
            pos=s3.indexOf("a",pos+1);
            System.out.println("letra a en la posicion: "+pos+" ");
        }while(pos !=-1);   
    }
    
}
