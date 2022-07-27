package br.com.dio.exercicios;
import java.util.Scanner;
/*
Desenvolva um gerador de tabuada
Capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuario deve informar de qual número ele deseja e receber a tabuada
 */
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor;
        System.out.println("Voce deseja receber a tabuada de qual número?");
        valor = scan.nextInt();
        while(valor<0||valor>10){
            System.out.println("Voce deseja receber a tabuada de qual número\nDigite um valor certo?");
            valor = scan.nextInt();
        }
        for(int i= 1; i <=10; i++){
            System.out.println(valor + " X " + i + " = " + (valor*i));
        }
    }
}
