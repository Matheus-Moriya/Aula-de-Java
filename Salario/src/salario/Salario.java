/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salario;


/**
 *
 * @author Aluno CA
 */
public class Salario{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //define nome, salario e vendas
       String nome = "nome";
       float salario = 2000;
       float vendas = 2000;
       
       //calcula salario total       
       System.out.println("Nome: " + nome + "\n" + "salario fixo: " + salario + "\n" + "comissão: " + (vendas/100)*15 + "\n" + "Salario total: " + (salario + (vendas/100)*15));
        
    }
    
}
