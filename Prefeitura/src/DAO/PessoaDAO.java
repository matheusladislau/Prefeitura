package DAO;
import Model.Pessoa;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class PessoaDAO extends DAO<Pessoa>{

    @Override
    public List<Pessoa> findAll(){  
        String query="FROM Pessoa";
        Session session;
        session=conexao.openSession();
        Transaction t=session.beginTransaction();
        Query q=session.createQuery(query);
        List resultList=q.list();
        session.close();
        return resultList;  
    }  
    
    public List<Pessoa> findByName(String busca){  
        String query="FROM Pessoa WHERE nomePessoa LIKE '%"+busca+"%'";
        conectar();
        Query q=sessao.createQuery(query);
        List resultList=q.list();
        sessao.close();
        return resultList;  
    }  
    
    
    @Override
    public Pessoa getById(int id){
        Pessoa pessoa=null;
//        sessao=conexao.openSession();
//        Transaction t=sessao.beginTransaction();
        conectar();
        sessao.get(Pessoa.class,id);
        pessoa=(Pessoa) sessao.load(Pessoa.class,id);
//       t.commit();;
        sessao.close();
        return pessoa;
    }
    
    
    
//    private SessionFactory conectar;
//    
//    public TipoEquipamentoDAO(){
//        conectar=new Configuration().configure().buildSessionFactory();
//    }
//    public void inserirTipoEquipamento(TipoEquipamento tipo){
//        Session session;
//        session=conectar.openSession();
//        Transaction t=session.beginTransaction();
//        session.save(tipo);
//        t.commit();
//        session.close();
//    }
}
