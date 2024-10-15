package servicios;
import java.util.List;

import entidades.Cliente;
import persistencia.ClienteDAO;

public class ClienteServicio {
    private ClienteDAO cd;

    public ClienteServicio() {
        this.cd = new ClienteDAO();
    }
    
    
    public void listarTodosLosClientes() throws Exception{
        try {
            List<Cliente> clientes = cd.listarClientes();

            for (Cliente cliente : clientes) {
                cliente.imprimirCliente();
            }

        } catch (Exception e) {
            throw e;
        }
    }

}
