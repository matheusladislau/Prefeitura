package Control;
import DAO.SistemaDAO;
import Model.Sistema;
import java.util.List;
public class SistemaController extends Controller<Sistema>{
    SistemaDAO dao=new SistemaDAO();

    public void insert(String nome,String desenvolvedor){
        Sistema sistema=new Sistema(nome, desenvolvedor);
        dao.insert(sistema);
    }

    @Override
    public List<Sistema> findAll() {
        return dao.findAll();
    }

    @Override
    public Sistema getById(int id) {
        return dao.getById(id);
    }

}

