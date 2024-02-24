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
public class TerceiraQuestão {
    
public static void main(String[] args) {
   
        Scanner scanner=new Scanner(System.in);
        System.out.println("No primeiro intervalo de tempo, informe somente as \nHoras:  ");
        int primeirahora=scanner.nextInt();
        System.out.println("\nAgora, informe somente os \nMinutos:  ") ;   
         int primeirominuto=scanner.nextInt();
         System.out.println("\nE por ultimo, informe somente os \nSegundos:  ") ; 
         int primeirosegundo=scanner.nextInt();
         
         System.out.println("-----------------------------------------------------");
        System.out.println("No segundo intervalo de tempo, informe somente as \nHoras: ");
         int segundahora=scanner.nextInt();
         System.out.println("\nAgora, informe somente os \nMinutos: ");
         int segundominuto=scanner.nextInt();
         System.out.println("\nE por ultimo, informe somente os \nSegundo: ");
         int segundosegundo=scanner.nextInt();
         
         int ph=primeirahora*3600;
         int pm=primeirominuto*60;
         int sh=segundahora*3600;
         int sm=segundominuto*60;
         
         int somahoras=ph+sh;
         int somaminutos=pm+sm;
         int somasegundos=primeirosegundo+segundosegundo;
         
         int diferencahoras=sh-ph;
         int diferencaminutos=sm-pm;
         int diferencasegundos=segundosegundo-primeirosegundo;
          
         int somah=somahoras/3600;
         int somamin=somaminutos/60;
         int difh=diferencahoras/3600;
         int difmin=diferencaminutos/60;
         
         if(somasegundos>=60){
            somasegundos-=60;
            somamin+=1;
        }
        if(somamin>=60){
            somamin-=60;
            somah+=1;
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("A soma dos intervalos é: ");
        System.out.printf("%02d:%02d:%02d\n", somah, somamin, somasegundos);
         
        if(diferencasegundos<0){
            diferencasegundos+=60;
            difmin-=1;
        }
        if(difmin<0){
            difmin+=60;
            difh-=1;
        }
        if(difh<0){
            difh+=24;
            
        }
         
        System.out.println("-----------------------------------------------------");
         System.out.println("A diferência dos intervalos é:" );
         System.out.printf("%02d:%02d:%02d\n", difh, difmin, diferencasegundos);
}
}
    
