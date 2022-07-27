package br.com.dio.exercicios;
import java.util.Scanner;
/*
Faça um algoritmo que recebe N numeros inteiros e mostra quantos
números são pares e quantos números são ímpares!
*/
public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor, numeroPar=0, numeroImpar=0, flag;
        do{
            System.out.println("Insira um valor");
            valor = scan.nextInt();
            if(valor%2==0){
                numeroPar = numeroPar + 1;
            }
            if(valor%2!=0){
                numeroImpar = numeroImpar + 1;
            }
            System.out.println("Deseja continuar?\n1 - Para Sim\n2 - Para Não");
            flag = scan.nextInt();

        }while(flag!=2);
        System.out.println("Você digitou "+numeroPar+" numeros pares\nE digitou "+numeroImpar+" numeros ímpares");
    }
}
