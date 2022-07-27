package br.com.dio.exercicios;
import java.util.Scanner;
/*
Faça um algoritmo que ao digite 5 valores, calcule
e mostre qual foi a média desses valores,
e qual foi o maior valor digitado!
*/
public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       double valor, media, contador =0, maior=0;
       for(int i = 1; i<=5; i++){
           System.out.println("Insira o valor: ");
           valor = scan.nextDouble();
           contador = contador + valor;
           if(valor>maior){
               maior = valor;
           }
       }
       media = contador/5;
        System.out.println("A media desses valores é: " + media);
        System.out.println("E o maior valor que você inseriu foi: " + maior);
    }
}