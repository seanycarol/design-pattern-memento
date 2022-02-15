public class EntregaEstadoPendente implements EntregaEstado {

    private EntregaEstadoPendente() {};
    private static EntregaEstadoPendente instance = new EntregaEstadoPendente();
    public static EntregaEstadoPendente getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pendente";
    }
}
