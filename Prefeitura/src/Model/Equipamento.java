package Model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
@Entity
@Table
public class Equipamento{
    @Id
    @GeneratedValue
    int idEquipamento;
    
    @Column(length = 10)
    String identificacaoEquipamento;
    
    @Column(length = 18)
    String ipEquipamento;
    
    @ManyToOne//(fetch = FetchType.EAGER)//, cascade = CascadeType.REMOVE)
    @JoinColumn(name="idTipoEquipamento", nullable = false)
    TipoEquipamento tipoEquipamento;
    
    @ManyToOne//(fetch = FetchType.EAGER)//, cascade = CascadeType.REMOVE)
    @JoinColumn(name="idSetor", nullable = false)
    Setor setor;
    
    
    public Equipamento(){      
    }
    
    public Equipamento(String identificacaoEquipamento,String ipEquipamento,TipoEquipamento tipoEquip,Setor setor){
        this.identificacaoEquipamento=identificacaoEquipamento;
        this.ipEquipamento=ipEquipamento;
        this.tipoEquipamento=tipoEquip;
        this.setor=setor;
    }
    
//GET
    public int getIdEquipamento(){
        return this.idEquipamento;
    }
    
    public String getIdentificacaoEquipamento(){
        return this.identificacaoEquipamento;
    }
    
    public String getIpEquipamento(){
        return this.ipEquipamento;
    }

    public TipoEquipamento getTipoEquipamento() {
        return tipoEquipamento;
    }

    public Setor getSetor() {
        return setor;
    }
    
    
    
//SET
    public void setIdEquipamento(int idEquipamento){
        this.idEquipamento=idEquipamento;
    }

    public void setIdentificacaoEquipamento(String identificacaoEquipamento){
        this.identificacaoEquipamento=identificacaoEquipamento;
    }

    public void setIpEquipamento(String ipEquipamento){
        this.ipEquipamento=ipEquipamento;
    }

    public void setTipoEquipamento(TipoEquipamento tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    
    
    
}
