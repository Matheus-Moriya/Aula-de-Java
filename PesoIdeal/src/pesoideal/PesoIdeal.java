/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pesoideal;

/**
 *
 * @author Matheus
 */

import java.util.Scanner;

public class PesoIdeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //define o scanner que recebe a entrada do usuario
        Scanner userInput = new Scanner(System.in);
        
        
        //sexo e altura da pessoa
        String sexo;
        System.out.println("Sexo: ");
        sexo = userInput.nextLine();
        
        float altura;
        System.out.println("Altura: ");
        altura = userInput.nextFloat();
        
        
        //calcula peso ideal da pessoa
        if (sexo == "M"){
            System.out.println("peso ideal: "+"\n");
            System.out.println((72.7 * altura) - 58);
            
        } else if (sexo == "F"){
            System.out.println("peso ideal: "+"\n");
            System.out.println((62.1 * altura) - 44.7);
            
        }
        
    }
    
}
