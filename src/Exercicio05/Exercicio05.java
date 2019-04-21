package Exercicio05;

public class Exercicio05 {

//5. Crie a seguinte hierarquia de classes:
//● Uma interface para representar qualquer forma geométrica, definindo
//métodos para cálculo do perímetro e cálculo da área da forma;
//● Uma classe abstrata para representar quadriláteros. Seu construtor deve
//receber os tamanhos dos 4 lados e o método de cálculo do perímetro já
//pode ser implementado;
//● Classes para representar retângulos e quadrados. A primeira deve receber
//o tamanho da base e da altura no construtor, enquanto a segunda deve
//receber apenas o tamanho do lado;
//● Uma classe para representar um círculo. Seu construtor deve receber o
//tamanho do raio.
//No programa principal, crie quadrados, retângulos e círculos com tamanhos
//diferentes e armazene em uma lista. Em seguida, imprima os dados (lados ou
//raio), os perímetros e as áreas de todas as formas.

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(50.10d);
        Retangulo retangulo = new Retangulo(2.55d, 34.2d);
        Circulo circulo = new Circulo(5.67);

        System.out.println("-> Quadrado: Lado = " + quadrado.getTamanhoLado());
        System.out.println("   . Perímetro = " + quadrado.calcularPerimetro());
        System.out.println("   . Área = " + quadrado.calcularArea());

        System.out.println(
                "-> Retangulo: Base = " + retangulo.getValorBase() +
                " Altura = " + retangulo.getValorAltura());
        System.out.println("   . Perímetro = " + retangulo.calcularPerimetro());
        System.out.println("   . Área = " + retangulo.calcularArea());

        System.out.println("-> Círculo: Raio = " + circulo.getTamanhoRaio());
        System.out.println("   . Perímetro = " + circulo.calcularPerimetro());
        System.out.println("   . Área = " + circulo.calcularArea());

    }

}
