/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author jorge
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int variable1 = 25;
        int variable2 = 10;
        double resultado = Math.sqrt(variable1) * variable2;
        
        System.out.println(resultado);
        
        boolean resultado2 = resultado >= 100;
        
        System.out.println(resultado2);
        
        boolean variable3 = resultado2 && true;
        
         System.out.println( variable3);
         
         boolean variable4 = variable3 || false;
         
         System.out.println(variable4);
         
         boolean resultadoFinal = variable4 || (10 / 5 >= 2);
         
         System.out.println(resultadoFinal);
         
                
         
                
    }
    
}
