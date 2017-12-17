package DAO;
import Model.Secretaria;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class SecretariaDAO extends DAO<Secretaria>{

    @Override
    public List<Secretaria> findAll(){  
        String query="FROM Secretaria";
        conectar();
        Query q=sessao.createQuery(query);
        List resultList=q.list();
        sessao.close();
        return resultList;  
    }  
    
    
    @Override
    public Secretaria getById(int id){
        Secretaria pessoa=null;
        conectar();
        sessao.get(Secretaria.class,id);
        pessoa=(Secretaria) sessao.load(Secretaria.class,id);
//        t.commit();
        sessao.close();
        return pessoa;
    }
    
//    private SessionFactory conexao;
//    
//    public SecretariaDAO(){
//        conexao=new Configuration().configure().buildSessionFactory();
//    }
//    public void inserirSecretaria(Secretaria secretaria){
//        Session session;
//        session=conexao.openSession();
//        Transaction t=session.beginTransaction();
//        session.save(secretaria);
//        t.commit();
//        session.close();
//    }
}
