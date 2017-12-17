package DAO;
import Model.Sistema;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class SistemaDAO extends DAO<Sistema>{

    @Override
    public List<Sistema> findAll(){  
        String query="FROM Sistema";
        conectar();
        Query q=sessao.createQuery(query);
        List resultList=q.list();
        sessao.close();
        return resultList;  
    }  
    
    @Override
    public Sistema getById(int id){
        Sistema pessoa=null;
        conectar();
        sessao.get(Sistema.class,id);
        pessoa=(Sistema) sessao.load(Sistema.class,id);
        sessao.close();
        return pessoa;
    }
    
    
}
