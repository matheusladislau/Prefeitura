package Control;
import DAO.TipoEquipamentoDAO;
import Model.TipoEquipamento;
import java.util.List;
public class TipoEquipamentoController extends Controller<TipoEquipamento>{
    TipoEquipamentoDAO dao=new TipoEquipamentoDAO();

    public void insert(String tipo){
        TipoEquipamento tipoEquipamento=new TipoEquipamento(tipo);
        dao.insert(tipoEquipamento);
    }

    @Override
    public List<TipoEquipamento> findAll() {
        return dao.findAll();
    }

    @Override
    public TipoEquipamento getById(int id) {
        return dao.getById(id);
    }

    
}

