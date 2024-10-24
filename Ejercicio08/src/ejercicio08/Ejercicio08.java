/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author utpl
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int variable1 = 10;
        int variable2 = 9;
        int variable3 = 20;
        int variable4 = 500;
        int variable5 = 2;
        int variable6 = 3;
        double resultado = ((variable1* variable2) + variable3 - variable4 / variable5 + Math.pow(variable6, 2));
        
        System.out.println(resultado);
        
        boolean resultado2 = resultado >= 200;
        
        System.out.println(resultado2);
        
        int variable7 = 50;
        int variable8 = 51;
        boolean variable9 = 50 >= variable7 - variable7 + variable8;
        
        System.out.println(variable9);
        
        boolean resultado3 = resultado2 || variable9;
        
        System.out.println(resultado3);
               
               
    }
    
}
