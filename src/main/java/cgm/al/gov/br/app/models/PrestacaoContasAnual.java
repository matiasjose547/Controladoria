package cgm.al.gov.br.app.models;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import java.util.Date;

@Data
@Entity
@Table(name = "prestacao_contas_anual")
public class PrestacaoContasAnual extends AbstractEntity {

    @Column(name = "numero_gestao")
    private String numeroGestao;

    @Temporal(TemporalType.DATE)
    private Date prazo;
    @Min(value = 0, message = "O valor minimo é 0")
    @Max(value = 100, message = "O valor máximo é 100")
    private Integer realizado;
    private String situacao;

    @Lob
    @Column(length = 512)
    @Length(message="Você atingiu o máximo de 512 caracteres.")
    private String apontamentos;

    @Column(name = "nome_documento")
    private String nomeDocumento;

    @ManyToOne
    @JoinColumn(name = "revisor_id")
    private Servidor revisor;

    @ManyToOne
    @JoinColumn(name = "responsavel_id")
    private Servidor responsavel;

    @ManyToOne
    @JoinColumn(name = "unidadegestora_id")
    private UnidadeGestora unidadeGestora;

    @Column(name = "nome_revisor")
    private String nomeRevisor;
    @Column(name = "nome_responsavel")
    private String nomeResponsavel;


    @Override
    public String toString() {
        return "PrestacaoContasAnual{" +
                "numeroGestao='" + numeroGestao + '\'' +
                ", realizado=" + realizado +
                ", prazo=" + prazo +
                ", situacao='" + situacao + '\'' +
                ", apontamentos='" + apontamentos + '\'' +
                ", nomeDocumento='" + nomeDocumento + '\'' +
                ", revisor=" + revisor +
                ", responsavel=" + responsavel +
                ", unidadeGestora=" + unidadeGestora +
                ", id=" + id +
                '}';
    }
}
