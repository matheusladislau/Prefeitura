package Control;
import java.util.List;
public abstract class Controller<E>{
        
    
    public abstract List<E> findAll();
    
    public abstract E getById(int id);
    
}

