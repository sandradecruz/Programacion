/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5.Ejercicios.Practica1;


import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class deCruz_Tordable_Sandra {
    public static Scanner sc=new Scanner(System.in);
    public static Random random = new Random();
    public static SecureRandom sr=new SecureRandom();
    
    //Metodo de la creacion del usuario.
    public String crearUsuario(String nombre, String apellido1, String apellido2){
        String usuario="";
        
        for(int i=0;i<2;i++){
            usuario=usuario+Character.toLowerCase(apellido2.charAt(i));
        }
        
        for(int i=0;i<2;i++){
            usuario=usuario+Character.toLowerCase(apellido1.charAt(i));
        }
        
        for(int i=0;i<3;i++){
            usuario=usuario+Character.toLowerCase(nombre.charAt(i));
        }
        
        return usuario;
    }

    //Metodo de validacion para el nombre, apellido 1 y apellido 2.
    public boolean esValido(String campo){
    
        if (campo.isEmpty()) {
            System.out.println("El campo no puede estar vacío. Inténtelo de nuevo.");
            return false;
        } else if (campo.matches(".*\\d.*")) { // Contiene números
            System.out.println("El campo no puede contener números. Inténtelo de nuevo.");
            return false;
        } else if (campo.length() < 3) { // Menor que 3 caracteres
            System.out.println("El campo tiene que tener como mínimo 3 letras. Inténtelo de nuevo.");
            return false;
        } else if (contieneCaracteresEspeciales(campo)) { // Contiene caracteres especiales
            System.out.println("El campo no puede contener caracteres especiales. Inténtelo de nuevo.");
            return false;
        }
        return true;
    }
    
    //(1)Metodo de la contraseña mediante metodos mecanicos.
    public String contrasenaMecanica (){
        String contrasenaMecanica="";
        
        //Recreamos la tabla de caracteres
        String fila1="abcdef";
        String fila2="ghijkl";
        String fila3="mnopqr";
        String fila4="mnopqr";
        String fila5="stuvwx";
        String fila6="yz0123";
        String fila7="456789";

        int longitudContrasena1 = random.nextInt(5) + 4;
        String caracter="";
        for (int i = 0; i < longitudContrasena1; i++) {
            int fila = random.nextInt(7)+1;
            switch(fila){
                case 1 -> caracter = String.valueOf(fila1.charAt(random.nextInt(fila1.length())));
                case 2 -> caracter = String.valueOf(fila2.charAt(random.nextInt(fila2.length())));
                case 3 -> caracter = String.valueOf(fila3.charAt(random.nextInt(fila3.length())));
                case 4 -> caracter = String.valueOf(fila4.charAt(random.nextInt(fila4.length())));
                case 5 -> caracter = String.valueOf(fila5.charAt(random.nextInt(fila5.length())));
                case 6 -> caracter = String.valueOf(fila6.charAt(random.nextInt(fila6.length())));
                case 7 -> caracter = String.valueOf(fila7.charAt(random.nextInt(fila7.length())));
            }
            
            char charFinal = caracter.charAt(0); //Convertimos a char  para utilizarlo sin problemas.
            
            //Lanzamiento de moneda para la elección final del caracter.
            if (Character.isLetter(charFinal)) { //En caso de que sea una letra
                if (random.nextBoolean()) {
                    charFinal = Character.toUpperCase(charFinal);
                }
            }else{ //En caso de que sea un digito
                if (random.nextBoolean()) { 
                    switch (charFinal) {
                        case '0' -> charFinal = '=';
                        case '1' -> charFinal = '!';
                        case '2' -> charFinal = '@';
                        case '3' -> charFinal = '#';
                        case '4' -> charFinal = '$';
                        case '5' -> charFinal = '%';
                        case '6' -> charFinal = '&';
                        case '7' -> charFinal = '/';
                        case '8' -> charFinal = '(';
                        case '9' -> charFinal = ')';
                        default -> {
                        }
                    }
                }
            }
            contrasenaMecanica=contrasenaMecanica + charFinal;
        }
        //Devolvemos la contraseña resultante.
        return contrasenaMecanica;
    }
    
    //(2)Metodo de la contraseña mediante algoritmos.
    public String contrasenaAlgoritmo (){
        String contrasenaAlgoritmo="";
        String caracteres="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%/&()="; //Todos los caracteres validos para generar la contraseña
        int longitudContrasena2 = random.nextInt(5) + 4; //Generamos la longitud de contraseña aleatoria entre 4 y 8.
        
        for (int i = 0; i < longitudContrasena2; i++) {
            // Seleccionamos un indice aleatorio de la cadena de caracteres.
            int indiceAleatorio = sr.nextInt(caracteres.length());
            contrasenaAlgoritmo =contrasenaAlgoritmo + caracteres.charAt(indiceAleatorio);
        }
        //Devolvemos la contraseña resultante. 
        return contrasenaAlgoritmo;
    }   
    
    //(3)Metodo de la contraseña mediante la idea propuesta. 
    public String contrasenaIdea (String nombre, String apellido1, String numdni, String fechaNacimiento){
        String contrasenaIdea="";
        
        
        //Creamos un aleatorio que indique la longitud de la contraseña.
        int longitudContrasena3=random.nextInt(5) + 4; 
        int indice=0;
        while(indice<longitudContrasena3){
            //Hallamos la letra del DNI.
            int numeros=Integer.parseInt(numdni);
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int resto = numeros % 23;
            char letra=letras.charAt(resto);

            //Primera letra del nombre en mayúsculas.
            if (indice < longitudContrasena3) {
                contrasenaIdea=contrasenaIdea+Character.toUpperCase(nombre.charAt(0));
                indice++;
            }
            
            //Última letra del primer apellido en minúsculas.
            if (indice < longitudContrasena3) {
                int ultimaLetra=apellido1.length()-1;
                contrasenaIdea=contrasenaIdea+Character.toLowerCase(apellido1.charAt(ultimaLetra));
                indice++;
            }    
     
            //Dos últimas cifras del DNI.
            if (indice < longitudContrasena3) {
                for(int i=6;i<8 && indice < longitudContrasena3;i++){
                    contrasenaIdea=contrasenaIdea+numdni.charAt(i);
                indice++;    
                }
            }
            //Letra de dígito de control del DNI en mayúsculas.
            if (indice < longitudContrasena3) {
                contrasenaIdea=contrasenaIdea+letra;
                indice++;
            }
            
            //Dos últimas cifras del año de nacimiento.
            if (indice < longitudContrasena3) {
                for(int a=8;a<10 && indice < longitudContrasena3;a++){
                    contrasenaIdea=contrasenaIdea+fechaNacimiento.charAt(a);
                    indice++;
                }
            }
            
            //Símbolo aleatorio de entre los que aparecen en un teclado estándar encima de los números (0-9). 
            String simbolos = "!@#$%/&()="; //String de los simbolos del 0 al 9.
            if (indice < longitudContrasena3) {
                int indiceAleatorio = random.nextInt(simbolos.length()); //Solicitamos un numero random correspondiente a la longitud de la cadena.
                char simboloAleatorio = simbolos.charAt(indiceAleatorio); 
                contrasenaIdea=contrasenaIdea+simboloAleatorio;
                indice++;
            }
        }
        //Devolvemos la contraseña final.
        return contrasenaIdea;
    }
    
    
    //Comprobamos si la contraseña resultante tiene caracteres especiales.
    public boolean contieneCaracteresEspeciales(String contrasena) {
        String caracteresEspeciales = "!@#$%/&()=-_.*";
        for (int i = 0; i < contrasena.length(); i++) {
        if (caracteresEspeciales.contains(String.valueOf(contrasena.charAt(i)))) {
            return true;
        }
    }
    return false;
    }

    //Metodo para comprobar si la contrasena contiene mayusculas
    public boolean contieneMayusculas(String contrasena) {
        for (int i = 0; i < contrasena.length(); i++) {
        if (Character.isUpperCase(contrasena.charAt(i))) {
            return true;
        }
    }
    return false;
    }
    
    //Metodo para comprobar si la contrasena contiene minusculas
    public boolean contieneMinusculas(String contrasena) {
        for (int i = 0; i < contrasena.length(); i++) {
        if (Character.isLowerCase(contrasena.charAt(i))) {
            return true;
        }
    }
    return false;
    }
    
    //Metodo para comprobar si la contrasena contiene digitos
    public boolean contieneDigitos(String contrasena) {
        String digitos = "1234567890";
        for (int i = 0; i < contrasena.length(); i++) {
        if (digitos.contains(String.valueOf(contrasena.charAt(i)))) {
            return true;
        }
    }
    return false;
    }
    
    //Metodo para identificar que tan segura es la contraseña.
    public String esSegura(String contrasena){
        //Color de as letras.
        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String AMARILLO = "\u001B[33m";
        String VERDE = "\u001B[32m";
        
        String seguridad;
        if(contrasena.length()<6){
            seguridad=ROJO+"poco segura"+RESET;
        }else if(contrasena.length()>=6 && contieneCaracteresEspeciales(contrasena) 
                && contieneMayusculas(contrasena) && contieneDigitos(contrasena) && contieneMinusculas(contrasena)){
            seguridad=VERDE+"muy segura"+RESET;
        }else{
            seguridad=AMARILLO+"segura"+RESET;
        }
        return seguridad;
    }

    public static void main(String[] args) {
        deCruz_Tordable_Sandra app=new deCruz_Tordable_Sandra();
        
        String nombre;
        String apellido1;
        String apellido2;
        String numdni;
        String fechaEntrada;
        
        boolean valido; //Variable para ayudarnos con la validacion
        do{ //Validamos nombre
            System.out.println("Escriba su nombre:");
            nombre=sc.nextLine().trim();
            valido=app.esValido(nombre);                    
        }while(!valido);
        
        do { //Validamos primer apellido
            System.out.println("Escriba su primer apellido:");
            apellido1 = sc.nextLine().trim();
            valido = app.esValido(apellido1);
        } while (!valido);
        
        do { //Validamos segundo apellido
            System.out.println("Escriba su segundo apellido:");
            apellido2 = sc.nextLine().trim();
            valido = app.esValido(apellido2);
        } while (!valido);
        
        do{ //Validamos dni
            System.out.println("Escriba su DNI sin incluir la letra:");
            numdni=sc.nextLine().trim();
                if (numdni.matches("\\d{8}")) {
                    valido=true; // Si cumple el formato
                }else if (app.contieneCaracteresEspeciales(nombre)) { 
                    System.out.println("El DNI no puede contener caracteres especiales. Intentelo de nuevo.");
                    valido=false;
                }else{
                    System.out.println("El DNI debe contener 8 dígitos. Intentelo de nuevo.");
                    valido=false;
                }
        } while (!valido);
        
        LocalDate fechaNacimiento;
        do{ //Validamos fecha
            System.out.println("Escriba su fecha de nacimiento (dd/mm/aaaa):");
            fechaEntrada=sc.nextLine().trim();
            try {
                //Formateo para que la fecha este escrita correctamente
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                fechaNacimiento = LocalDate.parse(fechaEntrada, dtf);

                //Verificamos que la fecha es anterior a la actual
                if (fechaNacimiento.isBefore(LocalDate.now())) {
                    valido = true;
                } else {
                    System.out.println("La fecha de nacimiento debe ser anterior a la fecha actual. Intentelo de nuevo.");
                    valido = false;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Formato de fecha invalido. Por favor, use el formato dd/mm/aaaa. Intentelo de nuevo.");
                valido = false;
            }
        } while (!valido);

        String contrasena1=app.contrasenaMecanica();
        String contrasena2=app.contrasenaAlgoritmo();
        String contrasena3=app.contrasenaIdea(nombre, apellido1, numdni, fechaEntrada);
 
        System.out.println("----------------");
        
        //Llamamos al metodo de la creacion del usuario.
        System.out.println("Su usuario es: "+app.crearUsuario(nombre, apellido1, apellido2));
        
        
        //Mostramos la primera contraseña
            System.out.println("La primera contraseña generada es: "+contrasena1+" y es "+app.esSegura(contrasena1)+".");

        //Mostramos la segunda contraseña
            System.out.println("La segunda contraseña generada es: "+contrasena2+" y es "+app.esSegura(contrasena2)+".");
        
        //Mostramos la tercera contraseña
            System.out.println("La tercera contraseña generada es: "+contrasena3+" y es "+app.esSegura(contrasena3)+".");
        
        System.out.println("----------------");
    }
}
