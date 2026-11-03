package frete;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EntregaTest {

    @Test
    public void testFretePac() {
        Entrega entrega = new Entrega(new FretePac());
        assertEquals(8.0, entrega.calcularFrete(2.0), 0.001);
    }

    @Test
    public void testFreteSedex() {
        Entrega entrega = new Entrega(new FreteSedex());
        assertEquals(15.0, entrega.calcularFrete(2.0), 0.001);
    }

    @Test
    public void testFreteRetirada() {
        Entrega entrega = new Entrega(new FreteRetirada());
        assertEquals(0.0, entrega.calcularFrete(2.0), 0.001);
    }

    @Test
    public void testTrocaDeEstrategiaEmTempoDeExecucao() {
        Entrega entrega = new Entrega(new FretePac());
        assertEquals(8.0, entrega.calcularFrete(2.0), 0.001);

        entrega.setEstrategia(new FreteSedex());
        assertEquals(15.0, entrega.calcularFrete(2.0), 0.001);
    }

    @Test
    public void testPesoZeroPac() {
        Entrega entrega = new Entrega(new FretePac());
        assertEquals(5.0, entrega.calcularFrete(0.0), 0.001);
    }

    @Test
    public void testPesoZeroRetirada() {
        Entrega entrega = new Entrega(new FreteRetirada());
        assertEquals(0.0, entrega.calcularFrete(0.0), 0.001);
    }

    @Test
    public void testPesoFracionado() {
        Entrega entrega = new Entrega(new FretePac());
        assertEquals(7.25, entrega.calcularFrete(1.5), 0.001);
    }

    @Test
    public void testSedexMaisCaroQuePac() {
        double peso = 3.0;
        double pac = new Entrega(new FretePac()).calcularFrete(peso);
        double sedex = new Entrega(new FreteSedex()).calcularFrete(peso);
        assertTrue(sedex > pac);
    }
}
