package Exercicio03;

public class NumeroDescrescente {

    public static void imprimirDecrescente(int numeroEntrada){

        System.out.println("Numero entrada: " + numeroEntrada);

        for (int posicao = numeroEntrada; posicao >= 0; posicao--){

            System.out.println("Numero: " + posicao);

        }

    }

}
