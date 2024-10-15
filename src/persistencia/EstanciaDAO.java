package persistencia;

import entidades.Estancia;
import java.util.ArrayList;
import java.util.List;

public class EstanciaDAO extends DAO {
    public List<Estancia> listarEstancias() throws Exception {
        String sql = "SELECT id_estancia, id_cliente, id_casa, nombre_huesped, fecha_desde, fecha_hasta FROM estancias";

        consultarDataBase(sql);

        List<Estancia> estancias = new ArrayList<>();
        while (resultSet.next()) {
            Estancia estancia = new Estancia();
            estancia.setIdEstancia(resultSet.getInt("id_estancia"));
            estancia.setIdCliente(resultSet.getInt("id_cliente"));
            estancia.setIdCasa(resultSet.getInt("id_casa"));
            estancia.setNombreHuesped(resultSet.getString("nombre_huesped"));
            estancia.setFechaDesde(resultSet.getDate("fecha_desde"));
            estancia.setFechaHasta(resultSet.getDate("fecha_hasta"));

            estancias.add(estancia);
        }

        return estancias;
    }
}
