package DAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public abstract class DAO<E>{
    SessionFactory conexao;  
    EntityManager entityManager;
    Session sessao;
    
    public DAO(){
        conexao=new Configuration().configure().buildSessionFactory();;
    }
    
    public abstract List<E> findAll();
    
    public abstract E getById(int id);
    
    public void conectar(){
        sessao=conexao.openSession();
        Transaction t=sessao.beginTransaction();   
    }
    
    public void insert(Object objeto){
        Session session;
        session=conexao.openSession();
        Transaction t=session.beginTransaction();
        session.save(objeto);
        t.commit();
        session.close();
    }

    public void remove(Object objeto){
        Session session;
        session=conexao.openSession();
        Transaction t=session.beginTransaction();
        session.delete(objeto);
        t.commit();
        session.close();       
    }
    
    
//        public abstract List<E> findAll();

    
//    public abstract Object getById(int id);
//        public abstract boolean removeById(final Long id);

    
}

//EntityManagerFactory factory=Persistence.createEntityManagerFactory("hibernate-example");