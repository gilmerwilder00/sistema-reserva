package persistencia;

import java.util.ArrayList;
import java.util.List;

import entidades.Cliente;

public class ClienteDAO extends DAO{
public List<Cliente> listarClientes() throws Exception {
        String sql = "SELECT id_cliente, nombre, calle, numero, codigo_postal, ciudad, pais, email FROM clientes";

        consultarDataBase(sql);

        List<Cliente> clientes = new ArrayList<>();
        while(resultSet.next()){
            Cliente cliente = new Cliente();
            cliente.setIdCliente(resultSet.getInt("id_cliente"));
            cliente.setNombre(resultSet.getString("nombre"));
            cliente.setCalle(resultSet.getString("calle"));
            cliente.setNumero(resultSet.getInt("numero"));
            cliente.setCodigoPostal(resultSet.getString("codigo_postal"));
            cliente.setCiudad(resultSet.getString("ciudad"));
            cliente.setPais(resultSet.getString("pais"));
            cliente.setEmail(resultSet.getString("email"));

            clientes.add(cliente);
        }  

        return clientes;
    }
}
