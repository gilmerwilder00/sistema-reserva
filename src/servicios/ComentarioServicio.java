package servicios;

import java.util.List;
import entidades.Comentario;
import persistencia.ComentarioDAO;

public class ComentarioServicio {
    private ComentarioDAO comentarioDAO;

    public ComentarioServicio() {
        this.comentarioDAO = new ComentarioDAO();
    }
    
    public void listarTodosLosComentarios() throws Exception {
        try {
            List<Comentario> comentarios = comentarioDAO.listarComentarios();

            for (Comentario comentario : comentarios) {
                comentario.imprimirComentario();
            }

        } catch (Exception e) {
            throw e;
        }
    }
}
