/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generarpassword;
/**
 *
 * @author Walter Galdamez
 */
public class GenerarPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Generador Pass = new Generador();
        int longitud = 25;
        System.out.println(Pass.generarPassword(longitud));
        }
}