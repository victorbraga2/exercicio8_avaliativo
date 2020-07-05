/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8_avaliativo;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Exercicio8_avaliativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner result = new Scanner (System.in);
        double cod, qtd, r, c, s;
         double total;
        System.out.println("Digite o codigo do pedido: ");
         cod = result.nextDouble();
         System.out.println("Digite a quantidade: ");
         qtd = result.nextDouble();
                  
         if (cod == 1)
         {
         total = qtd * 2;
         System.out.println("O total é: "+total);
         }
        else
         {
         if (cod == 2)
         {
         total = qtd * 2.5;
          System.out.println("O total é: "+total);
         
         }
         else 
         {
         if (cod == 3)
         {
         total = qtd * 1.5;
          System.out.println("O total é: "+total);
         }
             
         }
         }
    }
    
}
