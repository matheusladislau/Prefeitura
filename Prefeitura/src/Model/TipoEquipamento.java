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
public class TipoEquipamento{
    @Id
    @GeneratedValue
    int idTipoEquipamento;
    
    @Column(length =30)
    String tipoEquipamento;    

    @OneToMany(
        mappedBy = "tipoEquipamento", 
        targetEntity = Equipamento.class) 
//        fetch = FetchType.LAZY) 
//        cascade = CascadeType.ALL)
    List<Equipamento> equipamentos=new ArrayList<Equipamento>();
//
    public TipoEquipamento(String tipo){
        this.tipoEquipamento=tipo;
    }
    
    public TipoEquipamento(){
        
    }
    
    
//GET
    public int getIdEquipamento() {
        return idTipoEquipamento;
    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }
   
//SET
    public void setIdEquipamento(int idEquipamento) {
        this.idTipoEquipamento=idEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }
}
