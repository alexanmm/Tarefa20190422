package Exercicio05;

public class Retangulo extends Quadrilateros{

    //Atributos
    private double valorBase;
    private double valorAltura;

    //Construtor
    public Retangulo(double valorBase, double valorAltura) {
        super(valorBase, valorBase, valorAltura, valorAltura);
        this.valorBase = valorBase;
        this.valorAltura = valorAltura;
    }

    //Getter and Setter
    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public double getValorAltura() {
        return valorAltura;
    }

    public void setValorAltura(double valorAltura) {
        this.valorAltura = valorAltura;
    }

    //Métodos
    @Override
    public double calcularPerimetro() {
        return super.calcularPerimetro();
    }

    @Override
    public double calcularArea() {
        return valorBase * valorAltura;
    }
}
