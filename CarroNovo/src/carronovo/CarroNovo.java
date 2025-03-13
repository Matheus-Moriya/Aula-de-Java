/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carronovo;

/**
 *
 * @author Matheus
 */
public class CarroNovo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //custo de produção do carro
        float custoDaFabrica = 40000;
        
        //preço final ao consumidor
        System.out.println("Preço final ao consumidor: " + (custoDaFabrica + ((custoDaFabrica/100) * 28) + ((custoDaFabrica/100) * 45)));
    }
    
}
