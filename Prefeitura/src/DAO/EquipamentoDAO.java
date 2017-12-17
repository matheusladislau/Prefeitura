package DAO;
import Model.Equipamento;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class EquipamentoDAO extends DAO<Equipamento>{
    
    @Override
    public List<Equipamento> findAll(){  
        String query="FROM Equipamento";
        conectar();
        Query q=sessao.createQuery(query);
        List resultList=q.list();
        sessao.close();
        return resultList;  
    }    
      
    public List<Equipamento> findByNameIp(String identificacao,String ip){  
        String query="FROM Equipamento "
                + "WHERE identificacaoEquipamento LIKE '%"+identificacao+"%' "
                + "AND ipEquipamento LIKE '%"+ip+"%'"
                
                ;
        sessao=conexao.openSession();
        Transaction t=sessao.beginTransaction(); 
        Query q=sessao.createQuery(query);
        List resultList=q.list();
        t.commit();
        sessao.close();
        return resultList;  
    }
    
    public List<Equipamento> findByNameIpSecretariaSetor(String identificacao,String ip,String secretaria,String setor){  
        String query="FROM Equipamento "
                + "WHERE identificacaoEquipamento LIKE '%"+identificacao+"%' "
                + "AND ipEquipamento LIKE '%"+ip+"%'"
                
                ;
        sessao=conexao.openSession();
        Transaction t=sessao.beginTransaction(); 
        Query q=sessao.createQuery(query);
        List resultList=q.list();
        t.commit();
        sessao.close();
        return resultList;  
    }
    
    public void update(Equipamento equipamento){
        Session session;
        session=conexao.openSession();
        Transaction t=session.beginTransaction();
        session.update(equipamento);
        t.commit();
        session.close();
    }
    
            
            
    
    @Override
    public Equipamento getById(int id){
        Equipamento equipamento=null;
        conectar();
        sessao.clear();
//        Transaction t=sessao.beginTransaction();
        sessao.get(Equipamento.class,id);
        equipamento=(Equipamento) sessao.load(Equipamento.class,id);
//        t.commit();
        sessao.close();
        return equipamento;
        
    }

//    public void remove(Equipamento equipamento){
//        Session session;
//        session=conexao.openSession();
//        Transaction t=session.beginTransaction();
//        session.delete(equipamento);
//        t.commit();
//        session.close();
//    }
    
    public void remove(Equipamento equipamento){
        
        super.remove(equipamento); //To change body of generated methods, choose Tools | Templates.
  
    }
        
        

//    private SessionFactory conexao;
    
//    public EquipamentoDAO(){
//        conexao=new Configuration().configure().buildSessionFactory();
//    }
//    public void inserirEquipamento(Equipamento equipamento){
//        Session session;
//        session=conexao.openSession();
//        Transaction t=session.beginTransaction();
//        session.save(equipamento);
//        t.commit();
//        session.close();
//    }
}
