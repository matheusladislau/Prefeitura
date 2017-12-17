package DAO;
import Model.TipoEquipamento;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class TipoEquipamentoDAO extends DAO<TipoEquipamento>{

    @Override
    public List<TipoEquipamento> findAll(){  
        String query="FROM TipoEquipamento";
        conectar();
        Query q=sessao.createQuery(query);
        List resultList=q.list();
        sessao.close();
        return resultList;  
    }  
    
    @Override
    public TipoEquipamento getById(int id){
        TipoEquipamento tipoEquipamento=null;
        conectar();
        sessao.get(TipoEquipamento.class,id);
        tipoEquipamento=(TipoEquipamento) sessao.load(TipoEquipamento.class,id);
        sessao.close();
        return tipoEquipamento;
    }
    
    
    
    
//    private SessionFactory conexao;
//    
//    public TipoEquipamentoDAO(){
//        conexao=new Configuration().configure().buildSessionFactory();
//    }
//    public void inserirTipoEquipamento(TipoEquipamento tipo){
//        Session session;
//        session=conexao.openSession();
//        Transaction t=session.beginTransaction();
//        session.save(tipo);
//        t.commit();
//        session.close();
//    }

    public void remove(TipoEquipamento tipo) {
        super.remove(tipo); //To change body of generated methods, choose Tools | Templates.
    }
}
