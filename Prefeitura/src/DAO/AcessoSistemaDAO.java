package DAO;
import Model.AcessoSistema;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class AcessoSistemaDAO extends DAO<AcessoSistema>{

    @Override
    public List<AcessoSistema> findAll(){  
        String query="FROM AcessoSistema";
        Session session;
        session=conexao.openSession();
        Transaction t=session.beginTransaction();
        Query q=session.createQuery(query);
        List resultList=q.list();
        session.close();
        return resultList;  
    }  
    
    
    
    @Override
    public AcessoSistema getById(int id){
        AcessoSistema pessoa=null;
//        sessao=conexao.openSession();
//        Transaction t=sessao.beginTransaction();
        conectar();
        sessao.get(AcessoSistema.class,id);
        pessoa=(AcessoSistema) sessao.load(AcessoSistema.class,id);
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
