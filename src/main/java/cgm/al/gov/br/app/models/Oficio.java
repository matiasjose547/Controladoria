package cgm.al.gov.br.app.models;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "oficio")
@Data
public class Oficio extends AbstractEntity {
    private Integer numero;
    @Column(columnDefinition = "TEXT")
    private String processo;
    @Temporal(TemporalType.DATE)
    private Date data;
    private String objeto;
    @ManyToOne
    @JoinColumn(name = "unidadegestora_id")
    private UnidadeGestora orgaoDestino;
    @Column(name = "arquivo_anexo")
    @OneToMany(mappedBy="oficio", cascade = CascadeType.ALL)
    private List<FileAnexo> arquivoAnexo;

    public String getNumberFormat() {
        return String.format("%0" +3+"d", this.numero) +"/SMCI";
    }
}
