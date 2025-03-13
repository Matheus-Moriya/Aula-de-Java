/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package letraanterior;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;

public class LetraAnterior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        
        
        
        System.out.println("digite uma tecla: ");;
        String letra = userInput.nextLine();
        
        
        if (letra.charAt(0) >= 'b' && letra.charAt(0) <= 'z') {
        System.out.println((char) (letra.charAt(0) - 1));
        
        } else if (letra.equals("a")) {
            System.out.println("z");
            
        }
    }
    
}
