package Control;
import DAO.DAO;
import DAO.EquipamentoDAO;
import Model.Equipamento;
import Model.Setor;
import Model.TipoEquipamento;
import java.util.List;
public class EquipamentoController extends Controller<Equipamento>{
    EquipamentoDAO dao=new EquipamentoDAO();


    public void insert(String identificacaoEquipamento,String ipEquipamento,TipoEquipamento tipoEquip,Setor setor){
        Equipamento equipamento=new Equipamento(identificacaoEquipamento, ipEquipamento, tipoEquip, setor);
        dao.insert(equipamento);
    }

    @Override
    public List<Equipamento> findAll() {
        return dao.findAll();
    }

    @Override
    public Equipamento getById(int id) {
        return dao.getById(id);
    }

    public void remove(Equipamento equipamento) {
        dao.remove(equipamento);
    }

    public List<Equipamento> findByNameIp(String identificacao, String ip) {
        return dao.findByNameIp(identificacao, ip);
    }

    public void update(Equipamento equipamento) {
        dao.update(equipamento);
    }
    
}

