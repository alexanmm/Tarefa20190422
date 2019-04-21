package Exercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {

//2. Desenvolva um programa em java que leia o nome e a idade de 3 pessoas
//e mostre o nome da pessoa mais velha e o nome da pessoa mais nova.

    public static void main(String[] args) {

        List<Pessoa> listaPessoas = new ArrayList<>();
        Pessoa joao = new Pessoa("João", 30);
        Pessoa paulo = new Pessoa("Paulo", 15);
        Pessoa pedro = new Pessoa("Pedro", 13);

        listaPessoas.add(joao);
        listaPessoas.add(paulo);
        listaPessoas.add(pedro);


        //Retorna o nome da pessoa mais velha
        String pessoaMaisVelha = "";
        int idadePessoaMaisVelha = 0;

        for (Pessoa linha : listaPessoas) {
            if (linha.getIdade() > idadePessoaMaisVelha) {
                idadePessoaMaisVelha = linha.getIdade();
                pessoaMaisVelha = linha.getNome();
            }
        }

        System.out.println(
                "Nome da pessoa mais velha: " + pessoaMaisVelha +
                        ", " + idadePessoaMaisVelha + " anos"
        );

    }

}
