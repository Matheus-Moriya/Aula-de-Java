/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumodecombustivel;

/*
 *
 * @author Matheus
 */
import java.util.Scanner;

public class ConsumoDeCombustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        
        //floats para calcular o resultado
        float distancia;
        float consumo;
        float preco;
        
        //receber entrada do ususario e definir as floats
        System.out.println("Distancia a ser percorrida: ");
        distancia = userInput.nextFloat();
        
        System.out.println("Consumo de combustivel do carro em Km/L: ");
        consumo = userInput.nextFloat();
        
        System.out.println("preco do combustivel: ");
        preco = userInput.nextFloat();


        //Preço total de combustivel
        System.out.println((distancia / consumo) * preco);
        
    }
    
}
