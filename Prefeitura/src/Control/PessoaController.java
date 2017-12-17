package Control;
import DAO.PessoaDAO;
import Model.Pessoa;
import Model.Setor;
import java.util.List;
public class PessoaController extends Controller<Pessoa>{
    PessoaDAO dao=new PessoaDAO();

    public void insert(String matricula,String nome,String cpf,Setor setor){
        Pessoa pessoa=new Pessoa(matricula, nome, cpf, setor);
        dao.insert(pessoa);
    }

    @Override
    public List<Pessoa> findAll() {
        return dao.findAll();
    }

    @Override
    public Pessoa getById(int id) {
        return dao.getById(id);
    }

//    public Pessoa getByName(String name){
//        return dao.findByName(name);
//    }
    
}
