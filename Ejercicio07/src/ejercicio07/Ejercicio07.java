/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author utpl
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int valor1 = 81;
        int valor2 = 9;
        int valor3 = 3;
        double resultado = ((Math.sqrt(valor1) + valor2) / valor3);
        System.out.println(resultado);
        
        boolean valor4 = resultado == 9;
        
        System.out.println(valor4);
        
        boolean valor5 = 10>1;
        
        System.out.println(valor5);
        
        boolean valor6 = valor4 || valor5;
       
        System.out.println(valor6);
        
        int valor7 = 100;
        int valor8 = 25;
        int valor9 = 100;
        boolean resultado2 = valor7 / valor8 >= Math.sqrt(valor9);
        
        System.out.println(resultado2);
        
        boolean resultado3 = valor6 && resultado2;
        
        System.out.println(resultado3);
        
        
    }
    
}
