package br.com.dio.exercicios;
import java.util.Scanner;
/*
Faça um algoritmo que receba uma nota,
e se essa nota não estiver entre 0 e 10,
repetir pedindo para inserir uma nota válida!
 */
public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota;
        System.out.println("Informe sua nota: ");
        nota = scan.nextDouble();
        while(nota<0||nota>10){
            System.out.println("Informe uma nota certa (entre 0 e 10): ");
            nota = scan.nextDouble();
        }
    }
}
