/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generarpassword;

import java.util.Random;

/**
 *
 * @author Walter Galdamez
 */
public class Generador {
    
    int longitudPassword;
    
    public Generador() {
    }

    public Generador(int longitudPassword) {
        this.longitudPassword = longitudPassword;
    }
    
    public char[] generarPassword(int longitudPassword)
    {
            System.out.println("Tu Contraseña : ");
            String numeros = "0123456789";
            String simbolos = "!@#$%^&*_=+-/€.?<>)";
            String letrasMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";            

            String passTemporal = numeros + simbolos + letrasMayusculas + letrasMinusculas ;
            Random aleatorio = new Random();

            char[] password = new char[longitudPassword];
            for (int i = 0; i < longitudPassword; i++) 
            {
                password[i] = passTemporal.charAt(aleatorio.nextInt(passTemporal.length()));

            }
            return password;
    }    
    
}
