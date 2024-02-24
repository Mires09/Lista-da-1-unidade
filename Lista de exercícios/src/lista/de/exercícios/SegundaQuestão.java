/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercícios;

import java.util.Scanner;

/**
 *
 * @author Thamires
 */
public class SegundaQuestão {
    
 public static void main(String[] args) {
        int quant;
        double critérioA,critérioB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de livros que você deseja comprar: ");
        quant=scanner.nextInt();
        critérioA=(0.25*quant)+7.50;
        critérioB=(0.50*quant)+2.50;
        System.out.println("---------------------------------------------\nO custo total para o critério 'A': "+critérioA);
        System.out.println("O Custo total para o critério 'B': "+critérioB);
        if(critérioA<critérioB) {
            System.out.println("A melhor opção de desconto é a do critério 'A'");
        } else 
            if (critérioB<critérioA) {
            System.out.println("A melhor opção de desconto é a do critério 'B'");
        } else {
            System.out.println("Os dois critérios têm o mesmo custo");
        }




    }
    


}
   
