package frete;

public class FreteSedex implements CalculoFrete {

    public double calcular(double peso) {
        return 10.0 + (2.5 * peso);
    }
}
