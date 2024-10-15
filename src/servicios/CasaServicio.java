package servicios;

import java.util.List;
import entidades.Casa;
import persistencia.CasaDAO;

public class CasaServicio {
    private CasaDAO cd;

    public CasaServicio() {
        this.cd = new CasaDAO();
    }
    
    public void listarTodasLasCasas() throws Exception {
        try {
            List<Casa> casas = cd.listarCasas();

            for (Casa casa : casas) {
                casa.imprimirCasa();
            }

        } catch (Exception e) {
            throw e;
        }
    }
}

