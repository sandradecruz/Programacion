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
public class Minutos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce un numero en segundos: ");
        
        int secT=sc.nextInt() ;
        //Hacemos tres variables para asi poder hacer los calculos correspondientes
        
        //operamos
        int min= secT/60;
        int sec= secT %60; //El % sirve para obtener el resto de la division
        
        //Mostramos el resultado
        System.out.print(secT+"s="+min+"m "+sec+"s");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
