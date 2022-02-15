public class EntregaEstadoFinalizada implements EntregaEstado {

    private EntregaEstadoFinalizada() {};
    private static EntregaEstadoFinalizada instance = new EntregaEstadoFinalizada();
    public static EntregaEstadoFinalizada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Finalizada";
    }
}
