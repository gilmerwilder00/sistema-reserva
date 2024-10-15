package persistencia;

import entidades.Comentario;
import java.util.ArrayList;
import java.util.List;

public class ComentarioDAO extends DAO {
    public List<Comentario> listarComentarios() throws Exception {
        String sql = "SELECT id_comentario, id_casa, comentario FROM comentarios";

        consultarDataBase(sql);

        List<Comentario> comentarios = new ArrayList<>();
        while (resultSet.next()) {
            Comentario comentario = new Comentario();
            comentario.setIdComentario(resultSet.getInt("id_comentario"));
            comentario.setIdCasa(resultSet.getInt("id_casa"));
            comentario.setComentario(resultSet.getString("comentario"));

            comentarios.add(comentario);
        }

        return comentarios;
    }
}

