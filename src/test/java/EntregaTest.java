import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaTest {
    @Test
    void deveArmazenarEstados() {
        Entrega entrega = new Entrega();
        entrega.setEstado(EntregaEstadoPendente.getInstance());
        entrega.setEstado(EntregaEstadoFinalizada.getInstance());
        assertEquals(2, entrega.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Entrega entrega = new Entrega();
        entrega.setEstado(EntregaEstadoPendente.getInstance());
        entrega.setEstado(EntregaEstadoFinalizada.getInstance());
        entrega.restauraEstado(0);
        assertEquals(EntregaEstadoPendente.getInstance(), entrega.getEstado());
    }

    @Test
    void deveRetornarEstado() {
        Entrega entrega = new Entrega();
        entrega.setEstado(EntregaEstadoPendente.getInstance());
        entrega.setEstado(EntregaEstadoCancelada.getInstance());
        entrega.setEstado(EntregaEstadoPendente.getInstance());
        entrega.setEstado(EntregaEstadoFinalizada.getInstance());
        entrega.restauraEstado(3);
        assertEquals(EntregaEstadoFinalizada.getInstance(), entrega.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Entrega entrega = new Entrega();
            entrega.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}