package DAO;
import Model.Setor;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class SetorDAO extends DAO<Setor>{

   @Override
    public List<Setor> findAll(){  
        String query="FROM Setor";
        conectar();
        Query q=sessao.createQuery(query);
        List resultList=q.list();
        sessao.close();
        return resultList;  
    }  
    
    public List<Setor> joinSecretaria(){  
        String query="FROM Setor NATURAL JOIN Secretaria";
        conectar();
        Query q=sessao.createQuery(query);
        List resultList=q.list();
        sessao.close();
        return resultList;  
    }  
    
    @Override
    public Setor getById(int id){
        Setor pessoa=null;
        conectar();
        sessao.get(Setor.class,id);
        pessoa=(Setor)sessao.load(Setor.class,id);
        sessao.close();
        return pessoa;
    }
    
}
