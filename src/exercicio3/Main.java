package exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Retangulo> retangulos = new ArrayList<>();
        Main main = new Main();
        main.preencherVetor(retangulos);

        System.out.println("\nVamos expandir nosso vetor para mais cinco posições:\n");
        main.expandeVetor(retangulos);
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
        ordenarPorArea(retangulos);
    }

    private void expandeVetor(List<Retangulo> retangulos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Preencha os dados do retangulo");

        for (int i = 5; i < 10; i++) {
            System.out.println("Preencha a largura do retângulo " + (i + 1) + ": ");
            double largura = scanner.nextDouble();

            System.out.println("Preencha a altura deste mesmo retângulo: ");
            double altura = scanner.nextDouble();

            retangulos.add(new Retangulo(largura, altura));
        }
        ordenarPorArea(retangulos);
    }
    private void ordenarPorArea(List<Retangulo> retangulos) {
        Collections.sort(retangulos, new OrdenarPorArea());
        System.out.println("Retângulos ordenados por área:\n ");
        for (Retangulo retangulo : retangulos) {
            System.out.println("\n");
            System.out.println(retangulo.exibirInformacoes());
        }
    }
}
