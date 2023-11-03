package cgm.al.gov.br.app.models;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "alerta")
public class Alerta extends AbstractEntity{
    private Integer numero;

    @Temporal(TemporalType.DATE)
    private Date data;

    private String processo;
    @Lob
    @Column(length = 512)
    @Length(message="Você atingiu o máximo de 512 caracteres.")
    private String objeto;

    @Column(name = "valor_observado")
    private BigDecimal valorObservado;

    @Column(name = "nome_documento")
    private String nomeDocumento;

    @ManyToOne
    @JoinColumn(name = "unidadegestora_id")
    private UnidadeGestora unidadeGestoraDestino;


    public void setProcesso(String processo) {
        this.processo = processo.toUpperCase();
    }

    public String getNumberFormat() {
//        return String.format("%0" +3+"d", this.numero);
        return String.format("%0" +3+"d", this.numero)+"/SMCI";
//        return String.format("%0" +3+"d", this.numero) +"/"+unidadeGestoraDestino.getSigla();
    }
}
