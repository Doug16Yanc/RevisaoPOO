package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Retangulo> retangulos = new ArrayList<>();
        Main main = new Main();
        main.preencherVetor(retangulos);
        main.retornaMaiorArea(retangulos);
        main.retornaMenorPerimetro(retangulos);

    }

    private void preencherVetor(List<Retangulo> retangulos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Preencha os dados do retangulo : ");

        for (int i = 0; i < 5; i++) {
            System.out.println("Preencha a largura do retângulo " + (i + 1) + ": ");
            double largura = scanner.nextDouble();

            System.out.println("Preencha a altura deste mesmo retângulo: ");
            double altura = scanner.nextDouble();

            retangulos.add(new Retangulo(largura, altura));
        }
        exibirRetangulos(retangulos);
    }

    private void exibirRetangulos(List<Retangulo> retangulos) {
        for (Retangulo retangulo : retangulos) {
            System.out.println("\n");
            System.out.println(retangulo.exibirInformacoes());
        }
    }
    private void retornaMaiorArea(List<Retangulo> retangulos) {
        Retangulo maiorArea = retangulos.getFirst();
        for (Retangulo retangulo : retangulos) {
            if (retangulo.calcularArea() > maiorArea.calcularArea()) {
                maiorArea = retangulo;
            }
        }
        System.out.println("\nRetângulo com maior área:\n");
        System.out.println(maiorArea.exibirInformacoes());
    }

    private void retornaMenorPerimetro(List<Retangulo> retangulos) {
        Retangulo menorPerimetro = retangulos.getFirst();
        for (Retangulo retangulo : retangulos) {
            if (retangulo.calcularPerimetro() < menorPerimetro.calcularPerimetro()) {
                menorPerimetro = retangulo;
            }
        }
        System.out.println("\nRetângulo com menor perimetro:\n");
        System.out.println(menorPerimetro.exibirInformacoes());
    }
}