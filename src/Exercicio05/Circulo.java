package Exercicio05;

public class Circulo extends Quadrilateros{

    //Atributos
    private double tamanhoRaio;

    //Construtor
    public Circulo(double tamanhoRaio) {
        this.tamanhoRaio = tamanhoRaio;
    }

    //Getter and Setter
    public double getTamanhoRaio() {
        return tamanhoRaio;
    }

    public void setTamanhoRaio(double tamanhoRaio) {
        this.tamanhoRaio = tamanhoRaio;
    }

    //Métodos
    @Override
    public double calcularPerimetro() {

        //Perímetro do Círculo: 2 x PI x raio
        //PI = 3,1415926
        double valorPI = 3.1415926d;

        return 2 * valorPI * tamanhoRaio;
    }

    @Override
    public double calcularArea() {

        //Área do círculo: PI x raio ^ 2

        //PI = 3,1415926
        double valorPI = 3.1415926d;

        return valorPI * (tamanhoRaio * tamanhoRaio);

    }
}
