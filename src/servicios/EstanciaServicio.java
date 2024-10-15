package servicios;

import java.util.List;
import entidades.Estancia;
import persistencia.EstanciaDAO;

public class EstanciaServicio {
    private EstanciaDAO estanciaDAO;

    public EstanciaServicio() {
        this.estanciaDAO = new EstanciaDAO();
    }
    
    public void listarTodasLasEstancias() throws Exception {
        try {
            List<Estancia> estancias = estanciaDAO.listarEstancias();

            for (Estancia estancia : estancias) {
                estancia.imprimirEstancia();
            }

        } catch (Exception e) {
            throw e;
        }
    }
}
