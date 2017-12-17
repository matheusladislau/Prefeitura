package Model;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class AcessoSistema implements Serializable{
    
    @Id 
    @ManyToOne//(fetch = FetchType.EAGER)//, cascade = CascadeType.ALL)
    @JoinColumn(name = "idSistema", referencedColumnName="idSistema")
    Sistema sistema;

    @Id
    @ManyToOne//(fetch = FetchType.EAGER)//, cascade = CascadeType.ALL)
    @JoinColumn(name = "idPessoa", referencedColumnName="idPessoa")
    Pessoa pessoa;

    public AcessoSistema(){
        
    }
    
    public AcessoSistema(Sistema sistema,Pessoa pessoa){
        this.sistema=sistema;
        this.pessoa=pessoa;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    
    
}
