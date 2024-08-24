package exercicio1;

import java.text.DecimalFormat;

public class Retangulo {
    double largura;
    double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea() {
        return getAltura() * getLargura();
    }

    public double calcularPerimetro() {
        return 2 * (getLargura() + getAltura());
    }

    public String exibirInformacoes() {
        DecimalFormat formatted = new DecimalFormat("0.00");
        double area = calcularArea();
        double perimetro = calcularPerimetro();
        return "Largura : " + getLargura() +
                "\nAltura : " + getAltura() +
                "\nÁrea: " + formatted.format(area) +
                "\nPerímetro : " + formatted.format(perimetro);
    }
}
