package Exercicio04;

public class Exercicio04 {

//4. Crie uma classe que representa um funcionário, registrando seu nome,
//salário e data de admissão. Em seguida, crie uma classe que represente
//um departamento de uma empresa, registrando o nome e os funcionários
//que nele trabalham. Por fim, crie uma classe que representa uma
//empresa, registrando seu nome, CNPJ e departamentos. Faça um
//programa que:
//a. Crie uma empresa;
//b. Adicione a esta empresa alguns departamentos;
//c. Adicione aos departamentos alguns funcionários;
//d. Dê aumento de 10% a todos os funcionários de um determinado
//departamento;
//e. Transfira um funcionário de um departamento para outro.
//Obs: Faça uso de List<>

    public static void main(String[] args) {

        //Inicialização dos dados da Empresa
        Empresa padariaSantaMarcolina = new Empresa("Padaria Santa Marcolina", "21.212.212/0001-01");

        //Inicialização dos dados dos Departamentos
        Departamento comercial = new Departamento("Comercial");
        Departamento compras = new Departamento("Compras");
        Departamento vendas = new Departamento("Vendas");
        Departamento rh = new Departamento("Rh");

        //Inicialização dos dados dos Funcionários
        Data dataAdmissao = new Data(1, 1, 2019);
        Funcionario lucio = new Funcionario("Lucio", 750.00d, dataAdmissao);

        dataAdmissao = new Data(20, 11, 2017);
        Funcionario lucas = new Funcionario("Lucas", 3000.00d, dataAdmissao);

        dataAdmissao = new Data(12, 2, 2006);
        Funcionario jonas = new Funcionario("Jonas", 2500.00d, dataAdmissao);

        dataAdmissao = new Data(1, 5, 2008);
        Funcionario alfredo = new Funcionario("Alfredo", 4500.00d, dataAdmissao);

        dataAdmissao = new Data(4, 3, 2010);
        Funcionario ana = new Funcionario("Ana", 2700.00d, dataAdmissao);

        dataAdmissao = new Data(4, 4, 2010);
        Funcionario lucia = new Funcionario("Lucia", 2400.00d, dataAdmissao);

        dataAdmissao = new Data(7, 8, 2015);
        Funcionario antonio = new Funcionario("Antonio", 5300.00d, dataAdmissao);

        dataAdmissao = new Data(1, 10, 2018);
        Funcionario marcos = new Funcionario("Marcos", 3200.00d, dataAdmissao);

        //Adicionar os departamentos a Empresa
        padariaSantaMarcolina.adicionarDepartamento(comercial);
        padariaSantaMarcolina.adicionarDepartamento(compras);
        padariaSantaMarcolina.adicionarDepartamento(vendas);
        padariaSantaMarcolina.adicionarDepartamento(rh);

        //Adicionar os funcionários aos departamentos da Empresa
        //Comercial
        padariaSantaMarcolina.adicionarFuncionario("Comercial", lucio);
        padariaSantaMarcolina.adicionarFuncionario("Comercial", lucas);

        //Compras
        padariaSantaMarcolina.adicionarFuncionario("Compras", jonas);

        //Vendas
        padariaSantaMarcolina.adicionarFuncionario("Vendas", alfredo);
        padariaSantaMarcolina.adicionarFuncionario("Vendas", antonio);
        padariaSantaMarcolina.adicionarFuncionario("Vendas", marcos);
        padariaSantaMarcolina.adicionarFuncionario("Vendas", ana);

        //RH
        padariaSantaMarcolina.adicionarFuncionario("Rh", lucia);

        //Imprimir Lista de Funcionários por departamento
        padariaSantaMarcolina.imprimirListaFuncionarios();

        //Calcular aumento de salario dos funcionários de um determinado departamento
        String nomeDepartamentoAumento = "Vendas";
        double percentualAumentoSalario = 0.10d;

        System.out.println("Após o aumento de 10% para o Departamento de Vendas");

        //Busca o departamento
        for (Departamento linhaDepartamento: padariaSantaMarcolina.getListaDepartamento()){

            if (linhaDepartamento.getNome().equals(nomeDepartamentoAumento)){

                //Busca a relacao dos Funcionarios
                for (Funcionario linhaFuncionario: linhaDepartamento.getListaFuncionarios()){
                    //Adiciona o percentual de aumento de salario
                    linhaFuncionario.adicionarAumentoFuncionario(percentualAumentoSalario);
                }
            }
        }

        //Imprimir Lista de Funcionários por departamento
        padariaSantaMarcolina.imprimirListaFuncionarios();

        //Transferir funcionario para outro departamento
        System.out.println("Após transferir a Ana para o Departamento de Vendas");
        padariaSantaMarcolina.transferirFuncionario("Vendas", "Rh", ana);

        //Imprimir Lista de Funcionários por departamento
        padariaSantaMarcolina.imprimirListaFuncionarios();

    }
}
