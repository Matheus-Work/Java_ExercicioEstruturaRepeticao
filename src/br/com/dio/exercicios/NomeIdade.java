package br.com.dio.exercicios;

import java.util.Scanner;
/*
Faça um algoritmo que leia nomes e idades e
quando o valor de nome for igual a 0, pare o programa!
 */
public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        while (true) {
            System.out.println("Informe seu nome");
            nome = scan.next();
            if (nome.equals("0")){break;}
            System.out.println("Informe sua idade");
            idade = scan.nextInt();
        }
    }
}
