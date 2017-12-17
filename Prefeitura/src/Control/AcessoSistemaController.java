package Control;
import DAO.AcessoSistemaDAO;
import Model.AcessoSistema;
import Model.Pessoa;
import Model.Sistema;
import java.util.List;
public class AcessoSistemaController extends Controller<AcessoSistema>{
    AcessoSistemaDAO dao=new AcessoSistemaDAO();

    public void insert(Sistema sistema,Pessoa pessoa){
        AcessoSistema acessoSistema=new AcessoSistema(sistema, pessoa);
        dao.insert(acessoSistema);
    }

    @Override
    public List<AcessoSistema> findAll() {
        return dao.findAll();
    }

    @Override
    public AcessoSistema getById(int id) {
        return dao.getById(id);
    }

    
}

