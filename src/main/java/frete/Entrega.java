package frete;

public class Entrega {

    private CalculoFrete estrategia;

    public Entrega(CalculoFrete estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(CalculoFrete estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularFrete(double peso) {
        return estrategia.calcular(peso);
    }
}
