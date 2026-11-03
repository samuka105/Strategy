package frete;

public class Main {

    public static void main(String[] args) {
        double peso = 2.0;

        Entrega entrega = new Entrega(new FretePac());
        System.out.println("PAC: " + entrega.calcularFrete(peso));

        entrega.setEstrategia(new FreteSedex());
        System.out.println("Sedex: " + entrega.calcularFrete(peso));

        entrega.setEstrategia(new FreteRetirada());
        System.out.println("Retirada: " + entrega.calcularFrete(peso));
    }
}
