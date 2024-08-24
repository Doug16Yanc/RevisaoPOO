package exercicio3;

import java.util.Comparator;

public class OrdenarPorArea implements Comparator<Retangulo> {
    @Override
    public int compare(Retangulo retangulo1, Retangulo retangulo2) {
        return Double.compare(retangulo1.calcularArea(), retangulo2.calcularArea());
    }
}
