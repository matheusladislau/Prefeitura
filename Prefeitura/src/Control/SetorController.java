package Control;
import DAO.SetorDAO;
import Model.Secretaria;
import Model.Setor;
import java.util.List;
public class SetorController extends Controller<Setor>{
    SetorDAO dao=new SetorDAO();

    public void insert(String nome, String ip,String telefone,Secretaria secretaria){
        Setor setor=new Setor(nome, ip, telefone, secretaria);
        dao.insert(setor);
    }

    @Override
    public List<Setor> findAll() {
        return dao.findAll();
    }

    @Override
    public Setor getById(int id) {
        return dao.getById(id);
    }

    
}

