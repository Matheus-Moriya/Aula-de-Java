/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diasvivido;

/**
 *
 * @author Aluno CA
 */

import java.util.Scanner;

public class Diasvivido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //define um novo scanner que recebe a entrada do susario
        Scanner userInput = new Scanner(System.in);
        
        //valores para calcular a data de nascimento em dias
        int dias, meses, ano;
        
        //data de nascimento do usuario
        System.out.println("Anos: ");
        ano = userInput.nextInt();
        
        System.out.println("meses: ");
        meses = userInput.nextInt();
        
        System.out.println("dias: ");
        dias = userInput.nextInt();
        
        //dias vivido da pessoa  
        System.out.println("Dias vivido: "+((ano*365)+(meses*30)+dias));
        
        
        
    }
    
}
