package Exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    //Atributos
    private String nome;
    private String cnpj;
    private List<Departamento> listaDepartamento = new ArrayList<>();

    //Construtor
    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Departamento> getListaDepartamento() {
        return listaDepartamento;
    }

    public void setListaDepartamento(List<Departamento> listaDepartamento) {
        this.listaDepartamento = listaDepartamento;
    }

    //Adicionar departamento
    public void adicionarDepartamento(Departamento departamentoEntrada) {

        listaDepartamento.add(departamentoEntrada);

    }

    //Adicionar Funcionario ao Departamento
    public void adicionarFuncionario(String nomeDepartamento, Funcionario funcionario) {

        Departamento departamento = new Departamento();

        departamento = getDepartamento(nomeDepartamento);
        departamento.adicionarFuncionario(funcionario);

    }

    //Transferir funcionário para outro departamento
    public void transferirFuncionario(String nomeDepartamentoAntigo,
                                      String nomeNovoDepartamento,
                                      Funcionario funcionario) {

        Departamento departamentoAntigo = new Departamento();
        Departamento departamentoNovo = new Departamento();

        //Remover o funcionário ao departamento antigo
        departamentoAntigo = getDepartamento(nomeDepartamentoAntigo);
        departamentoAntigo.removerFuncionario(funcionario);

        //Adicionar o funcionário ao novo departamento
        departamentoNovo = getDepartamento(nomeNovoDepartamento);
        departamentoNovo.adicionarFuncionario(funcionario);

    }

    //Buscar dados do departamento
    public Departamento getDepartamento(String nomeDepartamento) {

        for (Departamento linha : listaDepartamento) {

            if (linha.getNome().equals(nomeDepartamento)) {
                return linha;
            }
        }

        return null;

    }

    //Imprimir lista de funcionarios
    public void imprimirListaFuncionarios(){

        //Lista de Departamentos
        for (Departamento linhaDepartamento: listaDepartamento){

            System.out.println("-> " + linhaDepartamento.getNome());

            //Lista de Funcionarios do departamento
            for (Funcionario linhaFuncionario: linhaDepartamento.getListaFuncionarios()){

                System.out.println(linhaFuncionario.toString());

            }

        }


    }


}
