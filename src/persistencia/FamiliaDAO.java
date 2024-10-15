package persistencia;
import entidades.Familia;
import java.util.ArrayList;
import java.util.List;

public class FamiliaDAO extends DAO{
    public void guardarFamilia(Familia familia) throws Exception{
        if(familia == null){
            throw new Exception("El familia no puede ser nula");
        }

        String sql = "insert into familias (nombre, edad_minima, edad_maxima, num_hijos, email,id_casa_familia) values ('"
            +familia.getNombre() + "','"
            +familia.getEdadMinima()  + "','"
            +familia.getEdadMaxima()  + "','"
            +familia.getNumHijos() + "','"
            +familia.getEmail()  + "','"
            +familia.getIdCasaFamilia() + "')";
        
        insertarModificarEliminarDataBase(sql);    
    }

    public List<Familia> listarTodasLasFamilias() throws Exception{
        String sql = "select id_familia, nombre, edad_minima, edad_maxima, num_hijos, email, id_casa_familia from familias";

        consultarDataBase(sql);

        List<Familia> familias = new ArrayList<>();
        while(resultSet.next()){
            Familia familia = new Familia();
            familia.setIdFamilia(resultSet.getInt("id_familia"));
            familia.setNombre(resultSet.getString("nombre"));
            familia.setEdadMinima(resultSet.getInt("edad_minima"));
            familia.setEdadMaxima(resultSet.getInt("edad_maxima"));
            familia.setNumHijos(resultSet.getInt("num_hijos"));
            familia.setEmail(resultSet.getString("email"));
            familia.setIdCasaFamilia(resultSet.getInt("id_casa_familia"));

            familias.add(familia);
        }  

        return familias;
    }

    // Método para buscar familias con al menos 3 hijos y edad máxima inferior a 10 años
    public List<Familia> buscarFamiliasConHijosMenores() throws Exception {
        String sql = "SELECT * FROM familias WHERE num_hijos >= 3 AND edad_maxima < 10";
        consultarDataBase(sql);

        List<Familia> familias = new ArrayList<>();
        while (resultSet.next()) {
            Familia familia = new Familia();
            familia.setIdFamilia(resultSet.getInt("id_familia"));
            familia.setNombre(resultSet.getString("nombre"));
            familia.setEdadMinima(resultSet.getInt("edad_minima"));
            familia.setEdadMaxima(resultSet.getInt("edad_maxima"));
            familia.setNumHijos(resultSet.getInt("num_hijos"));
            familia.setEmail(resultSet.getString("email"));
            familia.setIdCasaFamilia(resultSet.getInt("id_casa_familia"));

            familias.add(familia);
        }

        return familias;
    }

    // Método para buscar familias con email Hotmail
    public List<Familia> buscarFamiliasConEmailHotmail() throws Exception {
        String sql = "SELECT * FROM familias WHERE email LIKE '%@hotmail.com'";
        consultarDataBase(sql);

        List<Familia> familias = new ArrayList<>();
        while (resultSet.next()) {
            Familia familia = new Familia();
            familia.setIdFamilia(resultSet.getInt("id_familia"));
            familia.setNombre(resultSet.getString("nombre"));
            familia.setEdadMinima(resultSet.getInt("edad_minima"));
            familia.setEdadMaxima(resultSet.getInt("edad_maxima"));
            familia.setNumHijos(resultSet.getInt("num_hijos"));
            familia.setEmail(resultSet.getString("email"));
            familia.setIdCasaFamilia(resultSet.getInt("id_casa_familia"));

            familias.add(familia);
        }

        return familias;
    }

    
}
