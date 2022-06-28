package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, n = 0, numero1, vezes = 0;

        System.out.println("Digite o numero da tabuada: ");
        numero = scan.nextInt();

        while(vezes <=0){
            System.out.println("Digite o numero de vezes: ");
            vezes = scan.nextInt();
        }

        while (n<=vezes) {
            numero1 = numero * n;
            System.out.println(" " + numero + "*" + " " + n + "=" + " " + numero1);
            n = n+1;
        }
    }
}
