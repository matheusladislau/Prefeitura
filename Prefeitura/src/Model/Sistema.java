package Model;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Sistema{
    @Id
    @GeneratedValue
    int idSistema;

    @Column(length = 100)
    String nomeSistema;

    @Column(length = 100)
    String desenvolvedor;
    
    @OneToMany(
        mappedBy = "sistema", 
        targetEntity = AcessoSistema.class)
//        fetch = FetchType.LAZY) 
//        cascade = CascadeType.ALL)
    List<AcessoSistema> acessoSistema = new ArrayList<AcessoSistema>();
    
    public Sistema(){   
    }
    
    public Sistema(String nome,String desenvolvedor){
        this.nomeSistema=nome;
        this.desenvolvedor=desenvolvedor;
    }

    public int getIdSistema() {
        return idSistema;
    }

    public String getNomeSistema() {
        return nomeSistema;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }
    
    
    
}
