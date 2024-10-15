package servicios;

import java.util.List;
import entidades.Familia;
import persistencia.FamiliaDAO;

public class FamiliaServicio {
    private FamiliaDAO fd;

    public FamiliaServicio() {
        this.fd = new FamiliaDAO();
    }

    public void listarTodasLasFamilias() throws Exception{
        try {
            List<Familia> familias = fd.listarTodasLasFamilias();

            for (Familia familia : familias) {
                familia.imprimirFamilia();
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void listarFamiliasConHijosMenores() throws Exception {
        try {
            List<Familia> familias = fd.buscarFamiliasConHijosMenores(); // Llama al DAO

            if (familias.isEmpty()) {
                System.out.println("No se encontraron familias con al menos 3 hijos y edad máxima inferior a 10 años.");
            } else {
                for (Familia familia : familias) {
                    familia.imprimirFamilia(); 
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void listarFamiliasConEmailHotmail() throws Exception {
        try {
            List<Familia> familias = fd.buscarFamiliasConEmailHotmail(); // Llama al DAO

            if (familias.isEmpty()) {
                System.out.println("No se encontraron familias con dirección de email Hotmail.");
            } else {
                for (Familia familia : familias) {
                    familia.imprimirFamilia(); 
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }
    

}
