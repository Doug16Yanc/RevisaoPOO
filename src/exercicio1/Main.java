package exercicio1;

public class Main {
    public static void main(String[] args) {
        double largura = 12.87;
        double altura = 15.32;

        Retangulo retangulo = new Retangulo(largura, altura);
        System.out.println(retangulo.exibirInformacoes());
    }
}
