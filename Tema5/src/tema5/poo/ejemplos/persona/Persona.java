/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.poo.ejemplos.persona;

/**
 *
 * @author sandr
 * 
 * Clase que representa las personas de mi aplicacion
 * 
 */
public class Persona {
    
    //atributos--> estado
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean fumador;
    private double altura; //en metros
    
    
    
    //metodos--> comportamiento
    
    //getter
    public String getDni(){
        return dni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public boolean getFumador(){
    return fumador;
    }
    
    public double getAltura(){
        return altura;
    }
    
    //setter
    public void setDni(String dni){
        this.dni=dni;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setAltura(double altura){
        this.altura=altura;
    }
    
    public void setFumador(boolean fumador){
        this.fumador=fumador;
    }
    
    
    public String mostrar(){
        String mensaje="";
        mensaje+=("DNI: "+getDni());
        mensaje+=("Nombre: "+getNombre());
        mensaje+=("Apellidos: "+getApellidos());
        mensaje+=("Edad: "+getEdad());
        mensaje+=("Fumador: "+getFumador());
        mensaje+=("Altura: "+getAltura());
        
        return mensaje;
    }
}
