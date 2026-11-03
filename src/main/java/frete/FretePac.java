package frete;

public class FretePac implements CalculoFrete {

    public double calcular(double peso) {
        return 5.0 + (1.5 * peso);
    }
}
