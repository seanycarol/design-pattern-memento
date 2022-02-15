import java.util.ArrayList;
import java.util.List;

public class Entrega {
    private EntregaEstado estado;
    private List<EntregaEstado> memento = new ArrayList<>();

    public EntregaEstado getEstado() {
        return this.estado;
    }

    public void setEstado(EntregaEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<EntregaEstado> getEstados() {
        return this.memento;
    }
}
