package Exercicio05;

public class Quadrado extends Quadrilateros {

    //Atributos
    private double tamanhoLado;

    //Construtor
    public Quadrado(double tamanhoLado) {
        super(tamanhoLado, tamanhoLado, tamanhoLado, tamanhoLado);
        this.tamanhoLado = tamanhoLado;
    }

    //Getter and Setter
    public double getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    //Métodos
    @Override
    public double calcularPerimetro() {
        return super.calcularPerimetro();
    }

    @Override
    public double calcularArea() {

        return tamanhoLado * tamanhoLado;

    }
}
