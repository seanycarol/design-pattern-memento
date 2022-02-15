public class EntregaEstadoCancelada implements EntregaEstado {

    private EntregaEstadoCancelada() {};
    private static EntregaEstadoCancelada instance = new EntregaEstadoCancelada();
    public static EntregaEstadoCancelada getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Cancelada";
    }
}
