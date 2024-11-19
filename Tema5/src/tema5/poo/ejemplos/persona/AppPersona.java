/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.poo.ejemplos.persona;

/**
 *
 * @author sandr
 */
public class AppPersona {
    public static void main(String[] args) {
        Persona p1=new Persona();
        p1.setDni("12345678A");
        p1.setNombre("Pepe");
        
        
        System.out.println(p1.mostrar());
        
        
        
        Persona p2=new Persona();
        p2.setDni("99999999Z");
        p2.setNombre("Maria");
        p2.setApellidos("Martin");
        p2.setFumador(true);
        p2.setEdad(22);
        
        System.out.println(p2.mostrar());
    }
}
