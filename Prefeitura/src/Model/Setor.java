package Model;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Setor{
    @Id
    @GeneratedValue
    int idSetor;
    
    @Column(length = 100)
    String nomeSetor;

    @Column(length = 18)
    String ipRede;
    
    @Column(length = 20)
    String telefone;
    
    @ManyToOne//(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="idSecretaria", nullable = false)
    Secretaria secretaria;
  
    
    @OneToMany(
        mappedBy = "setor", 
        targetEntity = Equipamento.class) 
//        fetch = FetchType.EAGER)
    List<Equipamento> equipamentos=new ArrayList<Equipamento>();

    @OneToMany(
        mappedBy = "setor", 
        targetEntity = Equipamento.class) 
//        fetch = FetchType.EAGER)
    List<Pessoa> pessoas=new ArrayList<Pessoa>();
    
    
    public Setor(){   
    }
    
    public Setor(String nome,String ip,String telefone,Secretaria secretaria){
        this.nomeSetor=nome;
        this.ipRede=ip;
        this.telefone=telefone;
        this.secretaria=secretaria;
    }

    public int getIdSetor() {
        return idSetor;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public String getIpRede() {
        return ipRede;
    }

    public String getTelefone() {
        return telefone;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }
    
    
}
