package Exercicio01;

import java.util.Scanner;

public class Exercicio01 {

//1. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o
//seu antecessor e seu sucessor.

    public static void main(String[] args) {

        int umNumero = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        umNumero = scanner.nextInt();

        retornarSucessorAntecessor(umNumero);

    }


    public static void retornarSucessorAntecessor(int numeroEntrada){

        System.out.println("Antecessor: " + (numeroEntrada - 1));
        System.out.println("Sucessor: " + (numeroEntrada + 1));

    }

}
