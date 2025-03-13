/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revendadecarros;

/**
 *
 * @author Matheus
 */
public class RevendaDeCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //define o salario do vendedor
        float salarioFixo = 4500;
        float comissao = 200;
        float carroVendido = 70000;
        
        //salario total do vendedor
        System.out.println("Salario total; " + (salarioFixo + comissao + ((carroVendido / 100) * 5)));
    }
    
}
