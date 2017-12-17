package Control;
import DAO.SecretariaDAO;
import Model.Secretaria;
import java.util.List;
public class SecretariaController extends Controller<Secretaria>{
    SecretariaDAO dao=new SecretariaDAO();

    public void insert(int codigo,String sigla,String nome){
        Secretaria secretaria=new Secretaria(codigo, sigla, nome);
        dao.insert(secretaria);
    }

    @Override
    public List<Secretaria> findAll() {
        return dao.findAll();
    }

    @Override
    public Secretaria getById(int id) {
        return dao.getById(id);
    }

    
}

