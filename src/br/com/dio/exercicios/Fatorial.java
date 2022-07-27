package br.com.dio.exercicios;
import java.util.Scanner;
/*
Elabore um algoritmo em que você digita um valor fatorial,
e mostra o resultado
 */
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fatorial, contador=1;
        System.out.println("Informe o valor do fatorial");
        fatorial = scan.nextInt();
        for(int a = fatorial; a>=1; a--){
            contador = contador*a;
        }
        System.out.println(fatorial + "! = " + contador);
    }
}
