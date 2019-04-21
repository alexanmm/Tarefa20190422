package Exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    //Atributos
    private String nome;
    private List<Funcionario> listaFuncionarios = new ArrayList<>();

    //Construtor
    public Departamento() {
    }

    public Departamento(String nome) {
        this.nome = nome;
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    //Adicionar Funcionario
    public void adicionarFuncionario(Funcionario funcionario){

        listaFuncionarios.add(funcionario);

    }

    //Remover Funcionario
    public void removerFuncionario(Funcionario funcionario){

        listaFuncionarios.remove(funcionario);

    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", listaFuncionarios=" + listaFuncionarios +
                '}';
    }
}
