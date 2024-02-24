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
public class PrimeiraQuestão {
    public static void main(String[] args) {
        String nome;
        double nota1,nota2,nota3,media,Final,recup;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do/da aluno/aluna:");
         nome=teclado.next();
        System.out.println("Digite a nota da primeira prova:");
         nota1=teclado.nextDouble();
        System.out.println("Digite a nota da segunda prova:");
        nota2=teclado.nextDouble();
        System.out.println("Digite a nota da terceira prova:");
        nota3=teclado.nextDouble();
        media=(nota1 + nota2 + nota3) / 3;
        System.out.println("A média de "+ nome + " é: " + media);
        if (media >= 7.0) {
            System.out.println(nome+" foi aprovado/a");
        } 
        else {
            System.out.println("------------------------------------------\n"+nome+" foi reprovado/a");
            System.out.println("Digite a nota da recuperação:");
          recup=teclado.nextDouble();
            Final=(media+recup)/2;
            if (Final>=5.0){
                System.out.println(nome+" foi aprovado/a");
            }
            else{
            System.out.println(nome+" foi reprovado/a");
        }


        }
    }
    


}
