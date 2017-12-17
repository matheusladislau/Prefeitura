package Model;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Secretaria{
    @Column
    @Id
    @GeneratedValue
    int idSecretaria;
    
    @Column
    int codigoSecretaria;
    
    @Column(length=100)
    String nomeSecretaria;
    
    @Column(length=10)
    String siglaSecretaria;
    
    @OneToMany(
        mappedBy = "secretaria", 
        targetEntity = Setor.class
//        fetch = FetchType.LAZY
        )
    List<Setor> setores=new ArrayList<Setor>();
//
    
    public Secretaria(){   
    }
    
    public Secretaria(int codigo,String sigla, String nome){
        this.codigoSecretaria=codigo;
        this.siglaSecretaria=sigla;
        this.nomeSecretaria=nome;
    }
    
//GET
    public int getCodigoSecretaria(){
        return codigoSecretaria;
    }

    public String getSiglaSecretaria(){
        return siglaSecretaria;
    }

    public String getNomeSecretaria(){
        return nomeSecretaria;
    }
    
//SET
    public void setCodigoSecretaria(int codigoSecretaria) {
        this.codigoSecretaria = codigoSecretaria;
    }

    public void setSiglaSecretaria(String siglaSecretaria) {
        this.siglaSecretaria = siglaSecretaria;
    }

    public void setNomeSecretaria(String nomeSecretaria) {
        this.nomeSecretaria = nomeSecretaria;
    } 
    
}
