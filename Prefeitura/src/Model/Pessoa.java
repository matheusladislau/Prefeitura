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
public class Pessoa{
    @Id
    @GeneratedValue
    int idPessoa;
            
    @Column(length=5)
    String  matricula;
    
    @Column(length=100)
    String nomePessoa;

    @Column(length=14)
    String cpf;
    
    @ManyToOne//(fetch = FetchType.EAGER)//, cascade = CascadeType.REMOVE)
    @JoinColumn(name="idSetor", nullable = false)
    Setor setor;
    
    @OneToMany(
        mappedBy = "pessoa", 
        targetEntity = AcessoSistema.class)
        //fetch = FetchType.LAZY )
        //cascade = CascadeType.REMOVE)
    List<AcessoSistema> acessoSistema = new ArrayList<AcessoSistema>();
    
    public Pessoa(){   
    }
    
    public Pessoa(String matricula,String nome,String cpf,Setor setor){
        this.matricula=matricula;
        this.nomePessoa=nome;
        this.cpf=cpf;
        this.setor=setor;
    }

    public int getIdPessoa() {
        return this.idPessoa;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getNomePessoa() {
        return this.nomePessoa;
    }

    public String getCpf() {
        return this.cpf;
    }

    public Setor getSetor() {
        return setor;
    }

    public List<AcessoSistema> getAcessoSistema() {
        return acessoSistema;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void setAcessoSistema(List<AcessoSistema> acessoSistema) {
        this.acessoSistema = acessoSistema;
    }
    
    
    
}
